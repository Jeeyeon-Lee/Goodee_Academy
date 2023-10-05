package com.step4;

public class Array1 {

	public static void main(String[] args) {
		int com[] = new int[3];           //① 3개의 번지가 있는 배열 com 생성
		for(int i=0;i<3;i++) {
			System.out.println(com[i]);   //배열을 3회 반복하여 생성, int 기본값인 0으로 3번 출력
		}
		int my[] = {1,2,3};               //② 배열에 들어가는 값을 아예 표시하여 생성 -> 3개로 지정되어있음. 
		//개선된 for문!! 
		//기존 : i값, 범위, 증감 
		//개선 : 배열자료형 변수명 : 배열명 or 객체명
		for(int i:my) {            
			System.out.println(i);
		}
		int other[] = new int[] {1,2,3};   //③ 생성과 동시에 값을 넣는 식으로 배열 생성
		for(int i : other) {
			System.out.println(i);
		}
	}

}
