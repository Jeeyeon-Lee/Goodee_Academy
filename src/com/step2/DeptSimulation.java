package com.step2;
//ctrl + shift + r 누르면 해당 문자가 사용된 곳 다 확인 가능
public class DeptSimulation {

	public static void main(String[] args) {
		//앞선 Dept 객체를 인스턴스화
		//부서번호 만들기
		Dept dept = new Dept();
		dept.setDeptno(10);
		dept.setDeptno(20);
		int deptno = 30; //30으로 초기화
		dept.setDeptno(deptno);
		System.out.println(dept.getDeptno());
		//부서명
		dept.setDname("개발부");
		String dname = "운영부";  //private을 갖고 있기 때문에 초기화 x , set으로만 넣을 수 있음. 
		dept.setDname(dname);
		System.out.println(dept.getDname());

	}

}
