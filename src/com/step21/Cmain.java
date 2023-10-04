package com.step21;
class C{
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
}	
class C1{
	int hap1() {                       //리턴값이 있는 int 리턴타입 사용
		C c = new C();                 //데이터가 있는 클래스를 인스턴스화
		int hap = c.n1 + c.n2 + c.n3;  //전변을 hap이라는 지변에 저장
		return hap;
	}
	int hap1(C c) { //파라미터 안은 지변의 자리, 초기화 생략x, 호출할 때 값 넣기
		int hap = c.n1 + c.n2 + c.n3;
		return hap;
	}
}
public class Cmain {

	public static void main(String[] args) {
		C c = new C();
		C1 a = new C1();
		int hap = a.hap1();
		System.out.println(hap);
		c.n1 = 50;
		c.n2 = 60;
		c.n3 = 50;
		hap = a.hap1(c);
		System.out.println(hap);
		
	}

}
