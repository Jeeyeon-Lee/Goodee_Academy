package com.step2;

public class Method1 {
	//메소드 리턴타입에 참조형이 오면?
	//반드시 마지막에 return 예약어를 쓴다
	public String login(String id, String pw) {
		System.out.println("User input id = " + id + ", User input pw" + pw);
		String name = "New";
		return name;
	}
	public int MethodA() {
		return 1;
	}
	public double MethodB() {
		return 3.14;
	}
	public boolean MethodC() {
		return true;
	}
	public void MethodD() {
		//return 없어도 괜찮음.
	}
	public static void main(String[] args) {
		Method1 m = new Method1();
		String name1 = m.login("yong", "111"); //기본 메소드값 New -> yong, 111로 초기화
		System.out.println(name1); 
		//새롭게 초기화하여 출력해보기!!
		m = new Method1();
		String name2 = m.login("jay", "333"); //기본 메소드값 New -> jay, 333로 초기화
		System.out.println(name2); 
	}

}
