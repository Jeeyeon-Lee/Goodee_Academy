package com.step5;
//추상클래스 아직 그 내용이 정해져있지 않는 클래스
//구현체 클래스 반드시 필요!!
public abstract class Duck {
	FlyBehavior flyBehavior     = null;
	QuackBehavior quackBehavior = null;
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	public abstract void display();
	public void performeFly() {
		flyBehavior.fly();
	}
	public void swimming() {
		System.out.println("모든 오리는 물 위에 뜬다.");
	}
}
