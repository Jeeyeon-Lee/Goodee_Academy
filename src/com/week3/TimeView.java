package com.week3;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeView {
	//선언부
	JFrame jf = new JFrame();
	Font font = new Font("돋움체",Font.BOLD,30);
	JLabel jlbTime = new JLabel("현재시간정보", JLabel.CENTER);
	TimeClient tc = new TimeClient(this);  //this로 TC에 이 클래스를 넘겨줌.
	//생성자
	TimeView(){	}
	//사용자 메소드
	public void initDisplay() {
		System.out.println("TimeView : "+jlbTime);
		tc.start();
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
