package com.step5;

public class MalladDuck extends Duck {

	public MalladDuck() {
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("나는 청둥오리입니다.");
	}

}
