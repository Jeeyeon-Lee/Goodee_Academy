package practice;

import java.util.Scanner;

//2. 두 개의 정수 중에서 큰 숫자를 반환하는 max메소드를 구현하세요. ->MaxPrint 클래스 생성, max 메소드 추가
//두 개의 정수를 입력 받고 큰 숫자를 출력합니다. Scanner 클래스, nextInt 2번 진행 필요(반복문??)
//
//출력) 정수(두 개) : 5 8
//    최대값 : 8
class MaxPrint{
	int Max(int n1, int n2) {
		if(n1>n2) {
			return n1;
		}else if(n1<n2) {
			return n2;
		}else {
			return -1;
		}
	}
}
public class MaxPrintmain {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		MaxPrint mp = new MaxPrint();
		System.out.println("첫 번째 숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int j = sc.nextInt();
		System.out.println("두 숫자는 "+ i + ", "+j);
		System.out.println("두 수 중 최대값은 "+mp.Max(i, j));
	}

}
