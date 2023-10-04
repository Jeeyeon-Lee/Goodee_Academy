package com.week2;

public class AddressBook1 {
	AddressBook1 abook = null;
	//인스턴스화의 새로운 방법! 항상 메인 아래에서 new를 써가며 인스턴스화를 하는 것 x
	//조건문을 맞출 경우, 새로운 객체를 생성!!
	public AddressBook1 getObject() {  //클래스가 리턴타입으로 온 경우!!
		if(abook == null) {
			abook = new AddressBook1();
		}
		return abook;
	}
}
