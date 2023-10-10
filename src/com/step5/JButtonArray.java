package com.step5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JButtonArray implements ActionListener {
	//선언부
	JFrame jf = new JFrame();
	JButton jbtns[] = new JButton[4];
	JTextField jtf_display = new JTextField("0");
	String jbtnLabels[] = {"one", "two", "three", "four"};
	//생성자
	public JButtonArray() {
		//객체배열 초기화, 생성자 역할 중 하나는 전역변수의 초기화를 담당!
		for(int i=0;i<jbtns.length;i++) {
			jbtns[i] = new JButton(jbtnLabels[i]); //3회까지 각 버튼 생성하는데 그 값은 라벨의 값으로 넣는다.
			jbtns[i].addActionListener(this);      //생성된 배열은 이 클래스에 의해 액션이 더해질거다.?!
		}
	}
	//사용자메소드
	public void initDisplay() {
		jtf_display.setHorizontalAlignment(JTextField.CENTER);
		jf.add("North",jtf_display);
		jf.setTitle("객체배열연습");
		jf.setVisible(true);
		jf.setSize(500,300);
		jf.setLayout(new GridLayout(1,4)); //1차 배열 4개를 담을 레이아웃으로 생성
		for(int i=0;i<jbtns.length;i++) {  //레이아웃 들어가는 버튼순은 배열순으로!
			jf.add(jbtns[i]);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("one".equals(command)) {
			jtf_display.setText("one");
		}
		else if("two".equals(command)) {
			jtf_display.setText("two");
		}
		else if("three".equals(command)) {
			jtf_display.setText("three");
		}
		else if("four".equals(command)) {
			jtf_display.setText("four");
		}
	}

	public static void main(String[] args) {
		JButtonArray ja = new JButtonArray();
		ja.initDisplay();
	}

}
