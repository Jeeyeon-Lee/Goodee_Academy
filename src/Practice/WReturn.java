package practice;

public class WReturn {
	void methodA() {
		System.out.println("메소드A 호출 성공");
	}
	int methodB() {
		return (int)1.5;
	}
	public static void main(String[] args) {
		WReturn w = new WReturn();
		System.out.println(w.methodB());
	}

}
