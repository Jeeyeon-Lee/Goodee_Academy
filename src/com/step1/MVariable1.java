package com.step1;

class M{
	int i = 10;
	void methodA() {
		M m = new M();
		System.out.println(m.i); //값 : 5, 여기서 i 는 로컬변수 i
	}
}
public class MVariable1 {
	void methodA() {
		M m = new M();
		m.i = 8;
		System.out.println(m.i); 
	}
	public static void main(String[] args) {
		MVariable1 m1 = new MVariable1();
		m1.methodA(); //메소드 내부의 값은 지역변수, 따라서 전역변수 10이 출력
		M m = new M();
		m.methodA();
	}

}
