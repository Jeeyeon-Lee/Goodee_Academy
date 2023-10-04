package com.step2;

class Param1{
	int ival;
}
public class TestParam1 {
	void effectParam(Param1 p) {
		p.ival = 100;
		System.out.println("sub = "+p.ival);
	}
	
	public static void main(String[] args) {
		Param1 p = new Param1();
		p.ival = 500;
		
		TestParam1 tp = new TestParam1();
		tp.effectParam(p);
		System.out.println("main 2 =" + p.ival);
		
	}

}
