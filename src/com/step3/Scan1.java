package com.step3;

import java.util.Scanner;

public class Scan1 {
	public static void main(String[] args) {
		int menu = 0; //초기화
		System.out.println("메뉴 입력.[새게임:1, 정답확인:2, 종료:3]");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			menu = sc.nextInt();
			if(menu ==1) {
				System.out.println("새 게임을 시작합니다.");
			}else if(menu == 2) {
				System.out.println("정답을 확인합니다.");
			}else if(menu == 3) {
				System.out.println("게임을 종료합니다.");
			}
		}System.out.println("for문 종료합니다. ");
	}
}