package com.step3;

public class For2 {
	public static void main(String[] args) {
		int i   = 0;
		int hap = 0;
		for(i=1;i<4;i++) {
			hap = hap + i;
			System.out.println(i+", "+hap);
		}
		System.out.println("총 합은? " +hap);
		hap = 0;
		for(i=1;i<6;i++) {
			hap = hap + i;
		}
		System.out.println("총 합은? " +hap);
	}
}
