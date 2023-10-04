package com.step4;
//참조형을 생성하여 원본에는 영향이 없도록!! ->
class B{
	int age;
}
class B1{
	void methodA(B a) {
		a.age = a.age+1; //1로 초기화
		System.out.println(a.age); //1살!
	}
}
public class Bmain {

	public static void main(String[] args) {
		B a = new B();
		B1 a1 = new B1();
		System.out.println(a.age); //0살!
		a1.methodA(a); //0살!
	}

}
