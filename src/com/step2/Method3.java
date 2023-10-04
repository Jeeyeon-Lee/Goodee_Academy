package com.step2;

public class Method3 {
	public String login(String id, String pw) {
		String name = "New";
		return name;
	}
	public void methodD(String name) {
		System.out.println("methodD call succeed : " + name);
	}
	public static void main(String[] args) {
		Method3 m = new Method3();
		m.login("Jay", "1234");
		System.out.println(m.login("Jay", "1234")); //new로 출력..
		//methodD는 파라미터값 내용으로 초기화 x->리턴타입 못 넣는 void 리턴타입 사용해서
		String name = m.login("Jay", "1234");
		m.methodD(name);
	}

}
