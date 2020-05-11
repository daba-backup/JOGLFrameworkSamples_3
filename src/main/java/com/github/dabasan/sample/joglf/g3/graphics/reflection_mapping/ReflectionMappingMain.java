package com.github.dabasan.sample.joglf.g3.graphics.reflection_mapping;

import com.github.dabasan.joglf.gl.window.JOGLFWindowInterface;

public class ReflectionMappingMain {
	public static void main(String[] args) {
		new ReflectionMappingMain();
	}
	public ReflectionMappingMain() {
		JOGLFWindowInterface window = new ReflectionMappingTestWindow();
		window.SetTitle("Reflection Mapping");
	}
}
