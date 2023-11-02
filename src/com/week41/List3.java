package com.week41;

import java.util.ArrayList;

public class List3 {
	String num() {
		return "1";
	}
	ArrayList<String> getFruit() {
		ArrayList<String> al = new ArrayList<>();
		al.add("키위");
		al.add(1,"토마토");
		al.add(1,"딸기");
		//
		return al;
	}
	public static void main(String[] args) {
		List3 list = new List3();
		ArrayList<String> li=list.getFruit();
		//insert here
		System.out.println(li);
	}

}
