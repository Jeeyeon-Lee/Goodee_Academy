package com.step3;

import java.util.Scanner;

//연습문제
//1. 달의 중력은 지구 중력의 17%에 불과합니다. 
//지구에서 몸무게가 100kg인 사람은 달에 가면 17kg밖에 안됩니다. (입력값에 따른 계산 -> mw에 account메소드 -> double)
//당신의 몸무게는 달에서 얼마입니까? (클래스 추가 MoonWeight)
//몸무게 N은 실수이고 키보드로부터 입력받습니다.(사용자입력 -> mw에 getUser 메소드 int)
//
//출력)  지구몸무게  : 100
//    달 몸무게 : 17kg

class MoonWeight{
	int getUser() {
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		return user;
	}
	double accoutnt(int user) {  //달 무게로 계산 -> (지구무게 * 17) /100 ->지구무게를 파라미터 값으로 가져와야 함.
		double moon = 0.0;
		moon = (user*17)/100.0;
		return moon;
	}
}

public class MoonWeightMain {
	public static void main(String[] args) {

	MoonWeight mw = new MoonWeight();
	System.out.println("자신의 몸무게를 입력해 주세요.");
	int user = mw.getUser();	
	System.out.println("입력한 몸무게는 "+user+"kg 입니다.");
	System.out.println("달의 몸무게는 " +mw.accoutnt(user)+"kg 입니다.");
	}
}
