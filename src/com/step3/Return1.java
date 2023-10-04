package com.step3;

import java.util.Random;

public class Return1 {
	void m() {
		System.out.println("리턴타입 자리에 void인 경우, 반환값 받을 수 없다.");
	}
	int m2() {
		System.out.println("리턴타입 자리에 int인 경우, 반환값 받을 수 있다.");
		return 0;
	}
	String m3() {
		System.out.println("리턴타입 자리에 String인 경우, 반환값 받을 수 있다.");
		return null;
	}
	Random m4() {   //클래스를 참조한 경우!! 자바에서 제공되는 자바 자체의 클래스로 여러 메소드도 포함됨.
		System.out.println("리턴타입 자리에 Object가 온 경우, 반환값 받을 수 있다.");
		return new Random();
	}
	Random m5() {
		System.out.println("리턴타입 자리에 Object가 온 경우, 반환값 받을 수 있다.");
		return new Random();
	}
	public static void main(String[] args) { //리턴타입의 유무가 단순히 아래에 리턴을 쓰냐마냐가 아님
		//인스턴스 후 메인에서 호출하거나 다른 메소드에서 호출이 가능하고, 뒤에 메소드도 불러올 수 있음. 
		//void 리턴타입의 경우, 메인에서 sout할 수 없고, 그 값 또한 반환할 수 없음. 
		Return1 r1 = new Return1();
//		System.out.println(r1.m()); //불가
		System.out.println(r1.m2());//가능
		System.out.println(r1.m3());//가능
		System.out.println(r1.m4().nextInt(10));//가능
		System.out.println(r1.m5().nextInt(5));//가능
		
	}

}
