package com.step3;

public class MFor2 {

	public static void main(String[] args) {
		int i = 0;
		int hap = 0;
		for(i=1;i<6;i++) {
			hap = hap + i;
			System.out.println(i);
			System.out.println(hap);
			if(i%2 == 0) { //짝수   //마지막 나가기 전의 i 값이 아래에 기입됨. 
				System.out.println(i + " 짝수입니다.");  //i는 4
			}else { 
				System.out.println(i + " 홀수입니다.");  //i는 5
			}
		}
	}

}
