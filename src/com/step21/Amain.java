package com.step21;
class A{
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
	int tot = 0;
	void hap1() {
		int tot = n1 + n2 + n3;
		//this 뒤의 tot은 전역변수, 뒤의 tot은 지변, 지변에 저장된 tot을 전변으로 올리는 작업
		this.tot = tot;              
	}
}
public class Amain {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.n1); //전변의 n1 값이 출력됨
		a.hap1(); //메소드 hap1 호출
		System.out.println(a.tot); //전변 tot은 외부에서 사용 가능, 지변 tot은 사용 불가
		//이를 해결하기 위해 지변 tot을 전변 tot에 저장되도록 10번 줄에서 작업
  	}

}
