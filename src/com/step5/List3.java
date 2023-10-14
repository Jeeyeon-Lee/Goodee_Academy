package com.step5;

import java.util.ArrayList;

public class List3 {
	/*선언부*/

	/*생성자*/

	/*정의메소드*/
	//과일리스트 가져오는 메소드 getFruitsList
	public void getFuritsList(ArrayList<String> fruits) {
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
	}
	public ArrayList<String> methodA(){  //객체(ArrayList 패키지)를 참조하는 메소드
		ArrayList<String> fruits = new ArrayList<>();   
		fruits.add("🍅");
		fruits.add(1, "🍓");
		fruits.add(1, "🍎");                            //사과의 끼어들기 가능
		return fruits;
	}
	/*메인메소드*/
	public static void main(String[] args) {
		List3 l = new List3();
		ArrayList<String> fruits = l.methodA(); //위에 참조되는 값은 이 클래스의 메소드 에이임??무슨 말이지
		System.out.println(fruits); //array는 [] 형태로 리스트에 저장된 객체 출력함. 
	}
}
