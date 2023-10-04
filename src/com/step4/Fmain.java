package com.step4;
//3. 원본, 전변 다 살려서 해보자! 어떻게? 참조형으로 사용!
class F{
	int tot;
	int avg;
}
class F1{ //메소드 담기는 클래스에서 변수의 클래스를 참조하는 식으로 사용!
	int hap(int n1, int n2, int n3, F a) {
		a.tot = n1 + n2 + n3;
		return a.tot;
	}
}
public class Fmain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		F a    = new F();
		F1 a1  = new F1();
		System.out.println(a1.hap(n1,n2,n3,a));
	}
}