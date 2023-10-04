package com.step3;

public class Return2 {
	void m(int i) {
		if(i == -1) {
			return;
		}
		System.out.println("요기");
	}
	public static void main(String[] args) {
		Return2 r2 = new Return2();
		r2.m(-1);
		System.out.println("여기");
	}

}
