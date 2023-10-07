package com.week3;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeView {
	//선언부
	JFrame jf = new JFrame();
	Font font = new Font("돋움체",Font.BOLD,30);
	JLabel jlbTime = new JLabel("현재시간정보", JLabel.CENTER);
	TimeClient tc = new TimeClient(jlbTime);
	//생성자
	TimeView(){
		
	}
	public void initDisplay() {
		jlbTime.setFont(font);
		jf.add("North", jlbTime);
		jf.setSize(700, 400);
		jf.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		TimeView tv = new TimeView();
		tv.initDisplay();
	}

}
