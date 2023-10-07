package com.week3;


import javax.swing.JFrame;
//창 만드는 메소드
class A{
	JFrame jf = new JFrame();
	public A() {
		B b = new B();
		System.out.println("A 호출");
		initDisplay(b);
	}
	public void initDisplay(B b) {
		int width  = b.i;
		int height = b.j;
		jf.setTitle(toString());
		jf.setSize(width,height);
		jf.setVisible(true);
	}
}
//합으로 구하는 평균 메소드
class B{
	int i = 300;
	int j = 500;
	boolean isView = true;

	public B() {
		System.out.println("B 호출");
	}
	public int hap(JFrame2 jf2) {
		int i = jf2.i;
		int j = jf2.j;
		int hap = i + j;
		return hap;
	}
}
public class JFrame2 {
	int i = 1;
	int j = 3;
	JFrame2(){
		A a = new A();
		System.out.println("A클래스 주소 호출"+a); 
		
	}
	public static void main(String[] args) {
		System.out.println("메인 호출");
		B b = new B();
		A a = new A();
		a.initDisplay(b);
		JFrame2 jf2 = new JFrame2();
		System.out.println(b.hap(jf2));
	}
}
