package com.basic1;

public class C {
	int x;
	int y;
	public static void methodA() {
		int x = 5;
		System.out.println(x);
		C c = new C();
		System.out.println(c.x);
	}
	public void methodB() {
		int x = 5;
		System.out.println(x);
	}
	public static void main(String[] args) {
		C.methodA();
		C c = new C();
		c.methodB();
	}

}
