package collec.list;

import java.util.ArrayList;
import java.util.List;

class List2{
	List<Integer> li = new ArrayList<>();
	List<String> names = null;
	boolean isOk = false;
	public List2() {
		names = new ArrayList<String>();
		boolean isOk = li.add(1);
		this.isOk = isOk;
		System.out.println(li);
		System.out.println(names);
		names.add("나신입");
		System.out.println(li);
		System.out.println(names);
		names.set(0,"나초보"); // 덮어쓰기 
		System.out.println(li);
		System.out.println(names);
	}
}
public class ListMain2 {

	public static void main(String[] args) {
		List2 l2 = new List2();
	}
}
