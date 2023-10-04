package com.step21;

import javax.swing.JFrame;

public class Frame1 {
	//파라미터에 변수가 있을 때의 모습
	JFrame jf = new JFrame();
	void initDisplay() {
		jf.setSize(800, 700);
		jf.setVisible(true);
	}
	void initDisplay(int width, int height) {
		jf.setSize(width, height);
		jf.setVisible(true);
	}
	void initDisplay(int width, int height, boolean isView) {
		jf.setSize(width, height);
		jf.setVisible(isView);
	}
	public static void main(String[] args) {
		Frame1 f = new Frame1();
		f.initDisplay(300, 500, true);//호출될 때 지역변수가 초기화 (call by value)
	}

}
