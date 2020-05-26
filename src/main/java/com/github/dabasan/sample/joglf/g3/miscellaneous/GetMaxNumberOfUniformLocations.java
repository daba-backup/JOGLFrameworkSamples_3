package com.github.dabasan.sample.joglf.g3.miscellaneous;

import static com.github.dabasan.joglf.gl.wrapper.GLWrapper.*;
import static com.jogamp.opengl.GL3ES3.*;

import java.nio.IntBuffer;

import com.github.dabasan.joglf.gl.window.JOGLFWindow;
import com.jogamp.common.nio.Buffers;

class GetMaxNumberOfUniformLocations extends JOGLFWindow {
	@Override
	public void Init() {
		IntBuffer buffer = Buffers.newDirectIntBuffer(1);
		glGetIntegerv(GL_MAX_UNIFORM_LOCATIONS, buffer);
		System.out.printf("Max number of uniform locations: %d\n", buffer.get(0));

		this.CloseWindow();
	}
}
