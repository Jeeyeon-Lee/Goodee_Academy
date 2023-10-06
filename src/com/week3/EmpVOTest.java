package com.week3;

public class EmpVOTest {
	public static void main(String[] args) {
		//배열생성 연습
		EmpVO eVOs[] = new EmpVO[3];
		EmpVO eVO = new EmpVO(1, "고디", 3000);
		System.out.println(eVO.getEmpno()+", "+eVO.getEname()+", "+eVO.getSalary());
		eVOs[0] = eVO;
		eVO = new EmpVO(2, "가디", 4000);
		System.out.println(eVO.getEmpno()+", "+eVO.getEname()+", "+eVO.getSalary());
		eVOs[1] = eVO;
		eVO = new EmpVO(3, "구디", 5000);
		System.out.println(eVO.getEmpno()+", "+eVO.getEname()+", "+eVO.getSalary());
		System.out.println(eVO);
		eVOs[2] = eVO;
		for(int i=0;i<eVOs.length;i++) {
			System.out.println(eVOs[i]);
		}
	}

}
