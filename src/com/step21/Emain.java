package com.step21;

import java.util.Scanner;

class E{
	Scanner sc = new Scanner(System.in);
	//첫번째 값 갖는 메소드
	public int getFirst() {
		int num = 0;
		num = sc.nextInt(); //스캐너에 뜨는 창에 숫자 입력하는 메소드
		return num;
	}
	public int getSecond() {
		int num = 0;
		num = sc.nextInt(); //스캐너에 뜨는 창에 숫자 입력하는 메소드
		return num;
	}
	public int add(int first, int second) {
		return first + second;
	}
	public int minus(int first, int second) {
		return first - second;
	}
	public int multi(int first, int second) {
		return first * second;
	}
	public double divid(int first, int second) {
		return first / (double)second;
	}
	//나온 값에 따라 add, minus, multi, divid 함수 필요
}
public class Emain {
	public static void main(String[] args) {
		E e = new E();
		System.out.println("첫 번째 숫자를 입력하세요");
		int first = e.getFirst();
		System.out.println("첫 번째 숫자 = " + first);
		System.out.println("두 번째 숫자를 입력하세요");
		int second = e.getSecond();
		System.out.println("두 번째 숫자 = " + second);
		System.out.println("두 수의 합 = " + e.add(first, second));
		System.out.println("두 수의 차 = " + e.minus(first, second));
		System.out.println("두 수의 곱 = " + e.multi(first, second));
		System.out.println("두 수의 나누기 = " + e.divid(first, second));
	}
}
