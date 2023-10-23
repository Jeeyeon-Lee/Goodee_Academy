package collec.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class List9{
	List<String> rank = new ArrayList<>();//rank.size()=0
	void init() {//전역변수의 선언된 깡통에 3가지 정보를 추가하기
		rank.add(0,"나신입");
		rank.add(1,"나초보");
		rank.add(2,"나일등");
		//rank.add(3,"입력한 이름");
	}
	//전체선택 -> void 왜 ? 랭크의 값들은 어차피 전변으로 동기화 - 하나됨 - void
	void rankSelect() {
		System.out.println(rank);
	}
	//상세조회 -> boolean, 왜? 한 건을 조회하고, 조건식으로 넣으니까 조회될 때만 나오는 메소드
	//왜 int? 해당 인덱스의 번호를 넣으면 상세로 불러와지도록, 또는 value로 해도 됨 
	boolean rankDetail(int index) {
		boolean isOk = false;
		String name = null;
		name = rank.get(index);
		System.out.println("찾는 이름은 "+ name + "입니다.");
		if(name != null) {
			isOk = true;
		}
		return isOk;
	}
	
}
public class ListMain9 {

	public static void main(String[] args) {
		System.out.println("전체조회 	1번을 입력하고 상세조회이면 2번을 입력하시오.(종료를 원하시면 q를 눌러주세요)");
		Scanner sc = new Scanner(System.in);//화면을 그리진 않지만 화면이 갖는 효과는 누릴 수 있다.
		//1번을 누르면 전체 조회
		List9 l4 = new List9();
		l4.init();
		while(true) {
			String menu = "-1";
			menu = sc.nextLine();
			if("1".equals(menu)) {
			System.out.println("1번 전체조회를 선택하셨습니다.");
			l4.rankSelect();
			continue;
			}
			else if("2".equals(menu)) {
				System.out.println("2번 상세조회를 선택하셨습니다.");
				System.out.println("상세조회를 원하는 번호를 입력하세요.");
				String user = sc.nextLine(); //String int로
				int index = Integer.parseInt(user);
				if(index>=0) {
					l4.rankDetail(index);
				}
			}else if("q".equals(menu)) {
				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);
			}
		}
	}

}
