package com.github.dabasan.sample.joglf.g3.graphics.phong_shading;

import static com.github.dabasan.basis.vector.VectorFunctions.*;

import com.github.dabasan.joglf.gl.front.CameraFront;
import com.github.dabasan.joglf.gl.front.FogFront;
import com.github.dabasan.joglf.gl.front.LightingFront;
import com.github.dabasan.joglf.gl.model.Model3DFunctions;
import com.github.dabasan.joglf.gl.shader.ShaderProgram;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class PhongShadingTestWindow extends JOGLFWindow {
	private int model_handle;

	@Override
	public void Init() {
		model_handle = Model3DFunctions.LoadModel("./Data/Model/BD1/map2/temp.bd1");
		Model3DFunctions.RescaleModel(model_handle, VGet(0.1f, 0.1f, 0.1f));

		ShaderProgram texture2_program = new ShaderProgram("texture2");
		Model3DFunctions.RemoveAllPrograms(model_handle);
		Model3DFunctions.AddProgram(model_handle, texture2_program);

		CameraFront.AddProgram(texture2_program);
		FogFront.AddProgram(texture2_program);
		LightingFront.AddProgram(texture2_program);
	}

	@Override
	public void Draw() {
		Model3DFunctions.DrawModel(model_handle);
	}
}
