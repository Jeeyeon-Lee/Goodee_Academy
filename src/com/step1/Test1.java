package com.step1;

public class Test1 {
	int i = 2;
	public void methodA() {
		System.out.println("methodA call");
		int i = 5;
		System.out.println("i--> " + i);
		int j;
		j = 4;
		System.out.println("j--> " + j);
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.methodA();
	}
}
