package com.step1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest6 implements ActionListener {
	static JFrameTest6 jft = new JFrameTest6();   //object 클래스의 기능 중 하나 JFrame
	JFrame jf = new JFrame();
	JButton jbtnAccount = new JButton("Calculate");
	JButton jbtnExit = new JButton("Exit");
	
	public static void main(String[] args) {
		jft.jf.setTitle("I'm no 5");
		jft.jbtnAccount.addActionListener(jft);
		jft.jf.add("North", jft.jbtnAccount);
		jft.jf.add("South", jft.jbtnExit);
		jft.jf.setSize(500,400);
		jft.jf.setVisible(true);
		}
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jft.jbtnAccount) {
			System.out.println("click the button");
		}
	}

}
