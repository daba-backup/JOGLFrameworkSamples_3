package com.github.dabasan.sample.joglf.g3.computation.glsl_rand;

import com.github.dabasan.joglf.gl.window.JOGLFWindowInterface;

public class GLSLRandMain {
	public static void main(String[] args) {
		new GLSLRandMain();
	}
	public GLSLRandMain() {
		JOGLFWindowInterface window = new GLSLRandTestWindow();
		window.SetTitle("GLSL Rand");
	}
}
