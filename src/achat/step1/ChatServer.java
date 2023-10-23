package achat.step1;
<<<<<<< HEAD
//왜 Thread를 상속받나요? 
//메인메소드(entry porint)도 스레드라고 했는데? -> 시작점, exe 파일 생성, 경합 벌어짐 -> 끼어듬이 발생
//따라서 Thread를 따로 상속받아서 화면을 처리하는 메인메소드와 통신채널을 설정하는 코드를 분리한다. 
//스레드를 나누는 혜택은? 안전한 서비스 제공 가능

import java.awt.Color;
=======
//클라이언트를 맞이하는 클래스(순서, 정보를 서버스레드에 전달 accept?? )
import java.awt.Color;

>>>>>>> f22ff6d251a8738d0b3a1d87c95db76d1b1b82e2
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
<<<<<<< HEAD
import javax.swing.JTextArea;

import atalk.step1.TalkServerThread;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class ChatServer extends Thread {
	/*선언부*/
	//List의 구현체 클래스 중 Vector를 사용한다. 왜?? 
	//array - 스레드에서 불안전
	//vector -멀티 스레드에서 안전(안전장치 있음) but, 읽기 쓰기 속도 느림(if문과 같은 로직이 더 들어가기 때문)
	//챗서버에 접속한 사용자의 정보를 담는 벡터선언 
	//다수의 클라이언트 요청을 처리하는 서버를 개발할 때 사용
	List<ChatServerThread> globalList = new Vector<>(); 
	JFrame jf = new JFrame();
	ServerSocket 			server 		= null;
	//서버는 들은 내용을 말하는 것
	//실제로 듣고 말하기는 ChatServerThread에서 처리(개발자가 설계) 
	//run메소드에서 서버소켓에 들어온 클라이언트 정보를 받게 됨. 
	//메소드 내부에서 사용하려면 전변으로 하기
	Socket 					socket 		= null;
	JTextArea jta_log = new JTextArea(10,60);
	//로그창에 대한 설정 -> 수평 사용x, vertical 필요시 사용o
	JScrollPane jsp_log = new JScrollPane(jta_log
			,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	@Override
	public void run() {
		//서버에 접속해온 클라이언트 스레드 정보를 관리할 벡터 생성하기 
//		System.out.println("ChatServer의 run 호출");
		globalList = new Vector<>();
=======

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
>>>>>>> f22ff6d251a8738d0b3a1d87c95db76d1b1b82e2
		boolean isStop = false;
		try {
			server = new ServerSocket(3002);
			jta_log.append("Server Ready.........\n");
			while(!isStop) {
<<<<<<< HEAD
				//서버소켓에 접속해온 사용자의 소켓 정보를 담음 
//				socket = server.accept();
				jta_log.append("client info:"+socket+"\n");	
				//아래에서 this는 ChatServer를 나타냄. 
				ChatServerThread tst = new ChatServerThread(this);
				//아래 start에서 ChatServer의 run이 호출됨. 
				tst.start();
				break; //반복문 탈출 
=======
				//서버소켓에 접속해온 사용자의 소켓정보를 담는다.
				socket = server.accept();
				jta_log.append("client info:"+socket+"\n");			
				//아래에서 this는 ChatServer가리킨다
				System.out.println(this);
//				ChatServerThread tst = new ChatServerThread(this);
				Thread tst = new ChatServerThread(this); //다형성이 있는 유형으로 많이 사용됨. 
				tst.start();//ChatServerThread의 run호출된다.
>>>>>>> f22ff6d251a8738d0b3a1d87c95db76d1b1b82e2
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
<<<<<<< HEAD
		
	//말하기 처리는 메소드로 분리, 왜? 서버에 접속한 사람들에게(for문) 동일하게 메시지를 전달해야하기 때문 

	/*생성자*/
	/*정의메소드*/
	public void initDisplay() {
		jta_log.setLineWrap(true);//자동 줄바꿈
		jf.setBackground(Color.orange);
		jf.add("Center",jsp_log);
		jf.setTitle("Server Log Print");
		jf.setSize(800,600);
		jf.setVisible(true);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		ChatServer cs = new ChatServer();
		//start와 run의 start의 위치 선정 중요 -> run-start는 지연이 발생할 수 있어서 후순위로 넣어야 함.
		//메소드들의 처리되는 시간(time-line) 다르다. 이 때문에 각자의 코드흐름을 생성하는 스레드가 필요하다. 
		cs.initDisplay();
		cs.start();  //Thread 상속받았기에 바로 start메소드 사용 가능 
	}
}
=======
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
		cs.start();           //run 메소드 실행
		cs.initDisplay();
	}
}
>>>>>>> f22ff6d251a8738d0b3a1d87c95db76d1b1b82e2
