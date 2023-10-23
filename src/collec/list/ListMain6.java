package collec.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class List6{
	List<String> rank = new ArrayList<String>();
	void init() {
		rank.add(0, "나신입");
		rank.add(1, "나초보");
		rank.add(2, "나일등");
	}
	boolean rankDelete(String delValue) {
		boolean isOk = false;
		isOk = rank.remove(delValue);
		return isOk;
	}
}
public class ListMain6 {

	public static void main(String[] args) {
		System.out.println("삭제하고자 하는 이름을 입력하시오.");

		List6 l5 = new List6();
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		boolean isOk = l5.rankDelete(user);
		l5.init();
		if(isOk) {
			System.out.println("삭제처리되었습니다.");
			System.out.println(l5.rank);
		}
		else System.out.println("삭제 실패하였습니다.");
		}
}
