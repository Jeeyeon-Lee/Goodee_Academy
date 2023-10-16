package com.step5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Reload1 extends JFrame implements ActionListener{
	/*선언부*/
	JPanel jp = new JPanel();
	JButton jbtnNew = new JButton("새로고침");
	JButton jbtn = new JButton("조회");
	/*생성자*/
	public Reload1() {	
		initDisplay();
	}
	/*정의메소드*/
	//화면구현
	public void initDisplay() {
		jbtnNew.addActionListener(this); 
		this.add("North",jbtnNew);
		jp.setBackground(Color.pink);
		this.add("Center",jp);
		this.setSize(500,400);
		this.setVisible(true);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		Reload1 r1 = new Reload1();
	}
	//콜백메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//새로고침을 눌렀니? JPaner 삭제한 뒤 창 다시 띄우기!
		if(obj == jbtnNew) {
			//컨테이너 
			Container cp = this.getContentPane();
			cp.remove(jp);
			JPanel jpCopy = null; //candidate 찜
			jp = null;
			jp = new JPanel();
			jpCopy = jp;
			jpCopy.setBackground(Color.gray);
			this.add("Center",jpCopy);
			//revalidate() -> 유효성검사 메소드
			this.revalidate();
			this.repaint();
		}
	}

}
