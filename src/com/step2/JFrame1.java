package com.step2;

import javax.swing.JFrame;

public class JFrame1 {

	public static void main(String[] args) {
		JFrame jf1 = new JFrame(); //첫번째 인스턴스화
		jf1.setTitle("first");
		jf1.setSize(300, 500);
		jf1.setVisible(true);
		JFrame jf2 = new JFrame(); //두번째 인스턴스화
		jf2.setTitle("second");
		jf2.setSize(500, 300);
		jf2.setVisible(true);
		//두개의 창이 뜸
	}

}
