package collec.map;
//추상클래스 - 인스턴스화 불가능하지만 메소드, 생성자 작성 가능
//인터페이스가 추상클래스보다 더 추상적인 것 증명
public abstract class Car { 
	int speed;
	String carName;
	String carColor;
	public Car() {
	}
	public abstract void display();
	public void go() {
		speed = speed +1;
	}
	public void stop() {
		speed = speed -1;
	}
		

}
