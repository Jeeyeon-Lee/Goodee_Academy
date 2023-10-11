package com.step5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout {
	JFrame jf = new JFrame();
	JButton jbtns[] = new JButton[5];
	String labels[] = {"동","서","남","북","중앙"};
	public void initDisplay() {
		jbtns[0] = new JButton("동");
		jbtns[0] = new JButton("서");
		jbtns[0] = new JButton("남");
		jbtns[0] = new JButton("북");
		jbtns[0] = new JButton("중앙");
		/*
		for(int i=0;i<jbtns.length;i++) {
			JButton jbtn = new JButton(labels[i]);
			System.out.println(jbtns[i]);
		}
		*/
		jf.add("East",jbtns[0]);
		jf.add("North",jbtns[3]);
		jf.add("South",jbtns[2]);
		jf.add("Center",jbtns[4]);
		jf.add("West",jbtns[1]);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		BorderLayout bl = new BorderLayout();
		bl.initDisplay();
	}

}
