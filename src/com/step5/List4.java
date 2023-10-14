package com.step5;

import java.util.ArrayList;
import java.util.List;

public class List4 {
	/*선언부*/
	//선언부, 생성자 이름 다르게!! -> 확장성, 다형성, 유지보수 시 코드 수정 감소 
	List<DeptDTO> li = new ArrayList<>();//선언 클래스 뒤 구현체 클래스
	/*생성자*/
	public List4() {	}
	/*정의메소드*/
	/*메인메소드*/
	public static void main(String[] args) {
		List4 l4 = new List4();
		//DeptDTO의 변수값 넣는 get, set 사용 
		//List 인터페이스 활용하여 배열값을 저장하기!! add 사용 -> List거쳐서 사용!!
		DeptDTO dept = new DeptDTO();
		dept.setDeptno(10);
		dept.setDname("영업부");
		dept.setLoc("부산");
		l4.li.add(dept);
		//위에서 생성된 객체 dept의 값들을 List를 사용하여 배열로 생성해둔 상황임. 
		//아래는 새로 객체 dept를 생성하여 그 값을 또 List에 생성하는 것
		dept = new DeptDTO();
		dept.setDeptno(20);
		dept.setDname("개발부");
		dept.setLoc("대전");
		l4.li.add(dept);
		//DeptDTO의 변수로 생성된 값 List의 검색 get을 통해 확인해보기!!
		//참조를 한 DeptDTO에 변수값으로 불러오기(역시 두 번 거쳐서 사용 가능)
		System.out.println(l4.li); //저장된 객체들의 주소 확인가능
		//저장되어있는 첫번째 값 검색해보기
		System.out.println(l4.li.get(0)); //첫번째 객체 주소
		DeptDTO rd = l4.li.get(0);
		System.out.println(rd.getDeptno()+", "+rd.getDname()+", "+rd.getLoc());
		//저장되어있는 두번째 값 검색해보기
		System.out.println(l4.li.get(1)); //첫번째 객체 주소
		rd = l4.li.get(1);
		System.out.println(rd.getDeptno()+", "+rd.getDname()+", "+rd.getLoc());
	}
}
