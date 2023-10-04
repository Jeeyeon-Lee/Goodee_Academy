package com.week2;

import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {
	//디폴트 생성자! 
	public JFrameTest1() {
		System.out.println("디폴트 생성자 호출");
		this.setSize(500,400);  //생성자 안에서는 인스턴스없이 메소드 사용 가능
		this.setVisible(true);
	}
	public void methodA() {
		System.out.println("methodA() 호출");
	}
	public void methodA(JFrameTest1 a) {
		System.out.println("methodA(JFrameTest1 a) 호출");
		System.out.println(a);   //생성된 객체의 주소번지 출력
	}
	public static void main(String[] args) {
		JFrameTest1 jft = new JFrameTest1();
		System.out.println(jft); //생성된 객체의 주소번지 출력
		jft.methodA(jft);        //생성된 객체의 주소번지 15번 줄로 올라감(파라미터값이 있는 메소드))
		//13번 줄 출력하기 위해서는??
		jft.methodA();
		//파라미터값 확인이 중요하다는 것을 다시 한 번 확인 가능!!
	}

}
