package com.week3;

import javax.swing.JFrame;

public class JFrame1 {
	int width;
	int height;
	JFrame jf = new JFrame();
	//생성자1(리턴타입x)
	JFrame1(){
		System.out.println("JFrame1() 디폴트 생성자 호출");
		jf = new JFrame();
		System.out.println("지변 width : " + width + ", 지변 height : " + height+"/전변 width : " + this.width + ", 전변 height : " + this.height);
		jf.setTitle("JFrame1()");
	}
	//생성자2(리턴타입o)
	JFrame1(int width){
		System.out.println("JFrame1(int width) 생성자 호출");
		jf = new JFrame();
		System.out.println("지변 width : " + width + ", 지변 height : " + height+"/전변 width : " + this.width + ", 전변 height : " + this.height);
		this.width = width;
		height = 500;
		String title = "JFrame1(int width)";
		jf.setTitle(title);
	}
	//생성자3(리턴타입o)
	JFrame1(int width, int height){
		System.out.println("JFrame1(int width, int height) 생성자 호출");
		jf = new JFrame();
		System.out.println("지변 width : " + width + ", 지변 height : " + height+"/전변 width : " + this.width + ", 전변 height : " + this.height);
		this.width  = width;
		this.height = height;
		height = 500;
		String title = "JFrame1(int width, int height)";
		jf.setTitle(title);
	}
	public void initDisplay() {
		jf.setSize(width,height);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame1 jf1 = new JFrame1();
		jf1.initDisplay();
		jf1 = new JFrame1(600);
		jf1.initDisplay();
		jf1 = new JFrame1(600, 700);
		jf1.initDisplay();
		
	}

}
