package achat.step1;

import java.net.Socket;

public class ChatServerThread extends Thread {
	/*선언부*/
	ChatServer cs = null; //왜 널값으로 넣던가???
	/*생성자*/
	public ChatServerThread(ChatServer cs) { //ChatServer 자체를 가져옴. 
		this.cs = cs;
		System.out.println(this.cs.globalList.size());
	}

	/*정의메소드*/
	@Override
	public void run() {
		System.out.println("ChatServerThread run 호출");
		// TODO Auto-generated method stub
		super.run();
	}
	//메시지 발송 메소드
	public void broadCasting(String message) {
		for(int i=0;i<cs.globalList.size();i++) {
			//메시지 보내기 oos
		}	
	}
}
