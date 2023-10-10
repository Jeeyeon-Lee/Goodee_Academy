package com.week3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread {
	JLabel jlbTime = null;
	TimeView tView = null;
	public TimeClient() {	}
	public TimeClient(TimeView timeView) {
		this.tView = timeView;
	}
//	public TimeClient(JLabel jlbTime) {
//		this.jlbTime = jlbTime;
//	}
	//콜백메소드 - actionPerformed - 개발자가 직접 호출하지 못한다.
	@Override
	public void run() {
		System.out.println("run호출");
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String timeStr = null;
		try {
			socket = new Socket("localhost",5000);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			while(true) {
				timeStr = ois.readObject().toString(); //read 가져온 시간 읽어보기
				System.out.println(timeStr);
				//아래코드는 TimeView에서 생성한 JLabel콤포넌트에 직접 출력하는문장
				jlbTime.setText(timeStr);//이 부분이 학습목표임
				try {
					Thread.sleep(1000);  //1초 마다 액션
				} catch (InterruptedException e) {
					System.out.println(e.toString()); //예외 상황일 때 e의 주소 출력하기
				}
			}////////end of while ////////////
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally  { //마지막엔 하나씩 실행된 마지막순으로 종료하기
			try { 
				ois.close();
				oos.close();
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}///////////////end of run /////////////////

	public static void main(String[] args) {
		TimeClient tc = new TimeClient();
		tc.start();
	}
}
