package com.step1;

public class Variable2 {
	//static 여부에 따라 메인메소드(static 써있음) 호출여부 결정
	static int i = 5;
	int j = 1;
	public static void main(String[] args) {
		System.out.println(i); //static 호출 가능
//		System.out.println(j); //static 없어 불가능 나오게 하는법은? 인스턴스하여 출력
		Variable2 myCar = new Variable2();
		System.out.println(myCar.j);
		Variable2 v = new Variable2();
		System.out.println(v.j);
		
		
	}

}
