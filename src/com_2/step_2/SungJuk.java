package com_2.step_2;

public class SungJuk {
	int tot;
	public int total(int no1, int no2, int no3) {
		int x; // 지변
		int tot = no1 + no2 + no3;
		this.tot = tot;
		System.out.println(tot);
		return tot;
	}
	public double avg() {
		int result = total(75, 85, 85);
		System.out.println(result/3.0);
		return result/3.0;
	}
	public double avg(int tot) {
		tot = this.tot;
		System.out.println(tot/3.0);
		return tot/3.0;
	}
	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		sj.total(75, 85, 85);
		sj.avg();
		sj.avg(sj.tot);
	}

}
