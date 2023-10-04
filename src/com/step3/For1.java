package com.step3;

public class For1 {

	public static void main(String[] args) {
		int i = 0;
		for(i=1;i<=100;i++) {
			System.out.println(i);
			if(i%2==0) {
				System.out.println("짝수");
			}else if(i%2==1) {
				System.out.println("홀수");
			}
		}System.out.println("for문 탈출!! i ==>" + i);
	}

}
