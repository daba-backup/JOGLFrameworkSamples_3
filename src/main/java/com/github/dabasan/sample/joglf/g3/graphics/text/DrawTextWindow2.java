package com.github.dabasan.sample.joglf.g3.graphics.text;

import static com.github.dabasan.basis.coloru8.ColorU8Functions.*;

import java.awt.Toolkit;

import com.github.dabasan.joglf.gl.text.TextMgr;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;

class DrawTextWindow2 extends JOGLFWindow {
	int meiryo_handle;
	int batang_handle;
	int fangsong_handle;

	int dpi;

	@Override
	public void Init() {
		meiryo_handle = TextMgr.LoadFont("C:/Windows/Fonts/meiryo.ttc");
		batang_handle = TextMgr.LoadFont("C:/Windows/Fonts/batang.ttc");
		fangsong_handle = TextMgr.LoadFont("C:/Windows/Fonts/simfang.ttf");

		dpi = Toolkit.getDefaultToolkit().getScreenResolution();
	}

	@Override
	public void Draw() {
		String text1 = "В чащах юга жил бы цитрус? Да, но фальшивый экземпляр!";
		String text2 = "人はいさ心も知らずふるさとは花ぞ昔の香ににほひける";
		String text3 = "한글 폰트 테스트";
		String text4 = "永和九年，岁在癸丑，暮春之初，会于会稽山阴之兰亭，修禊事也。";

		TextMgr.DrawTextWithFont(5, 20, text1, meiryo_handle, GetColorU8(1.0f, 1.0f, 1.0f, 1.0f),
				24, dpi);
		TextMgr.DrawTextWithFont(5, 70, text2, meiryo_handle, GetColorU8(1.0f, 1.0f, 1.0f, 1.0f),
				24, dpi);
		TextMgr.DrawTextWithFont(5, 120, text3, batang_handle, GetColorU8(1.0f, 1.0f, 1.0f, 1.0f),
				24, dpi);
		TextMgr.DrawTextWithFont(5, 170, text4, fangsong_handle, GetColorU8(1.0f, 1.0f, 1.0f, 1.0f),
				24, dpi);
	}
}
