package com.step2;
//클래스 안에 여러 private 변수 담기 -> 사용해보기(get, set)
public class Dept {    //이 클래스는 실행하진 않고, 값만 갖고 있음. 
	private int deptno = 0;
	private String dname = null;
	private String loc = null;
	
//write, save, 파라미터 안은 비워놓을수도 넣을 수도 있음. 			
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
//read			
	public int getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
}