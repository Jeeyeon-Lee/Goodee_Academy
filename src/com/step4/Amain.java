package com.step4;
class A{               //클래스만
	int age = 0;
}
class A1{
	void methodA() {
		A a = new A();
		a.age = a.age +1;
		System.out.println(a.age);  //새로운 객체에 1출력
	}
	int methodA(int age,A a) {
		int order = a.age + 1;
		return order;
	}
}
public class Amain {   //메소드만
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.age);
		A1 a1 = new A1();
		a1.methodA();     //새로운 객체지만, 기본값인 0출력
		//1출력되게 하려면???
		System.out.println(a1.methodA(a.age,a)); //위의 객체값이 덮어써지나??확인 필요
	}

}
