package com.week1;
class Account{
	int first;//이것은 전변이라서 초기화를 하지 않아도 0을 가지고 있다.
	int second;//0
	public void hap1() {//메소드 호출은 main메소드 안에서 해야 합니다.
		int first = 2;
		int second = 3;
		System.out.println(first + second);//0+0=> 0-> 5
	}
	public void hap2(int first, int second) {//first=1, second=3넘어왔지만
		//first = 0;//재정의 되었다 1이었는데 15을 지나면서 0으로 변했다.
		//second = 1;
		System.out.println(first+second);//1
	}
}//end of Account

public class AccountSimulation {

	public static void main(String[] args) {
		Account as = new Account();
		as.hap2(0,0);//첫번째 0이 출력되는 메소드 호출한것임
		//메소드 호출할땐 반드시 파라미터 갯수나 타입도 맞춰줘야함
		//as.hap2(0,false);
		//as.hap2(0,"안녕");
		as.hap1();//0을 출력하는 것은 12번 라인에 적힌 문장이 출력해준다.
	}
}
