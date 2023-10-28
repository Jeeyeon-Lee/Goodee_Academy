package com_2.step_2;
class Param{
	int ival;
}
public class TestParam {
	public void effectParam(Param p) {
		p = new Param();
		p.ival = 100;
		System.out.println("sub ival ==> " + p.ival);		
	}
	public static void main(String[] args) {
		Param p = new Param();
		System.out.println("main ival ==> " + p.ival);
		p.ival = 500;
		System.out.println("main ival ==> " + p.ival);
		TestParam tp = new TestParam();
		tp.effectParam(p);
		System.out.println("main ival ==> " + p.ival);
	}

}
