package com.week2;
class Spark{
	int speed = 0;
	String carColor = "검정색";
	int wheelNum = 4;
}
public class Car {
	int speed = 0;
	String carColor = "검정색";
	int wheelNum = 4;
	@Override //annotation -> 제공받는 메소드 toString의 오버라이드
	//기존에는 주소번지를 출력하는 메소드였다면, 아래의 리턴값을 출력하는 메소드로 덮어서 새로 재정의!
	public String toString() {
		return "당신의 자동차는 현재 "+speed+"로 달리고 있고 바퀴수는 "+wheelNum+"이고 색상은 "+carColor+" 입니다.";
		
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		Spark car = new Spark();
		System.out.println(myCar);            //리턴값 출력 오버라이드로 인해 위의 리턴값을 출력하는 것으로 변경
		System.out.println(myCar.toString()); //리턴값 출력 오버라이드로 인해 위의 리턴값을 출력하는 것으로 변경
		//만약 기존의 toString 메소드를 사용하기 위해서는?? 메소드 오버라이딩된 클래스 말고 새로운 클래스 생성!!
		System.out.println(car);            //기존 toString메소드 실행
	}

}
