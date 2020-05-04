package com.github.dabasan.sample.joglf.g3.my_window;

import static com.github.dabasan.basis.coloru8.ColorU8Functions.*;
import static com.github.dabasan.basis.vector.VectorFunctions.*;

import com.github.dabasan.joglf.gl.draw.DrawFunctions3D;
import com.github.dabasan.joglf.gl.front.CameraFront;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class MyWindow extends JOGLFWindow {
	@Override
	public void Init() {
		System.out.println("Init");
	}
	@Override
	public void Reshape(int x, int y, int width, int height) {
		System.out.println("Reshape");
	}
	@Override
	public void Update() {
		CameraFront.SetCameraPositionAndTarget_UpVecY(VGet(30.0f, 30.0f, 30.0f),
				VGet(0.0f, 0.0f, 0.0f));
	}
	@Override
	public void Draw() {
		DrawFunctions3D.DrawAxes(100.0f);
		DrawFunctions3D.DrawSphere3D(VGet(0.0f, 0.0f, 0.0f), 10.0f, 32, 32,
				GetColorU8(1.0f, 1.0f, 1.0f, 1.0f));
	}
	@Override
	public void Dispose() {
		System.out.println("Dispose");
	}
}
