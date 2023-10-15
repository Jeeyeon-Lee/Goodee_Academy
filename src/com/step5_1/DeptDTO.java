package com.step5_1;
//부서 클래스
public class DeptDTO {
	/*선언부*/
	private int deptno;
	private String dname;
	private String loc;	
	private EmpDTO empDTO; //EmpDTO 타입의 객체를 저장하기 위한 용도로 사용
	/*생성자*/
	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	/*정의메소드*/
	//값 넣고, 불러오는 메소드 정의
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
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
	public EmpDTO getEmpDTO() {
		return empDTO;
	}
	public void setEmpDTO(EmpDTO empDTO) {
		this.empDTO = empDTO;
	}
}
