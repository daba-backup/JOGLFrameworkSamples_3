package com.github.dabasan.sample.joglf.g3.graphics.model;

import static com.github.dabasan.basis.vector.VectorFunctions.*;

import com.github.dabasan.joglf.gl.front.CameraFront;
import com.github.dabasan.joglf.gl.model.Model3DFunctions;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class DrawModelWindow extends JOGLFWindow {
	private int model_handle;

	@Override
	public void Init() {
		model_handle = Model3DFunctions.LoadModel("./Data/Model/BD1/Cube/cube.bd1");
	}

	@Override
	public void Update() {
		CameraFront.SetCameraPositionAndTarget_UpVecY(VGet(30.0f, 30.0f, 30.0f),
				VGet(0.0f, 0.0f, 0.0f));
	}

	@Override
	public void Draw() {
		Model3DFunctions.DrawModel(model_handle);
	}
}
