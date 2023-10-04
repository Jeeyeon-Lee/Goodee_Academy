package com.week2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AddressBook implements ActionListener{
	//선언부
	JFrame jf = new JFrame();
	AddressDialog aDialog = new AddressDialog(); 
	JPanel jp_north = new JPanel();
	JButton btnSelect = new JButton("조회");
	JButton btnInsert = new JButton("입력");
	JButton btnUpdate = new JButton("수정");
	JButton btnDelete = new JButton("삭제");
	//생성자
	public AddressBook() {}
	
	//화면처리 구현
	public void initDisplay() {
		btnSelect.addActionListener(this);
		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		jp_north.add(btnSelect);
		jp_north.add(btnInsert);
		jp_north.add(btnUpdate);
		jp_north.add(btnDelete);
		jf.add("North", jp_north);
		jf.setTitle("주소록 Ver1.0");
		jf.setSize(800,500);
		jf.setVisible(true);
		aDialog.initDisplay();
		aDialog.jdg_address.setVisible(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	//메인메소드
	public static void main(String[] args) {
		AddressBook abook = new AddressBook();//기본
		abook.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println(command);
		if("조회".equals(command)) {
			aDialog.set(command, true);
		}
		else if("입력".equals(command)) {
			aDialog.set(command, true);
		}
		else if("수정".equals(command)) {
			aDialog.set(command, true); 
		}
		else if("삭제".equals(command)) {
		}
	}

}
