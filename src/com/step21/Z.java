package com.step21;

public class Z {
	int i = 1;
	void m1() {
		Z z = new Z();   //새로운 객체 2 생성
		System.out.println("@4e50df2e : "+z);
		System.out.println(z.i);
		m2(z);
	}
	void m2(Z a) {      //객체 2의 주소 사용
		System.out.println("@4e50df2e : "+a);
	}
	void m3() {
		Z z = new Z();   
		System.out.println("@1d81eb93 : "+z);
	}
	public static void main(String[] args) {
		Z z = new Z();  //새로운 객체 1 생성
		System.out.println("@2f4d3709 : "+z);
		z.m1();         //z클래스의 m1 메소드 실행
//		z.m2();         //왜 실행 안될까??
		z.m3();         
		System.out.println("@2f4d3709 : " +z);
	}

}
