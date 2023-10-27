package collec.map;

public class CarSonata extends Car{

	public void stop() {
		System.out.println("Sonata stop 호출");
		speed = speed -4;
	}
	public static void main(String[] args) {

	}

	@Override
	public void display() {
//		Car myCar = new Car(); //불가 왜?? 생성자에는 구현체클래스만 올 수 있음. 
		Car myCar = new CarSonata();
		myCar.stop();
		CarSonata himCar = new CarSonata();
		himCar.stop();
	}

}
