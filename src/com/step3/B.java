package com.step3;
//앰퍼센드 연산자 -> 두가지의 조건을 모두 충족한다는 조건식을 만듦
public class B {

	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		if(i%5==0 & i%7==0) {
			System.out.println("fizzbuzz");
		}
		if(i>0 & j<1) {
			System.out.println("둘 다 true일 때 출력");
		}
		else {
			System.out.println("둘 중 하나라도 false일 때 출력");
		}
	}

}
