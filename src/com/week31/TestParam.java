package com.week31;
class Param{
	int ival;
}
public class TestParam {
	public TestParam() {
		System.out.println("디폴트 생성자");
	}
	public void effectParam(Param p) {
		System.out.println(p);
	}
	public static void main(String[] args) {
		TestParam tp = null;
		System.out.println(tp);
		tp = new TestParam();
		System.out.println(tp);
		Param p = new Param();
		System.out.println(p);
		tp.effectParam(p);
	}

}
