package com.week3;

public class ThreeOper {

	public static void main(String[] args) {
		System.out.println(10+10);        //20
		System.out.println("10"+10);      //1010 문자열 들어가면 더하기-> 합치기로 변경
		System.out.println("10"+(10+20)); //1030
		int hour = 7;
		String result1 = (hour<10 ? "true" : "거짓");       //삼항연산자
		System.out.println(result1);
		String result2 = (hour<10 ? "0" +hour : ""+hour); //삼항연산자(앞 뒤 같은 형식으로 작성)
		System.out.println(result2);
	
	}

}
