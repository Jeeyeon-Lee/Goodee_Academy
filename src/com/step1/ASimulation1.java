package com.step1;

class A1{
	int i = 1;
}
public class ASimulation1 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.i = 2;
		System.out.println(a.i);
		int j = a.i;
		System.out.println(a.i);
		System.out.println(j);
	}

}
