package collec.basic;

import java.util.ArrayList;
import java.util.List;

class A2{
	List<Integer> nums = new ArrayList<>();
	int ival;
	String s = null;
	String s1 = new String();
	public A2() {
		s = new String("나신입");
		System.out.println(s);
	}
	public A2(int ival) {
		s = new String("나초보");
		System.out.println(s);
	}
	public A2(String name) {
		s = new String(name);
		System.out.println(s);
	}
}
public class AMain {

	public static void main(String[] args) {
		System.out.println("main 호출");
		String s = null;
		A2 a = new A2();
		a = new A2(1);
		a = new A2("jay");
	}

}
