package com.week1;

public class WReturn1 {
	void methodA() {
		
	}
	int methodB() {
		return (int)1.5; //1로 강제 형전환
	}
	public static void main(String[] args) {
		WReturn1 w = new WReturn1();
		//같은 클래스 안에 있는 methodB 호출
		w.methodB();
		System.out.println("methodB value =" + w.methodB());
		//위 메소드B는 리턴값이 있는 int타입이기 때문에 반환되는 값을 넣을 수 있음. 
		int i = w.methodB(); //methodB의 리턴값을 수정할 수 있는지..순서를 봐보자
		i = 10;
		System.out.println("value reset..?"+i);
	}

}
