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
	boolean rankUpdate(int index, String newValue) {
		boolean isOk = false;
		boolean isEqual = false;
		for(int i=0;i<rank.size();i++) {
			if(i == index) {
				String oldValue = rank.get(index);
				if(oldValue.equals(newValue)) {
					isEqual = true; //새로 입력된 거랑 값이 같음.
				}
			}
		}
		if(isEqual) {
			System.out.println("같은 이름을 입력하였습니다. 다시 확인해주세요.");
			return false;
		}else {
			System.out.println("기존 이름과 다른 이름을 입력하였습니다. 수정을 진행합니다.");
			String oldValue = rank.set(index, newValue);
			isOk = true;
		}
		return isOk;
	}
}
public class ListMain6 {

	public static void main(String[] args) {
		List6 l5 = new List6();
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		StringTokenizer st = new StringTokenizer(user, "|");
		String imsi = st.nextToken();
		int index = Integer.parseInt(imsi);
		String value = st.nextToken();
		l5.init();
		boolean isOk = l5.rankUpdate(index, value);
		if(isOk ) {
			System.out.println("수정처리되었습니다.");
			System.out.println(l5.rank);
		}else System.out.println("수정실패하였습니다.");
	}

}
