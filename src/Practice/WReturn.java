package practice;

public class WReturn {
	void methodA() {
	}
	int methodB() {
		return (int)1.5;
	}
	public static void main(String[] args) {
		WReturn w = new WReturn();
		System.out.println(w.methodB());
	}

}
