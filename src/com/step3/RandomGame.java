package com.step3;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	int dap = -1;
	
	//게임시작, 숫자를 채번해주는 메소드
	public void newGame() {
		Random r = new Random();
		dap = r.nextInt(10);
	}
	
	//출력값을 계산해주는 메소드 
	public String account(int user) {
//		System.out.println("답은 ? "+dap +"사용자가 누른 값은 ? " +user);
		String hint = "";
		if(dap == user) {
			hint = "정답입니다";
		}else if(dap > user) {
			hint = "높여라";
		}else if(dap < user) {
			hint = "낮춰라";
		}
		return hint;
	}
	//출력값을 출력해주는 메소드
	public void messagePrint(int user) {
		System.out.println(account(user));
	}
	public static void main(String[] args) {
		RandomGame rg = new RandomGame();
		rg.newGame();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("0과 9사이의 숫자를 입력하세요.");
			int user = sc.nextInt();
			String hint = rg.account(user);
			if(hint.equals("정답입니다")){
				System.out.println((i+1)+" 회 실시 : 축하합니다.");
				break;
			}else if(hint.equals("높여라")) {
				System.out.println((i+1)+" 회 실시 : 더 큰 숫자를 입력하세요.");
			}else if(hint.equals("낮춰라")) {
				System.out.println((i+1)+" 회 실시 : 더 작은 숫자를 입력하세요.");
			}
		}
	}

}
