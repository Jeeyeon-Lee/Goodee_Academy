package com.step1;

import javax.swing.JFrame;

public class JFrameTest5 {
	JFrame jf = new JFrame();   //object 클래스의 기능 중 하나 JFrame
	public static void main(String[] args) {
		JFrameTest5 jft = new JFrameTest5();
		jft.jf.setTitle("I'm Test no5");
		jft.jf.setSize(500, 300);
		jft.jf.setVisible(true);
	}

}
