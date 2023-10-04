package com.step4;

import java.util.Scanner;

//3. 원본, 전변 다 살려서 해보자! 어떻게? 참조형으로 사용!
class G{
	int tot;
	double avg;
}
class G1{ //메소드 담기는 클래스에서 변수의 클래스를 참조하는 식으로 사용!
	//숫자 세개는 입력받는 식으로 만들어보자, Scanner 사용
	//세 개를 저장하는 것은 배열로 받고, 값은 num에 저장
	Scanner sc = new Scanner(System.in);
	void inputNum(G a) {
		int[] num = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+ " 번째 숫자를 입력하세요.");
			num[i] = sc.nextInt();
		}
		a.tot = hap(num[0], num[1], num[2], a);
		System.out.println("합 : "+ a.tot);
		a.avg = avg(a);
		System.out.println("평균 : "+a.avg);
	}
	int hap(int n1, int n2, int n3, G a) {
		return n1 + n2 + n3;
	}
	double avg(G a) {
		return a.tot / 3.0;
	}
}
public class Gmain {

	public static void main(String[] args) {
		G a    = new G();
		G1 a1  = new G1();
		a1.inputNum(a);
	}
}