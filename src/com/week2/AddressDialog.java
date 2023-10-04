package com.week2;

import javax.swing.JDialog;

public class AddressDialog {
	//선언부
	JDialog jdg_address = new JDialog();
	//생성자
	public AddressDialog() {}
	
	//메인 클래스(AddressBook) 세팅 구현 -> 파라미터값 활용하여 간소화
	public void set(String title, boolean isView) {
		jdg_address.setTitle(title);
		jdg_address.setVisible(isView);
	}
	
	//화면처리 구현
	public void initDisplay() {
		jdg_address.setSize(400,500);
	}
	//메인메소드
}
