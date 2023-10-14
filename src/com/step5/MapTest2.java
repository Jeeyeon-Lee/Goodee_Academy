package com.step5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		//Map 인터페이스 활용! 
		Map<String, String> map = new HashMap<>();
		//생성 put(key, value)
		map.put("deptno","10");
		map.put("dname","영업부");
		map.put("loc","부산");
		//set 써보기(수학적 집합 추상화를 모델링 가능)
		Set<String> set = map.keySet(); //keySet() 이 맵에 포함된 키의 Set 뷰를 반환
		Object keys[] = set.toArray(); //toArray() 이 세트의 모든 요소를 ​​포함하는 배열을 반환
		for(int i=0;i<keys.length;i++) {
			System.out.println(keys[i]);
		}
	}

}
