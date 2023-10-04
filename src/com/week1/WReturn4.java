package com.week1;
class Dept1{ //세가지 변수가 들어가는 Dept 클래스
	int deptno = 20;
	String dname = "Operation team";
	String loc = "Jeju";
}
class Dept{
	int deptno = 10;
	String dname = "Development team";
	String loc = "Pusan";
}
public class WReturn4 {
	int getDeptno() {
		int deptno = 10;
		return deptno;
	}
	String getLoc() {
		String loc = "Pusan";
		return loc;
	}
		

}
