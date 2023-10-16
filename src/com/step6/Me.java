package com.step6;

public class Me extends Super1 {
	int c = 3;
	public void methodC() {
		System.out.println("Me : methodC 호출");
	}
	public static void main(String[] args) {
		Me me = new Me();           //Me 클래스의 인스턴스를 생성, Me 클래스의 객체를 생성하여 변수 me에 할당
		me.methodA();
		me.methodC();
		Super1 sup1 = new Me();    //Me 클래스의 인스턴스를 생성, Super1타입으로 선언, sup1에 할당 
//		Me me2 = new Super1();    //왼쪽이 더 커야함~!
		me.methodA();
		me.methodC();
		sup1.methodA();
//		sup1.methodC();                //sup이 부모여서 사용x
/*		//상위클래스 타입의 인스턴스 변수로 하위 클래스에 정의된 메소드 호출 불가
		sup1.methodC();  부모클래스로는 자손 메소드 호출x*/
	}
}
