package bclass.step2;
class E{
	public E() {
		System.out.println("E()");
		m();
	}
	public void m() {
		System.out.println("E의 m()");
	}
}
public class EMain extends E{
	public EMain() {
		System.out.println("EMain()");
		m();
	}
	@Override
	public void m() {
		System.out.println("EMain의 m()");
	}
	public static void main(String[] args) {
		new EMain(); //부모인 E의 생성자부터 거치고 옴. 메소드 또한 자식이 오버라이드 한 m으로 읽혀짐 
	}

}
