package achat.step1;

import java.util.StringTokenizer;

public class ProtocolTest {
<<<<<<< HEAD
	public static void main(String[] args) {
		String msg           = "200|kiwi|tomato|메시지 내용"; // |를 기준으로 토큰
		StringTokenizer st = new StringTokenizer(msg,"|");
		String protocol     = st.nextToken();
		String from          = st.nextToken();
		String to              = st.nextToken();
		String msg1          = st.nextToken();
		System.out.println(protocol+", "+from+", "+to+", "+msg1);
		//for/while문의 파라미터 안에는 boolean을 타입으로 들어감), not 원시형 타입
		while (st.hasMoreElements()) {
			//아래는 출력이 안됨 왜?이미 4개의 토큰의 순서를 돌고 왔으면 다른 입력x(이런 류의 클래스도 존재함)
			String s = (String)st.nextElement();
			System.out.println(s);     
=======

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
>>>>>>> f22ff6d251a8738d0b3a1d87c95db76d1b1b82e2
		}
	}
}
