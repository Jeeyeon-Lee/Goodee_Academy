package com.step5;
//생성자의 파라미터에 참조된 클래스 -> 모두 같은 주소값, 원본
class A1{
	int i;
	public A1() {
		System.out.println("파라미터값 없는 A1");
	}
	public A1(AMain a) {
		System.out.println(a);
	}
}
class A2{
	A2(){
		System.out.println("파라미터값 없는 A2");
	}
	A2(AMain a){
		System.out.println(a);
	}
	public void methodA() {
		System.out.println("methodA 호출");
	}
}
public class AMain {
	int j = 10;
	A1 a1 = new A1(this);
	A2 a2 = new A2(this);
	public static void main(String[] args) {
		AMain a = new AMain(); //AMain 선언부실행하여 파라미터값있는 A1,A2 경유
		System.out.println(a); //AMain 원본값 출력 ->28, 29. 30은 다 같은 값 출력 
		A1 a1 = new A1(a); //a주소 출력
		a1 = new A1();     //파라미터없는 A1 
		System.out.println(a1);
		A2 a2 = new A2();  //파라미터없는 A2
		System.out.println(a2);
		a2 = new A2(a); //여기서 참조해서 생성해서 얘도 원본과 주소 같음! 
	}

}
