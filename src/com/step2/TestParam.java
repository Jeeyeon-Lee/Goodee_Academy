package com.step2;

class Param{
	int ival;   //0
}

public class TestParam {
	void effectParam(Param p) {
		p = new Param();
		p.ival = 100;
		System.out.println("sub ival =" + p.ival);
	}
	public static void main(String[] args) {
		Param p = new Param();
		System.out.println("Param클래스에서 가져온 ival ="+ p.ival);
		p.ival = 500;
	
		TestParam tp= new TestParam();
		tp.effectParam(p);
		System.out.println("main ival =" + p.ival);
	}
}
/*테스트 파람이라는 클래스에는 클래스가 두개다
Param 클래스와 TestParam클래스임.
Param클래스에는 ival 변수 하나만 있고, 그 기본값은 0이었다.
메인메소드는 TestParam에 있다. 모든 클래스가 다 메인메소드를 가질 필요는 없음
단 실행할 수 있는 클래스는 오직 TestParam뿐이다.
14번에서는 Param을 인스턴스화해야 했다.
그런데 effectParam은 호출되지 않았다.  
*/