package com.step7;
class A{
	int ival;
	String s;
	String s1 = new String();   //오잉?? 참조형을 인스턴스화??
	public A() {
		s = new String("나신입");
	}
	A(int i){
		s = new String("나초보");
	}
}
public class AMain {
	
	public static void main(String[] args) {
		A a = new A(0);
		System.out.println(a.s);      //나초보
		System.out.println(a.ival);   //0
		a = new A();
		System.out.println(a.s);     //나신입
		System.out.println(a.ival);  //0?? 

	}

}
