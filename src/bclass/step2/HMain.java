package bclass.step2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HMain extends JFrame implements ActionListener{
	/*선언부*/
	JButton jbtn;
	String title = null;
	/*생성자*/
	public HMain() {
		jbtn = new JButton("조회");
	}
	public HMain(String title) {
		this.title = title;
	}
	public void initDisplay() {
//		jbtn.addActionListener(this); 
		this.add("North",new JButton("입력")); //이벤트 발동할 때 마다 새로운 버튼이 생겨버림
		this.setVisible(true);
		this.setSize(400,400);
		this.setLocation(850,  300);
		this.setTitle(title);
	}
	public static void main(String[] args) {
		HMain hm = new HMain("타이틀");
		hm.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
