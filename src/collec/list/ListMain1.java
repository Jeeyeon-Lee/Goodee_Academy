package collec.list;

import java.util.ArrayList;
import java.util.List;

class List1{
	//아래 전변이 읽혀지는 순간은 인스턴스화 할때 이다.-> 생성자가 호출되면 그때 비로서 읽힘
	//초기화문제 -> 시점[타임라인관계] -> 인터셉트:Spring F/W{때를 파고든다}할 수 있다(관여)
	List<Integer> nums = null;//선언만
	List1(){
		List<Integer> nums = new ArrayList<>();//선언빼고(타입을 적지 않았으니까) 생성하기
	}
}
public class ListMain1 {

	public static void main(String[] args) {
		List1 list1 = new List1();
		//list1은 Null이 아니다. - 17번을 보면 알 수 있다.
		//list1 .연산자 다음의 nums변수는 전변이다.|지변이다.
		list1.nums = new ArrayList<>();//이와같은 방법은 전변일때만 가능하다. 지변일땐 불가함 - 지변일땐 어떡하지??? - 리턴타입으로 해결함
		System.out.println(list1.nums.size());
	}
}
