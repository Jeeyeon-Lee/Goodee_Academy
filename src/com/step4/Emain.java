package com.step4;
//2. 리턴타입을 int로 바꾸어서 출력, 그런데 이럴거면 왜 변수만 넣는 클래스를 만들어???? nono
class E{
	int tot;
	int avg;
}
class E1{
	int hap(int n1, int n2, int n3) {
		int tot = n1 + n2 + n3;
		return tot;
	}
}
public class Emain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		E1 d = new E1();
		d.hap(n1, n2, n3);
		System.out.println(d.hap(n1,n2,n3));
	}

}
