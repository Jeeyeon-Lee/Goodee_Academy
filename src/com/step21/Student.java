package com.step21;

public class Student {
	int html = 0;
	int css  = 0;
	int java = 0;
	public static void main(String[] args) {
		//참조형 변수를 사용하지 않으면 몸이 고생...
		Student s = new Student();
		s.html = 70;
		s.css  = 80;
		s.java = 90;
		System.out.println(s);
		s = new Student();
		s.html = 60;
		s.css  = 70;
		s.java = 80;
		System.out.println(s);
		s = new Student();
		s.html = 50;
		s.css  = 60;
		s.java = 70;
		System.out.println(s);
	}

}
