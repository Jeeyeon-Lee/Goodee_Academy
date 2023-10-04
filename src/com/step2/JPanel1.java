package com.step2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanel1 {
	int width = 300;
	int height = 500;
	boolean isView = false;

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTextField jtf =new JTextField("");
	//화면을 그리는 메소드 선언
	public void initDisplay() {
		jp.setBackground(Color.green);
		jp.setBackground(Color.red); //배경색 빨강으로 초기화
		jf.add("Center", jp);
		jf.add("South", jtf);
		jf.setSize(width, height); //위에 저장된 값이 파라미터 자리로 입력됨.
		jf.setVisible(isView);
	}
	public static void main(String[] args) {
		//initDisplay() 메소드를 호출하기 -> 객체 인스턴스화
		JPanel1 jp1 = new JPanel1();
		jp1.isView = true;
		jp1.initDisplay();
		
	}

}
