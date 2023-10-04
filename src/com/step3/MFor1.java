package com.step3;
//for문 안에 if문이 꼭 와야 하는지? 비교
public class MFor1 {

	public static void main(String[] args) {
		int i;
		int hap = 0;
		for(i=1;i<4;i++) {
			hap = hap + i;
			System.out.println("i = "  +i);
			System.out.println("hap =" +hap);
		}
		hap = 0;
		for(i=1;i<6;i++) {
			hap = hap + i;
			System.out.println("i = "  +i);
			System.out.println("hap =" +hap);
		}
	}

}
