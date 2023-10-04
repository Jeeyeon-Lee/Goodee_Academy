package com.step2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanel1_1 {
	int width = 400;
	int heigth = 400;
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTextField jtx = new JTextField();
	
	//2. 함수삽입
	void initDiplay() { //JFrame 필요
		jp.setBackground(Color.green);
		jf.add("Center", jp);
		jf.add("South", jtx);
		jf.setSize(width, heigth);
		jf.setVisible(true);
	}
	
	//1. 메인메소드 선언
	public static void main(String[] args) {

		JPanel1_1 jp1 = new JPanel1_1();
		jp1.initDiplay();
	}

}
