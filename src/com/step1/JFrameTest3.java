package com.step1;

import javax.swing.JFrame;

public class JFrameTest3 {
	static JFrame jf = new JFrame();   //object 클래스의 기능 중 하나 JFrame
	
	public static void main(String[] args) {
		jf.setTitle("window"); //static이기 때문에 인스턴스화 필요x
		jf.setSize(500, 300);
		jf.setVisible(true);
		jf.setVisible(false);
		jf.setVisible(true);
	}

}
