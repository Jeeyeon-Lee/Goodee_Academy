package com.step2;

public class Method2 {
	//메소드 login, methodD 생성
	public String login(String id, String pw) {
//		System.out.println(id + pw);
		String name = "New";
		return name;
	}
	public int methodD() {
		//난 return 예약어를 쓰지 않아도 괜찮아
		return 0;
	}	
	public static void main(String[] args) {
		//메소드 m 호출하고 출력값 파라미터에 넣어보기
		Method2 m = new Method2();
		System.out.println(m.login("yong1","111")); //new만 출력
		m=new Method2();
		String name = m.login("Yong2", "111"); //출력x
		System.out.println("Yong3" + name); //yong3new출력
		m.login("Yong4", "1111"); //출력x
		System.out.println(m.login("Yong5", "111")); //new만 출력
	}

}
