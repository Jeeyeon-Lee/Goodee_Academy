package com.week2;

public class String1 {
	//equalls(값이 같은지)와 ==(주소번지가 같은지)의 차이
	//String의 경우, 새로운 객체가 생성된 것(인스턴스화)이 아니라면 같은 값이 들어있는 변수는 같은 주소번지를 가짐!!
	public static void main(String[] args) {
		String s1 = "안녕";
		String s2 = "안녕";
		String s3 = new String("안녕");
		String s4 = new String("안녕");
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s1==s4); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s4)); //true
	}

}
