package com.step2;

public class Sungjuc3 {
	//총점을 구하는 메소드 선언
	public int total(int no1, int no2, int no3) {
		int tot = no1 + no2 + no3;
		System.out.println(tot);
		return tot;
	}
	//평균을 구하는 메소드 & 토탈의 값을 가져와서 처리
	public double avg(int tot, double d) {
		return tot/d;
	}
	public static void main(String[] args) {
		Sungjuc3 sj = new Sungjuc3();
		int hap = sj.total(75, 85, 85); //tot이라는 변수에 합 저장 -> total메소드의 파라미터 값으로 사용
		double account = sj.avg(hap, 3.0);   //account 변수에 평균 값 저장 -> avg 메소드의 파라미터 값으로 사용
		System.out.println(account);
	}

}
