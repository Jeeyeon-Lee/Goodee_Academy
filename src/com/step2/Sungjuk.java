package com.step2;

public class Sungjuk {
	public int total(int no1, int no2, int no3) {
		int tot = no1 + no2 + no3;
		return tot;
	}
	public double avg(int tot, double d) {
		return tot/d;
	}
	public static void main(String[] args) {
		Sungjuk sj = new Sungjuk();
		int tot = sj.total(10,24,25);
		double d = sj.avg(tot, 3.0);
		System.out.println(d);
	}

}
