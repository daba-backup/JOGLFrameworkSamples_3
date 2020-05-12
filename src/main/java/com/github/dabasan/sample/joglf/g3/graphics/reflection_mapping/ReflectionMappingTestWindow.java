package com.github.dabasan.sample.joglf.g3.graphics.reflection_mapping;

import static com.github.dabasan.basis.vector.VectorFunctions.*;
import static com.github.dabasan.joglf.gl.wrapper.GLWrapper.*;
import static com.jogamp.opengl.GL.*;

import com.github.dabasan.joglf.gl.draw.DrawFunctions3D;
import com.github.dabasan.joglf.gl.front.CameraFront;
import com.github.dabasan.joglf.gl.input.keyboard.KeyboardEnum;
import com.github.dabasan.joglf.gl.input.mouse.MouseEnum;
import com.github.dabasan.joglf.gl.model.Model3DFunctions;
import com.github.dabasan.joglf.gl.shader.ShaderProgram;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;
import com.github.dabasan.tool.MathFunctions;

class ReflectionMappingTestWindow extends JOGLFWindow {
	private ShaderProgram program;
	private SkyboxMgr skybox_mgr;

	private int model_handle;

	private FreeCamera camera;

	@Override
	public void Init() {
		program = new ShaderProgram("reflection_mapping",
				"./Data/Shader/330/addon/reflection_mapping/vshader.glsl",
				"./Data/Shader/330/addon/reflection_mapping/fshader.glsl");
		CameraFront.AddProgram(program);
		skybox_mgr = new SkyboxMgr();
		skybox_mgr.Init();

		model_handle = Model3DFunctions
				.LoadModel("./Data/Model/OBJ/Teapot/teapot.obj");

		final float INITIAL_V_ROT = MathFunctions.DegToRad(-45.0f);
		final float INITIAL_H_ROT = MathFunctions.DegToRad(135.0f);
		camera = new FreeCamera();
		camera.SetPosition(VGet(50.0f, 50.0f, 50.0f));
		camera.SetRotation(INITIAL_V_ROT, INITIAL_H_ROT);

		glDisable(GL_CULL_FACE);
	}

	@Override
	public void Update() {
		int front = this.GetKeyboardPressingCount(KeyboardEnum.KEY_W);
		int back = this.GetKeyboardPressingCount(KeyboardEnum.KEY_S);
		int right = this.GetKeyboardPressingCount(KeyboardEnum.KEY_D);
		int left = this.GetKeyboardPressingCount(KeyboardEnum.KEY_A);
		int diff_x, diff_y;
		if (this.GetMousePressingCount(MouseEnum.MOUSE_MIDDLE) > 0) {
			diff_x = this.GetCursorDiffX();
			diff_y = this.GetCursorDiffY();
		} else {
			diff_x = 0;
			diff_y = 0;
		}

		camera.Translate(front, back, right, left);
		camera.Rotate(diff_x, diff_y);
		camera.Update();
	}

	@Override
	public void Draw() {
		glDisable(GL_DEPTH_TEST);
		skybox_mgr.DrawSkybox();
		glEnable(GL_DEPTH_TEST);

		program.Enable();
		skybox_mgr.SetCubemap(program, "cubemap", 1);
		Model3DFunctions.DrawModelWithProgram(model_handle, program,
				"texture_sampler", 0);
		program.Disable();

		DrawFunctions3D.DrawAxes(100.0f);
	}
}
