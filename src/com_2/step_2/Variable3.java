package com_2.step_2;

public class Variable3 {
	public void accoutn(int i, int j) {
		System.out.println("account 호출 성공");
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		Variable3 v = new Variable3();
		v.accoutn(1, 2);

	}

}
