package practice;

import javax.swing.JFrame;

public class JFrameTest1 {
	//선언부
	//생성자 - 인스턴스화 없이 메소드들 호출 가능!
	public JFrameTest1() {
		System.out.println("디폴트 생성자 호출");
		initDisplay();
		methodA();
		methodA(this);
	}
	//사용자메소드
	public void initDisplay() {
		JFrame jf = new JFrame();
		System.out.println("initdisplay 메소드 호출");
		jf.setSize(500,400);
		jf.setVisible(true);
	}
	public void methodA() {
		System.out.println("메소드A 호출");
	}
	public void methodA(JFrameTest1 jft1) {
		System.out.println("파라미터 있는 메소드A 호출");
		System.out.println(jft1); //참조된 클래스 주소 출력
	}
	//메인메소드
	public static void main(String[] args) {
		JFrameTest1 jft1 = new JFrameTest1();
		System.out.println(jft1);
		jft1.methodA(jft1);
	}

}
