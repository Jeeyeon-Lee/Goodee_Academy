package achat.step1;
//클라이언트를 맞이하는 클래스(순서, 정보를 서버스레드에 전달 accept?? )
import java.awt.Color;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//왜 스레드를 굳이 상속받는 건가요? - 화면처리하는 메인메소드와 통신채널 설정하는 코드 분리
//같이 진행되면 지연이 될 수 있는 각 코드를 각자의 흐름으로 흐르도록 나눔
//run 메소드를 오버라이드하여 나눔. 
public class ChatServer extends Thread {
	//List의 구현체 클래스는 ArrayList(스레드불안전-조치가 없다, 배려가 없다.추가로직이 포함안됨), Vector(동시접속자를 배려하여 0.1초라도 먼저 들어오면 관리를 해준다.읽기 쓰기 속도가 느리다.)
	//챗서버에 접속해온 사용자에 대한 정보를 담는 벡터 선언임
	//다수의 클라이언트 요청을 처리하는 서버를 개발할때 사용함
	/*선언부*/
	List<ChatServerThread> globalList = null;  //접속하는 클라이언트의 정보(순서에따라)
	//클라이언트 맞이(순서)
	ServerSocket server = null;
	//말하기, 듣기
	Socket socket = null;
	JFrame jf = new JFrame();
	JTextArea jta_log = new JTextArea(10,60);
	JScrollPane jsp_log = new JScrollPane(jta_log
			 , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED //스크롤바 필요시 생김
			 , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //가로는 늘어나지않음
	/*생성자*/
	public ChatServer() {}
	/*정의메소드*/
	@Override
	public void run() {
		globalList = new Vector<ChatServerThread>(); //vector로 하는 이유? 멀티스레드에 용이
		jta_log.append("Server Ready......\n"); //새로 들어올 때 로그 부분에 붙이기
		boolean isStop = false;
		try {
			server = new ServerSocket(3002);
			jta_log.append("Server Ready.........\n");
			while(!isStop) {
				//서버소켓에 접속해온 사용자의 소켓정보를 담는다.
				//socket = server.accept();
				jta_log.append("client info:"+socket+"\n");			
				//아래에서 this는 ChatServer가리킨다
				System.out.println(this);
				ChatServerThread tst = new ChatServerThread(this);
				tst.start();//ChatServerThread의 run호출된다.
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void initDisplay() {
		jta_log.setLineWrap(true);
		jf.setBackground(Color.orange);
		jf.add("Center", jsp_log);
		jf.setTitle("서버측 로그 출력화면 제공...");
		jf.setSize(800, 600);
		jf.setVisible(true);
	}
//메인메소드도 스레드라 했잖아요?
//entry point - 시작점 - exe 생성가능함 - 경합벌어진다. - 끼어든다		
	/*메인메소드*/
	public static void main(String[] args) {
		ChatServer cs = new ChatServer();
		System.out.println(cs);
		cs.initDisplay();
		cs.start();           //run 메소드 실행
	}
}