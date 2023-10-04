package com.step2;

import javax.swing.JFrame;

public class JFrame2 {

	public static void main(String[] args) {
		JFrame jf1 = new JFrame();
		jf1 = null;
		jf1 = new JFrame();
		jf1.setTitle("첫번째");
		jf1.setSize(300,500);
		jf1.setSize(500,300);
		jf1.setVisible(true);
/*
 * 8번에서 생성, 9번에서 초기화, 10번에서 새롭게 인스턴스화하여서 아래 내용은 서로 겹쳐지는 것
 * 따라서 마지막 값인 500,300사이즈로 출력 한개만 진행
 */
	}
}
