package com.step1;

public class Sonata {
	int speed = 0;
	int wheelNum = 4;
	String carColor = "black";
	public static void main(String[] args) {
		Sonata myCar = null;
		myCar = new Sonata();
		Sonata herCar = new Sonata();
		herCar.speed = 50;
		herCar.carColor = "white";
		System.out.println(myCar.speed);
		System.out.println(herCar.speed);
		
		
	}

}
