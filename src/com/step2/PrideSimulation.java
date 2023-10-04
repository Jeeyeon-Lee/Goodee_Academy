package com.step2;
class Pride{
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getWheelNum() {
		return wheelNum;
	}
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}
	private int speed;
	private int wheelNum;
}
public class PrideSimulation {

	public static void main(String[] args) {
		Pride mycar = new Pride();
		mycar.setSpeed(50);
		Pride jaycar = new Pride();
		jaycar.setSpeed(100);
		Pride yongcar = new Pride();
		//호출은 끝, 각자의 차가 생김 ->속도를 넣고 싶음.->int
		yongcar.setSpeed(30);
		System.out.println("내 차 속도는 "+mycar.getSpeed() +"km");
		System.out.println("제이 차 속도는 "+jaycar.getSpeed() +"km");
		System.out.println("용이 차 속도는 "+yongcar.getSpeed() +"km");
	}

}
