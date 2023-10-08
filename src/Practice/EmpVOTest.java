package practice;

public class EmpVOTest {
	
	public static void main(String[] args) {
		EmpVO eVOs[] = new EmpVO[3]; //eVOs 라는 배열값에 3개의 자리 생성
		//다른 클래스에서 가져오기 위해서는 get 필요!
		//각 객체를 배열 번지수를 정하여 저장하기
		EmpVO eVO = new EmpVO(1, "첫번째 사원", 1000);
		eVOs[0] = eVO;
		System.out.println("사원번호 : "+eVO.getEmpno()+"/사원이름 : "+eVO.getEname()+"/급여 : "+eVO.getSalary()+"/주소번지 : "+eVO);
		eVO = new EmpVO(2, "두번째 사원", 2000);
		eVOs[1] = eVO;
		System.out.println("사원번호 : "+eVO.getEmpno()+"/사원이름 : "+eVO.getEname()+"/급여 : "+eVO.getSalary()+"/주소번지 : "+eVO);
		eVO = new EmpVO(3, "세번째 사원", 3000);
		eVOs[2] = eVO;
		System.out.println("사원번호 : "+eVO.getEmpno()+"/사원이름 : "+eVO.getEname()+"/급여 : "+eVO.getSalary()+"/주소번지 : "+eVO);
		//배열에 저장된 값들의 주소 출력해보기 
		for(int i=0;i<eVOs.length;i++) {
			System.out.println(eVOs[i]);
		}
	}

}
