package com.week1;

public class Print1 {
	int m() {return 5;}
	static void n() {}
	public static void main(String[] args) {
		System.out.println(1);       //1
		System.out.println("Hello"); //Hello
		System.out.println(1.5);     //1.5
		System.out.println(true);    //true
		//다 그냥 출력이 됨. 
		//위 전변 값은 어떻게 호출? m값에 리턴타입이 5로 들어가 있네?
		Print1 p1 = new Print1();    //인스턴스화
		System.out.println(p1.m());	 //5 ->m에 들어가있는 리턴값 출력
		//위의 메소드 n은?리턴값이 없는데?
//		System.out.println(p1.n());  
		//오류 n의 값이 없어서..만약 위에 줄에 n을 정의해주면?
		//소용x n메소드의 경우, 리턴타입이 없는 void 리턴타입의 메소드이기 때문!!
	}

}
