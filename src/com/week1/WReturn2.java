package com.week1;
//리턴타입 여부에 따라 다른 메소드 선언
public class WReturn2 {
	int i=10;
	void methodA() {
		int i = 2; 
		System.out.println("methodA i = "+ i);
	}
	int methodB() {
		int i = 1;
		return i;
	}

	public static void main(String[] args) {
		//메소드B를 여기서 선언하고 싶음
		WReturn2 w = new WReturn2();
		System.out.println("w.methodB = "+w.methodB());
//		System.out.println(w.methodA()); void 리턴타입이어서 파라미터 안에 값x??
		w.methodA();
		System.out.println("w.i(class global Variable) = " + w.i);//클래스의 전역변수가 출력
	}

}
