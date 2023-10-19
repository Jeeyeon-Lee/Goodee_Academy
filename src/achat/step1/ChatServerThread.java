package achat.step1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

public class ChatServerThread extends Thread {
	/*선언부*/
	ChatServer cs = null; //왜 널값으로 넣던가???
	Socket client = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	String chatName = null;
	/*생성자*/
	public ChatServerThread(ChatServer cs) { //ChatServer 자체를 가져와서 사용 -> log, socket, 메시지 등
		cs.jta_log.append("ChatServerThread호출 "+"\n");
		this.cs = cs;
		this.client = cs.socket; 
		cs.jta_log.append("client "+client+"\n");		
		try {
			oos = new ObjectOutputStream(client.getOutputStream()); //ct에게 들은 것을 아웃
			ois = new ObjectInputStream(client.getInputStream());//듣기
			String msg = (String)ois.readObject(); //여기서 메시지는 클라이언트에게 들은 내용(즉, ct가 말한 그 메시지)
			StringTokenizer st = new StringTokenizer(msg,"|");
			//"200|kiwi|tomato|오늘 스터디할까?" 라면?? 각 말하기의 구현 (프로토콜 설계 필요->어디서 사용? CC)
			st.nextToken(); // 200
			chatName = st.nextToken(); //kiwi
			//서버 창에 로그를 띄우기
			cs.jta_log.append(chatName+"님이 입장하였습니다.\n");
			//메시지를 전달할 때, 이 변수의 사이즈에 따라 주게 되면, 새로온 사람 줄 수 없음. 
			//리스트로 손님을 관리하여 리스트(배열) 전체에게 발송하는 형식으로 for문 작성 필요
			//향상된 for(자료형 변수명 : 배열명) ->globalList의 자료형(CS), 변수명(cst), 배열명(cs.globalList)
			for(ChatServerThread cst : cs.globalList) {
				System.out.println(cst.chatName);
				System.out.println(this.chatName);
				this.send(100+"|"+cst.chatName);//나 입장했어요
			}
			//누가 입장하면 클라이언트 스레드를 추가해줘야 함. 
			cs.globalList.add(this);
			this.broadCasting(msg); //이 모두에게 msg를 보냄 
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	/*정의메소드*/
	@Override
	public void run() { //로그관리?? 
		cs.jta_log.append("ChatServerThread 의 run호출"+"\n");
		boolean isStop = false;
		String msg = null; //msg는 ct가 입력한 메시지
		try {
			start:
				while(!isStop) { //멈출때까지 한다
 					msg = (String)ois.readObject();
					cs.jta_log.append(msg+"\n");
					//로그가 append될때마다 스크롤바가 현재 문자열의 위치를 자동으로 인식해서 이동처리
					cs.jta_log.setCaretPosition(cs.jta_log.getDocument().getLength());
					//빈값을 줄 수도 있으니 if문 추가!
					StringTokenizer st = null;
					int protocol = 0;
					if(msg != null) { //null이 아니면
						st = new StringTokenizer(msg, "|");
						protocol = Integer.parseInt(st.nextToken()); //|로 나뉜 st의 다음 토큰
					}
					switch (protocol) {
					case 200: {
						cs.jta_log.append("ChatServerThread : 200번 청취완료");
						String nickName = st.nextToken();
						String messege = st.nextToken();
						broadCasting(200+"|"+nickName+"|"+messege);//oos.writeObject
					}break;
					case 500: {
						
					}break start;
					}
				}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	//메시지 발송 메소드
	public void broadCasting(String message) {
//		for(int i=0;i<cs.globalList.size();i++) {     //이거보단 아래로 하는 것이 정확
		for(ChatServerThread cst : cs.globalList) {
			//클라이언트 창에 써지는 메시지 보내기 oos
			cst.send(message);
		}	
	}
	public void send(String msg) {
		try {
			oos.writeObject(msg);
		} catch (Exception e) {
			e.printStackTrace();//stack에 쌓여 있는 로그 히스토리를 출력함
		}
	}
}
