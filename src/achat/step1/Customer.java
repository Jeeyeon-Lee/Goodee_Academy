package achat.step1;

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

}
