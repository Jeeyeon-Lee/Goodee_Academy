package review.week5;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread{
	/*선언부*/
	JLabel jlbTime = null;
	TimeView tView = null;
	TimeView timeView = null;
	/*생성자*/
	public TimeClient(TimeView timeView) {
		this.timeView = timeView;
	}
	public TimeClient() { 	}
	/*정의메소드*/
	@Override //소켓을 생성하는 메소드
	public void run() {
		System.out.println("run 메소드 호출");
		//소켓, oos, ois 선언만해두고, 어떻게 사용?
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		//예외처리
		try {
			String timeStr = null; //타이머를 선언
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			while(true) {
				//TimeServer에서 1초마다 getTime() 호출로 알아낸 시간 정보를 oos.writeObject(getTime())하면
				//아래에서 들을 수 있다.
				timeStr = ois.readObject().toString();
				System.out.println(timeStr);
				//아래코드는 TimeView에서 생성한 JLabel콤포넌트에 직접 출력하는문장
				//NullPointerException이 발생하지 않도록 맞는 생성자를 호출하기
				System.out.println("TimeClient : "+jlbTime);
				tView.jlbTime.setText(timeStr);//이 부분이 학습목표임
				tView.jf.setTitle(timeStr);
				try {
					sleep(10000);
				} catch (InterruptedException e) {
					System.out.println(e.toString());
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				ois.close();
				oos.close();
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	/*메인메소드*/
	public static void main(String[] args) {
		TimeClient tc = new TimeClient();
		tc.start();
	}
}
