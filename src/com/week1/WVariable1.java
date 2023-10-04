package com.week1;


class Dog{
	//클래스 선언 바로 뒤에 붙여서 선언
	int leg = 4;
	public void running() {
		int leg = 6;
		System.out.println("running method value "+leg); 
	}
}
public class WVariable1 {
	int leg = 6;
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		System.out.println("Dog class value "+myDog.leg); //출력 4
		//6을 출력하려면??? 메소드를 호출
		myDog.running();
		WVariable1 wv = new WVariable1();
		System.out.println("running  method value "+wv.leg);
		
	}

}
