package com.step5;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
	}
	public void swimming() {
		System.out.println("모든 오리는 물 위에 뜬다.");
	}
	@Override
	public void display() {
		System.out.println("나는 고무오리입니다.");
	}

}
