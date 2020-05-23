package com.github.dabasan.sample.joglf.g3.audio.sound;

public class SoundMain {
	public static void main(String[] args) {
		new SoundMain();
	}
	public SoundMain() {
		var window = new Play3DSoundWindow();
		window.SetExitProcessWhenDestroyed();
	}
}
