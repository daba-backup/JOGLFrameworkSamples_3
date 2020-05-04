package com.github.dabasan.sample.joglf.g3.my_window;

import com.github.dabasan.joglf.gl.front.GLFront;
import com.github.dabasan.joglf.gl.window.JOGLFWindowInterface;
import com.github.dabasan.joglf.gl.wrapper.GLVersion;

public class MyWindowTestMain {
	public static void main(String[] args) {
		new MyWindowTestMain();
	}
	public MyWindowTestMain() {
		GLFront.Setup(GLVersion.GL3);

		JOGLFWindowInterface window = new MyWindow();
		window.SetTitle("MyWindow");
		window.SetExitProcessWhenDestroyed();
	}
}
