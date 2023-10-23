package achat.step1;

public class A {
	int i = 1;
	void methodB() {
		System.out.println("==========[[methodB]]===========");
		System.out.println(this);
		System.out.println("==========[[methodB]]===========");
		
	}
	void methodA() {
		A a = new A();
		System.out.println("========================");
		System.out.println(a);
		System.out.println("========================");
		System.out.println(this);
		System.out.println(this.i);//1,2
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1 = new A();
		System.out.println(a1);
		a1.i = 2;
		a1.methodA();
		a1.methodB();
		System.out.println("main");
	}

}
