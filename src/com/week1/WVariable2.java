package com.week1;
class Dog2{
	int leg = 4;
	public void running() {
		int leg = 6;
		System.out.println(leg); //6 : 위 초기화된 값 출력
	}
}
public class WVariable2 {
	int leg = 8;
	
	public static void main(String[] args) {
		Dog2 myDog = new Dog2();
		System.out.println(myDog.leg); //4 : Dog 클래스의 전변 출력
		int leg = 3; //이건 그냥 메인메소드에 생성된 새로운 변수 leg의 값 초기화 된 것 
		System.out.println(leg); //3 : 메인메소드 지변인 leg 값 출력
		//WVariable클래스 다리 값 8 출력하고 싶어!! 
		WVariable2 wv = new WVariable2();
		System.out.println(wv.leg); //8 : WVariable클래스의 기본값 출력
		//6 출력하고 싶어!! 1. 6아래에 출력(초급 방법), 2 Dog 클래스의 메소드를 만들어서 출력!
		//Dog 클래스의 메소드니까 그 인스턴스 변수인 myDog 사용 필요
		myDog.running(); //6 : Dog 클래스의 메소드를 사용하여 출력한 값
		
	}

}
