package com.step3;
//변수는 몇개가 필요하지?
//변수의 타입은 뭘로 할까요?
//for문 안에 if문이 오는 거야? 아님 if문 안에 for문이 와야 하나요?
//조건을 따질 때 fizz를 먼저 따져야 하나?
//아니면 fizzbuzz인 경우 즉 5와 7의 공배수를 먼저 따져야 하는지? - 결과에 영향이 있다
//35는 5로 나누어 나머지가 0인지를 먼저 비교하면 fizz출력하므로
//원하는 결과가 아니다.
//조건을 따질때도 순서가 결과에 영향이 있다.
public class FizzBuzzGame {

	public static void main(String[] args) {
		int i = 0;
		for(i=1;i<=1000;i++) {
			if(i%7==0 & i%5==0) {
				System.out.println("fizzbuzz");
			}
			else if(i%5==0) {
				System.out.println("fizz");
			}else if(i%7==0) {
				System.out.println("buzz");
			}else{
				System.out.println(i);
			}
		}
	}

}
