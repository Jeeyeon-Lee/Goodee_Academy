package com.step5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class B1{
	JButton jbtnSelect = new JButton("조회");
}
class B2{
	JButton jbtnSelect = new JButton("입력");
}
public class BMain implements ActionListener{
	/*선언부*/
	JFrame jf = new JFrame();
	B1 b1 = new B1();
	B2 b2 = null;
	/*생성자*/
	public BMain() {
		b1.jbtnSelect.addActionListener(this);
		b2 = new B2();
		initDisplay();
		for(double d=0.0;d<999.0;d++) {
			System.out.println("지연");
		}
	}
	/*정의메소드*/
	public void initDisplay() {
		jf.setVisible(true);
		jf.setSize(400,500);
		jf.add("North",b1.jbtnSelect);
		jf.add("South",b2.jbtnSelect);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		BMain b = new BMain();
	}
	/*오버라이드메소드*/
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == b1.jbtnSelect) {
			System.out.println(b1.jbtnSelect.getText());
		}
		else if(obj == b2.jbtnSelect) {
			System.out.println(b2.jbtnSelect.getText());
		}
	}

}
