package com.step4;
class J{
	int a;
	JMain jm = new JMain();
	J(){}
}
public class JMain {
	//선언부
	int b;        //b가 변수이듯
	J j = null;   //j도 변수
	//생성자
	JMain(){}      //디폴트 생성자
	JMain(J j){   //J클래스 참조하는 생성자
/*
 생성자를 호출한 객체의 j 값을 현재 클래스 내부에서 사용할 수 있도록 할당하는 것입니다. 
 이 경우, 생성자 파라미터로 전달된 J j 값은 무시됩니다.		
 this의 인스턴스변수 값을 사용
		j = this.j; 
		b = 10;                                              */
		this.j = j; //이 클래스의 인스턴스변수 j에 파라미터 전달값 j를 대입, 외부 클래스의 값을 사용
		b = 10;
	}
	//메소드
	void methodA() {
		System.out.println(j);
	}
	public static void main(String[] args) {
		J j      = new J();
		JMain jm = new JMain(j); //파라미터값 있는 생성자 호출
		System.out.println(jm.b);
		jm.methodA();
		
		jm = new JMain();        //디폴트 생성자호출, 재정의x??
		System.out.println(jm.b); 
		jm.methodA();
	}

}
