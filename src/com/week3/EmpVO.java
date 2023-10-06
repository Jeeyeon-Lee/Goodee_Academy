package com.week3;

public class EmpVO {
	//선언부
	private int empno;
	private String ename;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//생성자
	public EmpVO() {} //디폴트 생성자
	public EmpVO(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	} //생성자
	public static void main(String[] args) {
	}

}
