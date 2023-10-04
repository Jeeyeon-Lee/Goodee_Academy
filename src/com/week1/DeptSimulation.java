package com.week1;
public class DeptSimulation {

	public static void main(String[] args) {
	//WReturn 클래스의 Dept 클래스 참조
		Dept dept = new Dept(); //선언
		dept.deptno = 10;       //재정의
		dept.dname = "Development Team";
		dept.loc = "Dobong";
		System.out.println(dept);
		System.out.println(dept.deptno+dept.dname+dept.loc);
		dept = new Dept();      //값 초기화, 새로운 객체 생성
		dept.deptno = 20;
		dept.dname = "Operation Team";
		dept.loc = "Seoul";
		System.out.println(dept);
		System.out.println(dept.deptno+dept.dname+dept.loc);
		dept = new Dept();      //값 초기화, 새로운 객체 생성
		dept.deptno = 30;
		dept.dname = "Maketing Team";
		dept.loc = "Gasan";
		System.out.println(dept);
		System.out.println(dept.deptno+dept.dname+dept.loc);
	}

}
