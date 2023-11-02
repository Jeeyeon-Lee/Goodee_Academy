package com.week41;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("나신입");
		al.add(80);
		al.add(true);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
