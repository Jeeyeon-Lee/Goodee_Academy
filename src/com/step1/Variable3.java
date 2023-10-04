package com.step1;

public class Variable3 {
	//메소드에 파라미터 값 기입
	public void account(int i, int j) {
		System.out.println("account method call!");
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		Variable3 v = new Variable3();
		v.account(1,2); //account 메소드의 파라미터 값에 1, 2 기입
	}

}
