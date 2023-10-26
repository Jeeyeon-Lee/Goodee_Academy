package bclass.step2;
class B{
	int i =1;
	static B b = new B();//묶인 클래스 생성위해서는 이른 인스턴스화 필요
	private B() {}//생성자 묶기 -> 인스턴스화 x - > 싱글톤패턴 -> 유효성 검사, 공유 관리
	public static B createB() { //->위에서 생성자를 묶었기 때문에?! 
		return b;
	}
}
class B1{
	int j=1;
	public B1 createB1() {
		B1 b1 = new B1();
		return b1;
	}
}
public class BMain {
	int i =1;
	public static void main(String[] args) {
		B bs[] = new B[3];
		B b = B.createB(); //static 참조를 위해 메소드 static 추가, 이른 인스턴스화에도 static 추가
		System.out.println(b.i++);
		bs[0]=b;
		b = B.createB();
		System.out.println(b.i++);
		bs[1]=b;
		b = B.createB();
		System.out.println(b.i++);
		bs[2]=b;
		for(B b1:bs) {
			System.out.println(b1);
		}
		System.out.println("=======================");
		B1 bs1[] = new B1[3];
		B1 b1 = new B1();
		bs1[0] = b1.createB1();
		System.out.println(b1.j++);
		b1 = new B1();
		bs1[1] = b1.createB1();
		System.out.println(b1.j++);
		b1 = new B1();
		bs1[2] = b1.createB1();
		System.out.println(b1.j++);
		for(B1 b2:bs1) {
			System.out.println(b2);
		}
	}
}
