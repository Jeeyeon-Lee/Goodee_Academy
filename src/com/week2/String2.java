package com.week2;

public class String2 {

	public static void main(String[] args) {
		//s1과 s2는 그 값이 다름. 
		String s1 = "";   
		String s2 = null;
		System.out.println(s1); //빈 값 출력
		System.out.println(s2); //null 출력
		System.out.println(s1.equals(s2)); //출력값이 다르기 때문에 false
		System.out.println("".toString());
//		System.out.println(null.toString()); //실행도 안 됨. 
	}

}
