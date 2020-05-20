package com.github.dabasan.sample.joglf.g3.graphics.phong_shading;

import com.github.dabasan.joglf.gl.front.GLFront;
import com.github.dabasan.joglf.gl.wrapper.GLVersion;

public class PhongShadingTestMain {
	public static void main(String[] args) {
		new PhongShadingTestMain();
	}
	public PhongShadingTestMain() {
		GLFront.Setup(GLVersion.GL3);

		var window = new PhongShadingTestWindow();
		window.SetExitProcessWhenDestroyed();
	}
}
