package com.step4;

import java.util.Scanner;

class G2{//변수
	int tot;
	double avg;
}
class G3{//스캐너, 합, 평균 메소드  ->G2 클래스를 참조형으로 하도록!
	Scanner sc = new Scanner(System.in);
	void inputNum(G2 g) {
		//배열생성, 반복문 사용, 입력되는 숫자값 저장!
		int[] num = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+" 번째 숫자를 입력하세요");
			num[i] = sc.nextInt();
		}
		//합, 평균구하는 메소드 호출하기!
		g.tot = hap(num[0], num[1], num[2], g);
		g.avg = avg(g);
		System.out.println("세 수의 합은 "+g.tot);
		System.out.println("세 수의 평균은 "+g.avg);
	}
	int hap(int n1, int n2, int n3, G2 g) {
		return n1 + n2 + n3;
	}
	double avg(G2 g) {
		return g.tot/3.0;
	}
}
public class Gmain2 { //실행만 입력
	public static void main(String[] args) {

	G2 g  = new G2();
	G3 g1 = new G3();
	g1.inputNum(g);
	}
}
