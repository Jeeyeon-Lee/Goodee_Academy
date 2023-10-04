package com.week2;
//생성자 사용!! -> JVM 실행 순서 : 메인메소드 호출까지 실행-생성자-메인메소드 마무리 진행
public class Pride {
	int speed = 0;
	//디폴트 생성자 - 파라미터 값이 없는 생성자, JVM이 대신 입력해줌.
	public Pride() {
		System.out.println("Pride() 디폴트 생성자 호출 성공!");
		System.out.println(speed);            // 0 (디폴트 값 : 0 출력)
		speed = 10;    //인스턴스변수 없이 접근 가능한 이유 -> static이 없음(메인은 있어서 인스턴스화 필요)
	}

	public static void main(String[] args) {
		Pride myCar = null; //선언만 함. 주소x, 실행x -> 실행을 조절할 수 있는 것이 보통 이상!
		myCar = new Pride(); 
		System.out.println(myCar.speed);      //10 (기본값 : 0 -> 생성자 : 10)
		System.out.println(myCar.toString()); //주소출력-toString은 제공받는 메소드(소유주 Object)
		int speed = 100;  //지변 speed
		System.out.println(speed);            //100
		myCar.speed = 20; //전변 speed          //(메인에서 초기화 : 20)
		System.out.println(myCar.speed);      //20 (과정을 거쳐 최종으로 20 출력) 

	}
}
