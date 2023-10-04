package Practice;

public class Pride {
	int speed;
	//생성자
	public Pride() {
		System.out.println(speed);  //0출력
		System.out.println("Pride 디폴트 생성자 호출");
		speed = 10; //생성자는 전변 초기화 기능 있음. 
		System.out.println(speed);  //그냥 보면 0이 출력될 것 같지만, 0-10, 10출력
	}
	public static void main(String[] args) {
		Pride myCar = null;  //선언만
		myCar = new Pride();
		System.out.println(myCar.toString());
		int speed = 100;
		System.out.println(myCar.speed);  //그냥 보면 0이 출력될 것 같지만, 0-10, 10출력
		myCar.speed = 20;
		System.out.println(myCar.speed);  //그냥 보면 0이 출력될 것 같지만, 0-10-20, 20출력
	}

}
