package com.step1;

class P{
	static int i = 1;
	int j = 10;
}
public class Test2 {
	public void methodC() {
		System.out.println("if you intance the 'Test2'class, then use this");
	}
	public static void main(String[] args) {
		P.i = 2; //static 이기에 인스턴스화 하지 않아도 기입 가능
		System.out.println(P.i);
		//methodC 사용하기 위해서는 인스턴스화 필요
		Test2 t = new Test2();
		t.methodC();
	}

}
