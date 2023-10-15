package com.step5;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		//Map 인터페이스 활용! 
		Map<String, String> map = new HashMap<>();
		//생성 put(key, value)
		map.put("deptno","10");
		map.put("dname","영업부");
		map.put("loc","부산");
		//검색 get, continsKey
		System.out.println(map.get("10"));                   //null 10이라는 key의 value는 뭐니?nope 10은 value야
		System.out.println(map.get("loc"));                   //부산 loc이라는 key의 value는 뭐니? 부산이요
		System.out.println(map.containsKey("deptno")); //true
		System.out.println(map.containsKey("DEPTNO")); //false - 대소문자 구분하는 자바
		//갖고있는지 확인해보기
		if(map.containsKey("10")) {   //key의 자리에 10이 있지 않고, value의 자리에 10이 있어서 "갖고있지 않음"
			System.out.println("갖고있어요");
		}
		else {
			System.out.println("갖고있지 않아요");
		}
		
	}

}
