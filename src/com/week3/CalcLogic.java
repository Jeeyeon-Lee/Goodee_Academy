package com.week3;

public class CalcLogic {
	//생성자, 그 전에 유지와 동기화를 위해 초기화 필요
	CalcView2 calcView2 = null;
	public CalcLogic(CalcView2 calcView2) {
		System.out.println("객체 주입(원본), 현재 메모리에 로딩중"+calcView2); //원본인지 확인위해!
		this.calcView2 = calcView2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
