package com.first;

import java.util.ArrayList;
import java.util.List;

class A{
//	List<Integer> 타입의 변수 nums는 ArrayList 객체로 초기화 되었음. 이 리스트는 Integer타입 요소를 저장하는 배열임. 
//	순서대로 Integer 요소들을 저장할 수 있는 배열임. 
	List<Integer> nums = new ArrayList<Integer>();
	int ival;
	String s = null;
	String s1 = new String();
	public A() {
		s = new String("나신입");
		nums.add(ival);
		nums.add(3);
		nums.add(5);
		nums.add(1);
		for(int num : nums) {
			System.out.println("A() nums 저장값 출력 "+num);
		}
	}
	public A(int ival) {
		A a = new A();
		s = new String("나초보");
		nums.add(ival);
		nums.add(3);
		nums.add(5);
		nums.add(1);
		for(int num : nums) {
			System.out.println("A(int ival) nums 저장값 출력 "+num);
		}
		System.out.println("ival "+nums.get(0));
		nums.clear();
		System.out.println(nums);
		nums.addAll(a.nums);
		System.out.println("A() 생성하여 nums 저장값 출력"+nums);
	}
}
public class AMain {
	public static void main(String[] args) {
		System.out.println("main 호출");
		A a = new A();
		System.out.println(a.s);
		a = new A(12);
		System.out.println(a.s);
	}
}
