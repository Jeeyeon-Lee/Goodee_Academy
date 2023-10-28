package com_2.step_2;

public class Static1 {
	int i = 1;
	static int j=2;
	public double d =0.5;
	public void methodA() {
		System.out.println("methodA 호출");
	}
	public static void methodB() {
		System.out.println("methodB 호출");
	}
	public static void main(String[] args) {
		Static1 s = new Static1();
		s.i = 30;
		System.out.println(s.i);
		//static은 인스턴스화 변수 없이도 호출 가능
		s.methodA();
		methodB();
		System.out.println(j);
		j=10;
		System.out.println(s.j); 
		s = new Static1();
		System.out.println(s.i); //i는 static 아님, 새로운 생성에는 기본값으로 다시 변경됨 
		System.out.println(j);   //static은 공유하기 때문에 변경된 전변 유지
	}
}
