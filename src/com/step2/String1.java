package com.step2;

public class String1 {

	public static void main(String[] args) {
		String s1 = new String("kiwi"); 
		System.out.println(s1);

		//같은 이름의 변수(s1) 이더라도 new를 사용해서 인스턴스화를 한 번 더 하면
		//새로운 객체가 만들어 지는 것이다.
		s1 = new String("lemon");  
		System.out.println(s1);
		
	}

}
