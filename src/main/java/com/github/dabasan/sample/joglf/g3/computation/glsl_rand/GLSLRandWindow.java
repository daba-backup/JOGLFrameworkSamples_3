package com.github.dabasan.sample.joglf.g3.computation.glsl_rand;

import com.github.dabasan.joglf.gl.shader.ShaderProgram;
import com.github.dabasan.joglf.gl.transferrer.FullscreenQuadTransferrer;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class GLSLRandWindow extends JOGLFWindow {
	private ShaderProgram program;
	private FullscreenQuadTransferrer transferrer;

	private long start;

	@Override
	public void Init() {
		program = new ShaderProgram("glsl_rand", "./Data/Shader/330/sample/glsl_rand/vshader.glsl",
				"./Data/Shader/330/sample/glsl_rand/fshader.glsl");
		transferrer = new FullscreenQuadTransferrer();

		start = System.currentTimeMillis();
	}

	@Override
	public void Update() {
		long cur = System.currentTimeMillis();
		long elp = cur - start;
		float t = elp / 1000.0f;

		program.Enable();
		program.SetUniform("t", t);
	}

	@Override
	public void Draw() {
		program.Enable();
		transferrer.Transfer();
	}
}
