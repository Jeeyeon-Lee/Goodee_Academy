package com.step5;

public class DeptDTO {
	/*선언부*/
	private int deptno;
	private String dname;
	private String loc;
	//empDTO와 연결(타입에 객체를 넣는 경우! 알아두기)
	private EmpDTO empDTO;
	/*생성자*/
	public DeptDTO() {	}
	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	/*정의메소드*/ 
	//empDTO 연결했음. 값 입력, 출력 메소드 생성
	public EmpDTO getEmpDTO() {
		return empDTO;
	}
	public void setEmpDTO(EmpDTO empDTO) {
		this.empDTO = empDTO;
	}
	//private 변수 입력/출력 메소드
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}