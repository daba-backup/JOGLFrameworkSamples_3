package com.github.dabasan.sample.joglf.g3.audio.sound;

public class SoundTestMain {
	public static void main(String[] args) {
		new SoundTestMain();
	}
	public SoundTestMain() {
		var window = new Sound3DTestWindow();
		window.SetExitProcessWhenDestroyed();
	}
}
