package com.github.dabasan.sample.joglf.g3.audio.sound;

import com.github.dabasan.joglf.gl.front.GLFront;
import com.github.dabasan.joglf.gl.window.JOGLFWindowInterface;
import com.github.dabasan.joglf.gl.wrapper.GLVersion;

public class SoundTestMain {
	public static void main(String[] args) {
		new SoundTestMain();
	}
	public SoundTestMain() {
		GLFront.Setup(GLVersion.GL3);

		JOGLFWindowInterface window = new Sound3DTestWindow();
		window.SetExitProcessWhenDestroyed();
	}
}
