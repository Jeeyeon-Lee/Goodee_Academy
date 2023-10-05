package com.step4;
class F2{
	//생성자 -> 메소드 오버로딩처럼 여러개 생성가능함. 단, 파라미터의 타입이나 갯수가 달라야함.(변수명 상관x)
	F2(){System.out.println();}
	F2(int i){}
	F2(boolean isOk){}
	F2(String a, int i){}
	F2(int i, int j){}
//	F2(int x){} 변수명이 다른것과 상관x, 위 5번에서 이미 인트타입 하나가 있는 생성자가 있어서 생성x
	F2(int i,String a){} //엇, 순서를 바꾸는 건 또 생성이 되네...?
	
}
public class FMain2 {

	public static void main(String[] args) {
		F2 f = new F2();
		System.out.println(f);
		f = new F2(true);
		System.out.println(f);
	}

}
