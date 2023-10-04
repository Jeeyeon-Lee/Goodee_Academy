package com.step3;
//문제 - 1부터 10까지 세면서 홀수의 합(hap)을 구하시오.
//문제 - 1부터 10까지 세면서 짝수의 합(hap1)을 구하시오.
public class For3 {
	public static void main(String[] args) {
		int i    = 0;
		int hap  = 0;
		int hap1 = 0;
		for(i=1;i<11;i++) {
			if(i%2==1) {
				hap = hap + i;
			}else if(i%2==0) {
				hap1 = hap1 + i;
			}	
		}
		System.out.println("홀수의 합은? "+hap);
		System.out.println("짝수의 합은? "+hap1);
	}
}
