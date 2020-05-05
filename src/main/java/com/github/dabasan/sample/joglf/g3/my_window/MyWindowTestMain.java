package com.github.dabasan.sample.joglf.g3.my_window;

import com.github.dabasan.joglf.gl.window.JOGLFWindowInterface;

public class MyWindowTestMain {
	public static void main(String[] args) {
		new MyWindowTestMain();
	}
	public MyWindowTestMain() {
		JOGLFWindowInterface window = new MyWindow();
		window.SetTitle("MyWindow");
	}
}
