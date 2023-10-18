package achat.step1;

import java.util.StringTokenizer;

public class ProtocolTest {

	public static void main(String[] args) {
	//토큰을 설정할 예시변수 msg 생성 -> 파이프를 구분자로 하여 토큰을 생성하자 (번호, 누가, 누구에게, 무엇을)
		String msg = "200|kiwi|tomato|오늘 스터디할까?";
		//토큰을 만드는 인터페이스 
		StringTokenizer st = new StringTokenizer(msg, "|");
		//for, while문 쓸 때는 boolean 리턴타입인 메소드를 사용하는 것 필요
		//boolean java.util.StringTokenizer.hasMoreElements() -> 메소드와 동일한 값을 반환??
		while(st.hasMoreElements()) {
			String s = (String)st.nextToken();
			System.out.println(s);
		}
	}
}
