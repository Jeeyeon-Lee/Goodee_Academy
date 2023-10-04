package com.step21;
class B{
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
	int hap1() {                       //리턴값이 있는 int 리턴타입 사용
		int hap = n1 + n2 + n3;
		return hap;
	}
	int hap1(int n1, int n2, int n3) { //파라미터 안은 지변의 자리, 초기화 생략x, 호출할 때 값 넣기
		int hap = n1 + n2 + n3;
		return hap;
	}
}
public class Bmain {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.hap1());           //6번 줄의 전변을 쓴 hap1 실행
		System.out.println(b.hap1(50, 60, 70)); //10번 줄의 지변을 쓴 hap1 실행
		
	}

}
