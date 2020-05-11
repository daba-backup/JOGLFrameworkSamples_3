package com.github.dabasan.sample.joglf.g3.audio.sound;

import com.github.dabasan.joglf.al.player.mp3.MP3Player;
import com.github.dabasan.joglf.gl.input.keyboard.KeyboardEnum;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class MP3TestWindow extends JOGLFWindow {
	private int sound_handle;

	@Override
	public void Init() {
		sound_handle = MP3Player.LoadSound("./Data/Sound/test.mp3");
		MP3Player.PlaySound(sound_handle);
	}

	@Override
	public void Update() {
		if (this.GetKeyboardPressingCount(KeyboardEnum.KEY_ESCAPE) == 1) {
			MP3Player.DeleteSound(sound_handle);
		}
	}
}
