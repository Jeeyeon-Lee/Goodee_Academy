package practice;

public class EmpVO {
	//선언부
	private int empno = 40;
	private String ename = "가디";
	private double salary = 4000;
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String name) {
		this.ename = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//생성자
	public EmpVO() {	}
	public EmpVO(int empno, String ename, double salary) {
		this.empno = empno;  //지변값을 전변에
		this.ename = ename;
		this.salary = salary;
//		System.out.println("지변값을 전변에 저장 : "+empno +"/"+ ename +"/"+ salary);
	}
	public EmpVO(String ename, int empno, double salary) {
		empno = this.empno;  //전변값을 지변에
		ename = this.ename;
		salary = this.salary;
//		System.out.println("전변값을 전변에 저장 : "+empno +"/"+ ename +"/"+ salary);
	}
	//정의메소드
	//메인메소드
	public static void main(String[] args) {
	}

}
