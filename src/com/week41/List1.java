package com.week41;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		int a[] = new int[3];
		a = new int[5]; //배열 초기화??
		ArrayList al = new ArrayList();
		al.add("키위");
		al.add(1,"토마토");
		al.add(2, "바나나");
		al.add(3, "키위");
		al.add(4, "키위");
		String fruit = (String) al.get(3);
		System.out.println(al.size());
		for(int i = 0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al2.add("키위");
		al2.add("토마토");
		al2.add("딸기");
		String fruit2 = al2.get(2);
		for(int i=0;i<al2.size();i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("============");
		System.out.println("============");
		System.out.println(al);
		System.out.println(fruit);
		System.out.println("============");
		System.out.println(al2);
		System.out.println(fruit2);
		System.out.println("============");
		String fruit3 = "바나나";
		fruit3 = al2.set(1, fruit3);
		System.out.println(al2);
		System.out.println(al3);
		System.out.println(fruit3);
	}

}
