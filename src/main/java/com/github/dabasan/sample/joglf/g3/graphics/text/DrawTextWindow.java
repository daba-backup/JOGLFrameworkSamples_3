package com.github.dabasan.sample.joglf.g3.graphics.text;

import static com.github.dabasan.basis.coloru8.ColorU8Functions.*;

import java.awt.Toolkit;

import com.github.dabasan.joglf.gl.text.TextMgr;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class DrawTextWindow extends JOGLFWindow {
	private int dpi;

	@Override
	public void Init() {
		dpi = Toolkit.getDefaultToolkit().getScreenResolution();
	}

	@Override
	public void Draw() {
		String text = "The quick brown fox jumps over the lazy dog.";

		TextMgr.DrawText(5, 5, text, GetColorU8(1.0f, 0.0f, 0.0f, 1.0f), 8, dpi);
		TextMgr.DrawText(5, 30, text, GetColorU8(1.0f, 0.0f, 0.0f, 1.0f), 16, dpi);
		TextMgr.DrawText(5, 70, text, GetColorU8(1.0f, 0.0f, 0.0f, 1.0f), 32, dpi);

		TextMgr.DrawText(5, 150, text, GetColorU8(0.0f, 1.0f, 0.0f, 1.0f), 8, dpi);
		TextMgr.DrawText(5, 175, text, GetColorU8(0.0f, 1.0f, 0.0f, 1.0f), 16, dpi);
		TextMgr.DrawText(5, 215, text, GetColorU8(0.0f, 1.0f, 0.0f, 1.0f), 32, dpi);

		TextMgr.DrawText(5, 295, text, GetColorU8(0.0f, 0.0f, 1.0f, 1.0f), 8, dpi);
		TextMgr.DrawText(5, 320, text, GetColorU8(0.0f, 0.0f, 1.0f, 1.0f), 16, dpi);
		TextMgr.DrawText(5, 360, text, GetColorU8(0.0f, 0.0f, 1.0f, 1.0f), 32, dpi);
	}
}
