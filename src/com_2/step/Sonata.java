package com_2.step;

public class Sonata {
	int speed = 0;
	int wheelNum = 4;
	String carColor = "검정색";
	
	public static void main(String[] args) {
		Sonata myCar = null;
		myCar = new Sonata();
		Sonata herCar = new Sonata();
		herCar.speed = 50;
		System.out.println(myCar.speed);
		System.out.println(herCar.speed);
	}

}
