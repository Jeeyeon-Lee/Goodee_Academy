package jdbc.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List3 {
	/*정의메소드*/
	//파라미터값을 메인에서 생성하여 보내줄 예정
	public void methodA(List<BookVO> bookList) {
		System.out.println(bookList);
		BookVO rbVO = bookList.get(0);
	}
	public void methodB(List<Map<String, Object>> bookList) {
		System.out.println(bookList); 
	}
	/*메인메소드*/
	public static void main(String[] args) {
		List3 l3 = new List3();
		BookVO bVO = new BookVO();
		List<BookVO> bookList = new ArrayList<BookVO>();
		System.out.println("=====List 확인=====");
		System.out.println(bookList.size()); //0
		bVO.setB_no(0);
		bVO.setB_title("자바의정석");
		bVO.setB_author("남궁성");
		bVO.setB_price(30000);
		bookList.add(bVO);
		System.out.println(bookList.size()); //0
		System.out.println("=====Map 확인=====");
		List<Map<String, Object>> bookMap = new ArrayList<>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("b_no", 1);
		map.put("b_title", "자바의정석");
		map.put("b_author", "남궁성");
		map.put("b_price", 30000);
		bookMap.add(map);
		System.out.println(bookMap.size());
		l3.methodA(bookList); //파라미터에 List가 들어가기로 한 메소드
		l3.methodB(bookMap);//파라미터에 Map이 들어가기로 한 메소드 
	}

}
