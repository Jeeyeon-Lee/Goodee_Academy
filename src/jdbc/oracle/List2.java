package jdbc.oracle;

import java.util.List;

public class List2 {
	/*정의메소드*/
	public void methodA(List<BookVO> bookList) { //파라미터에 리스트 넣기
		BookVO bVO = new BookVO(); 
		//저장된 개인정보는 get으로 불러오기 가능
		System.out.println(bVO.getB_no());
		System.out.println(bVO.getB_title());
		System.out.println(bVO.getB_author());
		System.out.println(bVO.getB_price());
		//저장된 개인정보는 set으로 초기화 가능
		bVO.setB_author(null);
		bVO.setB_title("수학의 정석");
		System.out.println(bVO.getB_title());
		System.out.println(bVO.getB_author());
		
	}
	/*메인메소드*/  
	public static void main(String[] args) {
		List2 l2= new List2();
		l2.methodA(null); //파라미터에는 null이 있찌만 메소드로 들어가서 값이 리턴이 되니까 가능함
	}

}
