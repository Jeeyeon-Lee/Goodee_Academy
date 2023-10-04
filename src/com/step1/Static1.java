package com.step1;

public class Static1 {
	int i = 1;
	static int j = 2;
	public double d = 0.5; 
	public void methodA() {
		System.out.println("methodA call succeed");
	}
	public static void methodB() {
		System.out.println("methodB call succeed");
	}
	public static void main(String[] args) {
		Static1 s = new Static1();
		System.out.println(s.i); //1 (인스턴스 변수 있어야 호출 가능)
		System.out.println(j);   //2 (인스턴스 변수 없이 호출 가능)
		System.out.println(s.d); //0.5
		s.methodA();             //인스턴스 변수 필요
		methodB();               //인스턴스 변수 불필요
	}

}
