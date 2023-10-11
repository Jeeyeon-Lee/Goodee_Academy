package com.step5;
class C{
	int i;
	//인스턴스화의 또 다른 방법!
	C getInstance() {
		return new C();
	}
}
public class CMain {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.i);                  //0
		System.out.println(c.getInstance().i);    //0
		c.i = 10; //초기화 시  
		System.out.println(c.i);                  //10
		System.out.println(c.getInstance().i);    //0
	}
}
