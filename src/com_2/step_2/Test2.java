package com_2.step_2;
class P{
	static int i = 1;
	int j = 10;
}
public class Test2 {
	public void methodC() {
		P.i = P.i+2;  //static은 인스턴스 필요 없음. 인스턴스변수 대신 ( 클래스명.변수명)으로 사용 가능
	}
	public static void main(String[] args) {
		P.i  = 2;
		System.out.println(P.i); //메소드 거치지 않으니까 2로 출력? 
		Test2 t = new Test2();
		t.methodC();
		System.out.println(P.i); //메소드 호출 후 i 호출하면 4로 나올 것 같은데(정답)
		//새롭게 생성해도 이제 4로 고정되었을 듯 
		t = new Test2();
		System.out.println(P.i); //메소드 호출 후 i 호출하면 4로 나올 것 같은데(정답)
		
	}

}
