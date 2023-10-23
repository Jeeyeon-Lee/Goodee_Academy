package collec.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class List4{
	List<Integer> rank = new ArrayList<Integer>();
	void init() {
		rank.add(1);
		rank.add(2);
		rank.add(3);
	}
	//List 등록내용 수정메소드 (init 메소드 선처리 후 set 사용 필요)
	boolean rankUpdate(int index, int value) {
		boolean isOk = false; //플래그로 사용, true일 때 값을 보기 위해 
		Integer it = rank.set(index, value); //제네릭 타입에 따라 it라는 인티저 변수에 수정할 값 입력 예쩡
		int x = it;                               //인티저변수를 인트로 전환
		if(it != null) {
			System.out.println("받아온 값과 수저오딘 값이 같니?");
			isOk = true;
		}
		return isOk;
	}
}
public class ListMain4 {

	public static void main(String[] args) {
		System.out.println("수정하고자 하는 위치값과 숫자를 입력하시오. 예)위치값|변경할값");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		StringTokenizer st = new StringTokenizer(user,"|");
		String imsi = st.nextToken(); //String int 전환 필요 
		int index = Integer.parseInt(imsi); //문자열 -> 정수변환
		String value = st.nextToken();
		int ivalue = Integer.parseInt(value);
		List4 l4 = new List4();
		l4.init();
		boolean isOk = l4.rankUpdate(index, ivalue);
		if(isOk) {
			System.out.println("수정 처리 완료");
			System.out.println(l4.rank);//[1,2,3] ->  1|3 -> [1,3,3]
		}
		else System.out.println("수정 실패하였습니다.");

	}

}
