package practice;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	int dap = -1;
	
	public void newGame() {
		Random r = new Random();
		dap = r.nextInt(10);
	}
	public String account(int user) {
		System.out.println("채번된 숫자는 " + dap);
		String hint = "";
		if(dap == user) {
			hint = "정답입니다";
		}
		else if(dap > user) {
			hint = "높여라";
		}
		else if(dap < user) {
			hint = "낮춰라";
		}
		return hint;
	}
	
	public static void main(String[] args) {
		RandomGame rg = new RandomGame();
		rg.newGame();
		System.out.println("0~9 사이 값을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			int user = sc.nextInt();
			String hint = rg.account(user);
			if(hint.equals("정답입니다")) {
				System.out.println("축하합니다. 정답입니다.");
				break;
			}else if(hint.equals("높여라")) {
				System.out.println("더 높은 숫자를 입력하세요.");
			}else if(hint.equals("낮춰라")) {
				System.out.println("더 낮은 숫자를 입력하세요.");
			}
		}
	}
}
