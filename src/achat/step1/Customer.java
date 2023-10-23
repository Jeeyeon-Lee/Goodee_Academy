package achat.step1;
<<<<<<< HEAD
//자바는 상속은 하나만 되기 떄문에 스레드도 상속을 받아야 할 상황이라면, implements로 runnable을 사용
//run의 메소드를 재정의하여 사용 가능 
//스레드를 인스턴스화 하여 사용하면 상속받아서 사용하는 것처럼 사용 가능
import javax.swing.JFrame;

public class Customer extends JFrame implements Runnable{
	public static void main(String[] args) {
		Customer ct = new Customer();
		ct.run();
		Thread th = new Thread(ct);
		th.start(); //run의 경우, 스타트 호출시 시스템이 적당한 시기에 대신 호출 함
	}
	@Override
	public void run() {
		//빵주세용
		System.out.println("run 호출");
	}
=======

import javax.swing.JFrame;

public class Customer extends JFrame implements Runnable {

	public static void main(String[] args) {
		Customer ct = new Customer();
		Thread th = new Thread(ct);
//		ct.run(); run은 이미 호출할 수 있는 상태임
		th.start(); //적당한 시기에 런메소드를 실행함. 
		
	}

	@Override
	public void run() {
		System.out.println("run메소드 호출 성공");
	}

>>>>>>> f22ff6d251a8738d0b3a1d87c95db76d1b1b82e2
}
