package achat.step1;

public class A {
	int i = 1;
	public void methodB() {
		System.out.println("methodB");
	}
	public void methodA() {
		System.out.println("methodA");
		System.out.println(this);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1);
		a1.methodA();
		a1 = new A();
		System.out.println(a1);
		a1.i=2;
		a1.methodA();
		System.out.println("main");
	}
}
