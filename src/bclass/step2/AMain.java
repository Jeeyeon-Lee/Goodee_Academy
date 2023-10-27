package bclass.step2;
class A{}
public class AMain {

	public static void main(String[] args) {
		A as[] = new A[3];
		A a = new A();
		for(A a1:as) {
			System.out.println(a1);
		}
		as[0] = a; //치환
		for(A a1:as) {
			System.out.println(a1);
		}
	}

}
