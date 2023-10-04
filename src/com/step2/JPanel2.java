package com.step2;

import javax.swing.JFrame;

public class JPanel2 {
	JFrame jf= new JFrame(); //자바 자체 
	public void initDisplay(int width, int height) {
		jf.setSize(width, height);
		jf.setVisible(true);
	}
	public void initDisplay(int width, int height, boolean isVew) {//같은 이름 메소드는 파라미터 개수 또는 타입이 달라야 선언 가능
		jf.setSize(width, height);
		jf.setVisible(isVew);
	}
	public static void main(String[] args) {
		JPanel2 jp1 = new JPanel2();
		//창크기 정수 두 개를 넣는 함수 initDisplay 사용희망
		jp1.initDisplay(500, 300); //3개의 파라미터를 넣어도 기능함.
		jp1.initDisplay(100,10,true); //지금은 인스턴스화를 하나 했기 때문에 창 하나만.. 두개를 띄우려면 한번 더 객체화
		JPanel2 jp2 = new JPanel2();//해결내용 기입->다른 이름의 객체가 되지 왜??
		jp2.initDisplay(500, 300); //3개의 파라미터를 넣어도 기능함.
		
		
		
	}

}
