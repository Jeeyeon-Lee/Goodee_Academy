package com.step2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i=i+1) {
			System.out.println("here -> " +i);
			System.out.println(i + " student score input");
			int jumsu = sc.nextInt();
			System.out.println("input score = "+jumsu);
		}
	}

}
