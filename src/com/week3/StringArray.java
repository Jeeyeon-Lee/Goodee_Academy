package com.week3;

public class StringArray {

	public static void main(String[] args) {
		String names[]  = new String[3];
		String names2[] = {"구디", "가디", "고디"};
		String names3[] = new String[]{"1", "2", "3"};
		//향상된 for문 -> for(변수타입 변수명 : 배열명)
		for(String name : names) {
			System.out.println(name);  //기본값 null 출력
		}
	}

}