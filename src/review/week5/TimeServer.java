package review.week5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class TimeServer extends Thread {
	/*선언부*/
	Socket client = null;
	/*생성자*/
	public TimeServer(Socket client) {
		this.client = client;
	}
	/*정의메소드*/
	//Calendar 인터페이스에서 시간 가져오기 
	public String getTime() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		return (hour < 10 ? "0" + hour : "" + hour) + ":" +
		(min < 10 ? "0" + min : "" + min)  +	":" +
		(sec < 10 ? "0" + sec : "" + sec) ;
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
					e.getStackTrace();
				}
			}
		} catch (Exception e) {
			try {
				client.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			// TODO: handle exception
		}
	}
	
	/*메인메소드*/
	public static void main(String[] args) {
		int port = 5000;
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e2) {
			System.out.println("해당 포트는 사용중입니다. ");
			e2.getStackTrace();
			try {
				server.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("TimeServer started successfully");
			while(true) {
				try {
					client = server.accept();
					if(client !=null) {
					}
					System.out.println("New client connected...");
					TimeServer ts = new TimeServer(client);
					ts.start();
					System.out.println("New TimeServer Thread started...");
				}catch (Exception e) {
					System.out.println("Can't start server thread!");
					e.getStackTrace();
				}
				try {
					client.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		 }
		} 
	}
