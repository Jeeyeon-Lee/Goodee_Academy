package achat.step1;

import java.util.List;
import java.util.Vector;

public class List1 {

	public static void main(String[] args) {
		//list란 변수에 사과, 키위, 토마토(String) 넣어보자 -> List, Vector사용
		List<String> list = new Vector<String>();
		//더하기 add
		list.add(0, "사과");
		list.add(1,"키위");
		list.add(2,"토마토");
		//특정번호로 검색 get
		list.get(1);
		//println써서 다 가져와보기  []
		System.out.println(list);
		//for 써서 다 가져와보기
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	

}
