package com_2.step_2;

public class DeptSimulation {

	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDeptno(10);
		int deptno = 40;
		dept.setDeptno(deptno); // 지변의 값으로 치환
		System.out.println(dept.getDeptno());
		//
		dept.setDname("개발부");
		String Dname = "운영팀";
		dept.setDname(Dname); //치환
		System.out.println(dept.getDname());
	}

}
