package achat.step1;

import java.awt.Color;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//왜 스레드를 굳이 상속받는 건가요? - 화면처리하는 메인메소드와 통신채널 설정하는 코드 분리
//혜택 - 화면처리와 네트워크 처리 분리한다 - 안전한 서비스 제공하기 위해서
public class ChatServer1 {
	//List의 구현체 클래스는 ArrayList(스레드불안전-조치가 없다, 배려가 없다.추가로직이 포함안됨), Vector(동시접속자를 배려하여 0.1초라도 먼저 들어오면 관리를 해준다.읽기 쓰기 속도가 느리다.)
	//챗서버에 접속해온 사용자에 대한 정보를 담는 벡터 선언임
	//다수의 클라이언트 요청을 처리하는 서버를 개발할때 사용함
	List<ChatServerThread> globalList = null;
	ServerSocket server = null;
	//서버는 들은내용을 말하는 것이다.
	//실제로 듣고 말하기는 ChatServerThread에서 처리한다.(내가 그렇게 설계했다.)
	//run메소드에서 서버소켓에 접속해온 클라이언트측의 소켓정보를 받게 되니까 - 메소드 내부에서 사용하려면 전변으로 하자
	Socket socket = null;
	JFrame jf = new JFrame();
	JTextArea jta_log = new JTextArea(10,60);
	JScrollPane jsp_log = new JScrollPane(jta_log
			 , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			 , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	public ChatServer1() {
		//서버에 접속해온 클라이언트 스레드 정보를 관리할 벡터 생성하기 
		globalList = new Vector<>();
		boolean isStop = false;
		try {
			server = new ServerSocket(3002);
			jta_log.append("Server Ready.........\n");
			while(!isStop) {
				//서버소켓에 접속해온 사용자의 소켓정보를 담는다.
			    socket = server.accept();
				jta_log.append("client info:"+socket+"\n");			
				//아래에서 this는 ChatServer가리킨다
				System.out.println(this);
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
	public static void main(String[] args) {
		ChatServer1 cs = new ChatServer1();
		System.out.println(cs);
		cs.initDisplay();
	}

}
