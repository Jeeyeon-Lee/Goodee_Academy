package bclass.step1;

public class A {
	int i;
	public A() {
		System.out.println("A()호출");
		i = 10;
	}
	A(int i){
		this(); //디폴트 생성자 호출 가능 (파라미터 비어있으니)
	}
	public void methodA() {
		
	}
	public void methodA(int i) {
		A a = new A();
		System.out.println(a);
		a.i = 20;
		System.out.println(a);
	}
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		a = new A(1); //10
		System.out.println(a);
		a = new A(1); //10
		a.methodA(1);
		System.out.println(a);
	}

}
