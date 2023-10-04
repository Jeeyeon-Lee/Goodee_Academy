package com.step3;

import java.util.Scanner;

public class Return3 {
	String m(int i) {
		String hint = "";
		if(i<0) {
			hint = "너 음수야";
			return hint;
		}else if(i>0) {
			hint = "너 양수야";
			return hint;
		}else {
			return "m메소드의 결과는 빈 값이야";
		}
	}
	String m2(int i) {
		String hint = "";
		if(i<0) {
			hint = "너 음수야";
			return hint;
		}else if(i>0) {
			hint = "너 양수야";
			return hint;
		}
		return "m2메소드의 결과는 빈 값이야";
		
		
	}
	public static void main(String[] args) {
		Return3 r3 = new Return3();
		int i = 0;
		System.out.println(r3.m(i));
		System.out.println(r3.m2(i));
	}

}
