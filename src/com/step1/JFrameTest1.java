package com.step1;

import javax.swing.JFrame;

public class JFrameTest1 {
	JFrame jf = new JFrame();   //object 클래스의 기능 중 하나 JFrame
	
	public void initDisplay() {
		jf.setTitle("window");
		jf.setSize(500,300);
		jf.setVisible(true);
		jf.setVisible(false);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		JFrameTest1 jft = new JFrameTest1();
		jft.initDisplay();
	}

}
