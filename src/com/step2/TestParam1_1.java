package com.step2;
class Param1_1{
	int ival;
}
public class TestParam1_1 {
	void effectiveParam(Param1_1 p) {
		p.ival = 100;
	}
	public static void main(String[] args) {
		Param1_1 p=new Param1_1();
		p.ival = 500;
		System.out.println(p.ival);
		
		TestParam1_1 tp=new TestParam1_1();
		tp.effectiveParam(p);
		System.out.println(p.ival);
		
	}

}
