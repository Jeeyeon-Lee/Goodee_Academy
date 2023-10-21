package review.week5;

class Account{
	/*선언부*/
	int first;
	int second;
	/*생성자*/
	
	/*정의메소드*/
	public void hap1() {
		System.out.println(first+second);
	}
	public void hap2(int first, int second) {
		this.first = first;
		this.second = second;
		System.out.println(first+second);
	}
	/*메인메소드*/
}
public class AccountSimulation {
	/*선언부*/

	/*생성자*/

	/*정의메소드*/

	/*메인메소드*/
	public static void main(String[] args) {
		Account ac = new Account();
		ac.hap1();
		ac.hap2(5,4);
	}
}