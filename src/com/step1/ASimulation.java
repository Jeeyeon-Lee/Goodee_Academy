package com.step1;

class A{
	int i = 1;
}
public class ASimulation {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);
		int j = 0;
		j = a.i; //j라는 변수를 생성하여, 그 값을 a.i인 1로 치환하여 초기화
		System.out.println(a.i);
		System.out.println(j);
	}

}
