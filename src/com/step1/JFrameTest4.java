package com.step1;

import javax.swing.JFrame;

public class JFrameTest4 {
	static JFrame jf = new JFrame();   //object 클래스의 기능 중 하나 JFrame
	public static void main(String[] args) {
		JFrameTest3 jft = new JFrameTest3();
		jft.jf.setTitle("I'm Test no3");
		jft.jf.setSize(500, 300);
		jft.jf.setVisible(true);

		jf.setTitle("I'm Test no4");
		jf.setSize(500, 300);
		jf.setVisible(true);
	}

}
