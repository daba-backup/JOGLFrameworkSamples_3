package com.github.dabasan.sample.joglf.g3.graphics.text;

import com.github.dabasan.joglf.gl.front.GLFront;
import com.github.dabasan.joglf.gl.wrapper.GLVersion;

public class TextMain {
	public static void main(String[] args) {
		new TextMain();
	}
	public TextMain() {
		GLFront.Setup(GLVersion.GL3bc);

		var window = new DrawTextWindow();
		window.SetTitle("Draw Text");
	}
}
