package com.week41;

import java.util.ArrayList;

public class List4 {
	String num() {
		return "1";
	}
	void getFruit() {
		ArrayList<String> al = new ArrayList<>();
		al.add("키위");
		al.add(1,"토마토");
		al.add(1,"딸기");
		methodA(al);
	}
	void methodA(ArrayList<String> al) {
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
	
	public static void main(String[] args) {
		List4 list = new List4();
		list.getFruit();

	}

}
