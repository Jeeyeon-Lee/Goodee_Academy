package com.step5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		//Map과 List 인터페이스 동시 활용! 
		//데이터의 순서, 입력이 같이 빠르게 일어나도록?
		//deptList라는 배열 생성
		List<Map<String, Object>> deptList = new ArrayList<>();
		//String의 키와 Object라는 벨류가 들어가는 맵을 생성
		Map<String, Object> map = new HashMap<>();
		//put(key, value)
		map.put("DEPTNO","10");          //대문자인 이유, 토드에서는 대문자로 사용하고 있음. 맞춰서 보내줘야함.
		map.put("DNAME","영업부");
		map.put("LOC","부산");	
		//deptList에 위에 작성된 map을 참조하여 생성함!(키 구분 가능해짐) 
		deptList.add(map);
		//set 써보기(수학적 집합 추상화를 모델링 가능)
		Set<String> set = map.keySet(); //keySet() 이 맵에 포함된 키의 Set 뷰를 반환
		Object keys[] = set.toArray(); //keys에 저장된 모든 요소를 ​​포함하는 키 값의 배열을 반환
		//keys에 저장된 배열 반환 + map의 해당 키의 value값 반환
		for(int i=0;i<keys.length;i++) {
			System.out.println(keys[i]+"==>"+map.get(keys[i]));
		}
		System.out.println(deptList.get(0).get("DEPTNO"));  //10
		System.out.println(deptList.get(0).get("deptno"));   //null(대소문자 구분함)
		System.out.println(deptList.get(0).get("10"));          //null(10은 key가 아닌 value임)
		}

}
