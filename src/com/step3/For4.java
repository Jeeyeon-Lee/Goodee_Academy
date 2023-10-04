package com.step3;
//3의 배수일때 더하기, i<11
public class For4 {

	public static void main(String[] args) {
		int i = 0;
		int hap = 0;
		for(i=1;i<11;i++) {
			if(i%3 == 0) {
				hap = hap + i;
				System.out.println(hap);
			}
		}
		System.out.println("1부터 10까지 세면서 3의 배수를 더한 값은 ? "+hap);
	}

}
