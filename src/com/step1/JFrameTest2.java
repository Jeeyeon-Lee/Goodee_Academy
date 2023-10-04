package com.step1;

import javax.swing.JFrame;

public class JFrameTest2 {
	JFrame jf = new JFrame();   //object 클래스의 기능 중 하나 JFrame
	
	public void initDisplay() {
		int i = 300;
		int j = 500;
		jf.setTitle("window");
		jf.setSize(i,j);
		jf.setVisible(true);
		jf.setVisible(false);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		JFrameTest2 jft = new JFrameTest2();
		jft.initDisplay();
	}

}
