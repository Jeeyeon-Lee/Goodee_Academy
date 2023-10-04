package com.week1;

class Sonata{
	int speed = 0;
	String carColor = "red";
}
public class WReturn3 { //메소드 앞에 타입이 클래스로 온 경우,리턴타입 필요!!
	Sonata getCar() {
		Sonata himCar = new Sonata(); //himCar 객체 생성
		return himCar;
	}
	
	public static void main(String[] args) {
		Sonata myCar = new Sonata();         //myCar 객체 생성
		System.out.println("just call global v"+myCar.carColor); 
		Sonata himCar = new Sonata();
		System.out.println("just call global v = "+himCar.carColor); //똑같이 이렇게 하면 red로 출력됨. 전역변수가 불러와지기 때문
		//메소드를 만들어야함. 새로운 카를 저장하는 getCar를 만들고, 거기서 새로운 객체 형성을 하도록!!
		himCar.carColor = "black";
		System.out.println(himCar.carColor);
		himCar.speed = 30;
		System.out.println(himCar.speed);
	}

}
