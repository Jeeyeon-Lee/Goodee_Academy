package review.week5;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeView {
	/*선언부*/
	JFrame jf = new JFrame();
	Font font = new Font("돋움체",Font.BOLD,30);
	JLabel jlbTime = new JLabel("현재시간정보", JLabel.CENTER);
	//다른클래스에 원본을 넘길때, 참조하기도 하지만 아래와같이 바로 선언하며 그냥 넘길수도 있음
	TimeClient tc = new TimeClient(this);
	/*생성자*/
	public TimeView() {}
	/*정의메소드*/
	public void initDisplay() {
		System.out.println("TimeView : "+jlbTime);
		tc.start();   //TimeClient의 run 메소드를 여기서(창이 뜨면서_ 실행
		jlbTime.setFont(font);
		jf.add("North", jlbTime);
		jf.setSize(700, 400);
		jf.setVisible(true);		
	}
	/*메인메소드*/
	public static void main(String[] args) {
		TimeView tv = new TimeView();
		tv.initDisplay();
	}
}