package com.step5;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;
		String s3 = null;
		ArrayList<String> fruits = new ArrayList<String>();
		//ArrayList는 순서대로 저장되며, 중간에 끼어들기하면 뒤로 밀려서 저장됨 
		//List의 생성메소드 중 add 메소드는 두개로 나뉨
		fruits.add("🍉");      //1. 넣을 내용만 입력
		s1 = (String)fruits.get(0);
		fruits.add(1,"🥝");    //2. 번호와 내용 입력
		//List의 검색메소드 get, fruits는 String 타입이어서 형변환필요
		s2 = (String)fruits.get(1);
		fruits.add(1,"🍑");    //덮어씀.
		s3 = (String)fruits.get(1); //덮어쓰기
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println(s1+s2+s3);
		System.out.println("");
		//삭제 메소드 remove(int i) -> 해당번째 삭제
		fruits.remove(2);   //3번째 지움. 따라서 2개만 출력됨
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println(s1+s2+s3);
		System.out.println("");
		//removeAll -> 전체 삭제
		fruits.removeAll(fruits);
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println(s1+s2+s3);
		//remove를 해도 각 변수로 출력을 요청하면 아직 값이 저장되어있음을 확인 가능.
	}

}
