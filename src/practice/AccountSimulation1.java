package practice;

class Account1{
	//선언부
	int first  = 100;
	int second = 200;
	//생성자
	Account1() {	}
	//사용자 메소드
	public void hap() {  //메소드 안 지변으로 계산하는 메소드
		int first  = 10;
		int second = 30;
		System.out.println(first+second);
	}
	public void hap(int first, int second) { //실행될때 입력되는 값으로 계산하는 메소드
		System.out.println(first+second);
	}
	public void hap(int first, int second, Account1 ac1) {//전변의 값을 참조하여 계산하는 메소드
		first  = this.first;
		second = this.second;
		System.out.println(first+second);
	}
}
public class AccountSimulation1 {
	public static void main(String[] args) {
		Account1 ac1 = new Account1();
		ac1.hap();
		ac1.hap(0, 0);
		ac1.hap(0, 0, ac1);
	}

}
