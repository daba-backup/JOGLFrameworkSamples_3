package com.github.dabasan.sample.joglf.g3.graphics.text;

import static com.github.dabasan.basis.coloru8.ColorU8Functions.*;

import java.awt.Toolkit;

import com.github.dabasan.joglf.gl.text.TextMgr;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class DrawTextWindow2 extends JOGLFWindow {
	int font_handle;
	int dpi;

	@Override
	public void Init() {
		font_handle = TextMgr.LoadFont("C:/Windows/Fonts/meiryo.ttc");
		dpi = Toolkit.getDefaultToolkit().getScreenResolution();
	}

	@Override
	public void Draw() {
		String text1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String text2 = "人はいさ心も知らずふるさとは花ぞ昔の香ににほひける";

		TextMgr.DrawTextWithFont(5, 20, text1, font_handle, GetColorU8(1.0f, 1.0f, 1.0f, 1.0f), 24,
				dpi);
		TextMgr.DrawTextWithFont(5, 70, text2, font_handle, GetColorU8(1.0f, 1.0f, 1.0f, 1.0f), 24,
				dpi);
	}
}
