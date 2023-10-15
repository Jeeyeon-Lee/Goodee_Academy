package practice;

import java.util.Scanner;

class MoonWeight{
	int getUser() {
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		return user;
	}
	double account(int earth) {
		double moon = (earth*17)/100.0;
		return moon;
	}
}
public class MoonWeightmain {

	public static void main(String[] args) {
		MoonWeight mw = new MoonWeight();
		System.out.println("당신의 몸무게를 입력하세요");
		int user = mw.getUser();
		System.out.println("입력한 몸무게는 "+user+" kg 입니다.");
		System.out.println("달에서의 몸무게는 " + mw.account(user)+" kg 입니다.");
	}

}
