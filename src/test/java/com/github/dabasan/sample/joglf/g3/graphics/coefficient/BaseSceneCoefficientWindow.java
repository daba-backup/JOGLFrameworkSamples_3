package com.github.dabasan.sample.joglf.g3.graphics.coefficient;

import static com.github.dabasan.basis.coloru8.ColorU8Functions.*;
import static com.github.dabasan.basis.vector.VectorFunctions.*;

import com.github.dabasan.joglf.gl.front.CameraFront;
import com.github.dabasan.joglf.gl.front.FogFront;
import com.github.dabasan.joglf.gl.model.Model3DFunctions;
import com.github.dabasan.joglf.gl.shader.ShaderProgram;
import com.github.dabasan.joglf.gl.util.screen.Screen;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class BaseSceneCoefficientWindow extends JOGLFWindow {
	private int model_handle;
	private Screen screen;
	private ShaderProgram program;

	@Override
	public void Init() {
		final float SCALE = 1.7f / 20.0f;
		model_handle = Model3DFunctions.LoadModel("./Data/Model/BD1/LeisureHouse/map.bd1");
		Model3DFunctions.RescaleModel(model_handle, VGet(SCALE, SCALE, SCALE));

		screen = new Screen(this.GetWidth(), this.GetHeight());
		program = new ShaderProgram("texture");

		FogFront.SetFogColor(GetColorU8(1.0f, 0.0f, 0.0f, 1.0f));
		FogFront.SetFogStartEnd(30.0f, 50.0f);
	}

	@Override
	public void Update() {
		CameraFront.SetCameraPositionAndTarget_UpVecY(VGet(25.0f, 25.0f, 25.0f),
				VGet(0.0f, 0.0f, 0.0f));
	}

	@Override
	public void Draw() {
		program.Enable();
		program.SetTexture("texture_sampler", 0, -1);
		screen.Enable();
		screen.Clear();
		Model3DFunctions.TransferModel(model_handle);
		screen.Disable();
		program.Disable();

		screen.Draw(0, 0, this.GetWidth(), this.GetHeight());
	}
}
