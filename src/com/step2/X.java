package com.step2;
//같은 이름의 메소드 여러개 구현 가능 -> 메소드 오버로딩
//다만 파라미터의 갯수 또는 타입이 달라야 한다.(or)
public class X {
	void methodA() {
		System.out.println("methodA 호출 성공!");
	}
	void methodA(int i) {
		System.out.println("methodA(int i) 호출 성공!");
	}
	void methodA(int i, int j) {
		System.out.println("methodA(int i, int j) 호출 성공!");
	}
	void methodA(int i, int j, int k) {
		System.out.println("methodA(int i, int j, int k) 호출 성공!");
	}
	
	public static void main(String[] args) {
		X x = new X();
		x.methodA(678, -10);
	}

}
