package practice;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeView {
	JFrame jf = new JFrame();
	Font font = new Font("돋움체",	Font.BOLD, 30);
	JLabel jlbTime = new JLabel("현재시간정보", JLabel.CENTER);
	TimeClient tc = new TimeClient(jlbTime);
	public static void main(String[] args) {

	}

}
