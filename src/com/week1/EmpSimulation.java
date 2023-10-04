package com.week1;

public class EmpSimulation {
	public void empPrint(Emp emp) {
		System.out.println(emp.empno+emp.ename+emp.job);
	}
	
	public static void main(String[] args) {
		EmpSimulation es = new EmpSimulation();
		Emp emp = new Emp();
		System.out.println("default value = "+emp.empno+emp.ename+emp.job); //default 값 출력
		emp.empno = 7566;
		emp.ename = "New";
		emp.job   = "Development";
		//계속 system out을 넣는 것이 아니라 위에 메소드를 새로 생성해보자!! -> empPrint
		es.empPrint(emp);
		emp = new Emp();
		emp.empno = 7499;
		emp.ename = "Old";
		emp.job   = "Manager";
		es.empPrint(emp);
	}

}
