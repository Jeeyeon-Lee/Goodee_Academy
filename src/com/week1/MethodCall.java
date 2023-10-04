package com.week1;

public class MethodCall {
	void methodA(){
		System.out.println("methodA!!");
	}
	void methodB() {
		System.out.println("methodB!!");
	}
	public static void main(String[] args) {
		MethodCall mc = new MethodCall();
		mc.methodA();
		mc.methodB();
	}

}
