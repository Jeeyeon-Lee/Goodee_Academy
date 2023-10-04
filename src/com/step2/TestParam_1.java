package com.step2;

class Param_1{
	int ival;
}
//함수 effectiveParam
public class TestParam_1 {
	void effectiveParam(Param_1 p) {
		p = new Param_1();
		p.ival = 100;
		System.out.println(p.ival);
	}
		
	public static void main(String[] args) {
		Param_1 p=new Param_1();
		p.ival = 500;
		TestParam_1 tp=new TestParam_1();
		tp.effectiveParam(p);
		System.out.println(p.ival);
		
		
	}

}
