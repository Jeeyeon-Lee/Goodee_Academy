package com.step5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpManager {
	/*선언부*/
	List<Map<String, Object>> empList = new ArrayList<>();
	/*생성자*/
	EmpManager(){
		getEmpList();
	}
	/*정의메소드*/
	//empList 입력하기(List, Map 거쳐서)
	public List<Map<String, Object>> getEmpList() {
		Map<String, Object> map = new HashMap<>();
		//Map의 생성 put(key, value)
		map.put("EMPNO", 7566);
		map.put("ENAME", "나신입");
		map.put("JOB", "영업부");
		map.put("MGR", 7500);
		map.put("HIREDATE", "2023-10-10");
		map.put("SAL", 3500);
		map.put("COMM", 500);
		map.put("DEPTNO", 10);
		empList.add(map);
		map = new HashMap<>();
		map.put("EMPNO", 7566);
		map.put("ENAME", "나초보");
		map.put("JOB", "개발부");
		map.put("MGR", 7500);
		map.put("HIREDATE", "2023-10-10");
		map.put("SAL", 3500);
		map.put("COMM", 500);
		map.put("DEPTNO", 20);
		empList.add(map);
		map = new HashMap<>();
		map.put("EMPNO", 7566);
		map.put("ENAME", "나중수");
		map.put("JOB", "인사부");
		map.put("MGR", 7500);
		map.put("HIREDATE", "2023-10-10");
		map.put("SAL", 3500);
		map.put("COMM", 500);
		map.put("DEPTNO", 30);
		empList.add(map);
		return empList;
	}
	/*메인메소드*/
	public static void main(String[] args) {
		EmpManager em = new EmpManager();
	}

}
