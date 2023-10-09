package practice;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.attribute.AclEntryPermission;
import java.util.Calendar;

import com.week3.TimeServer;


public class TimeServer extends Thread {
	Socket client = null;
	public TimeServer(Socket client) {
		this.client = client;
	}
	public String getTime() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		return hour + ":"+min+ ":"+sec;
	}
	@Override
	public void run() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
			while(true) {
				System.out.println("server run 호출");
				oos.writeObject(getTime());
				try {
					sleep(1000);
				} catch (Exception e) {
					System.out.println(e.toString());
				}finally {
					try {
						client.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		} catch (Exception e) {
		}
	}
	public static void main(String[] args) {
		int port = 5000;
		ServerSocket server = null;  //존재만 함. 일x, ServerSocket은 예외처리를 반드시 하게 되어있는 클래스임. 
		Socket client = null;           //일을 하는 소켓
		try{
			server = new ServerSocket(port);
		} catch (IOException ie) {
			System.out.println("해당 포트는 이미 사용중입니다.");
			try {
				server.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			} 
		}
		System.out.println("TimeServer started successfully");
		while(true) { //서버 24시간 작동 무한루프앞에선 예약만 받고, 서버가 자리로 안내하는...?!
			try {
				client = server.accept();
				if(client != null) {
					System.out.println(client);					
				}
				System.out.println("New client connected..."+client.getInetAddress());
				//메소드 안에서 선언된 클라이언트소켓을 런메소드에서 사용하고 싶어서 파라미터값에 넣어서 초기화시켜 사용
				TimeServer ts = new TimeServer(client); 
				ts.start();
				System.out.println("New TimeServer Thread started...");
			} catch (Exception e) {
				System.out.println("Can't start server thread!!");
				e.printStackTrace(); //에러에 대한 정보를 확인할 수 있음. 디버깅할 때 많이 사용함.
				try {
					client.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}