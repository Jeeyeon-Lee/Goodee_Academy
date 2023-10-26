package bclass.step2;
class C{
	CMain cm = null;
	public C(CMain cm) {
		System.out.println(cm);
		this.cm = cm;
		System.out.println(cm);
	}
}
public class CMain {
	C c = new C(this);
	public static void main(String[] args) {
		CMain cm = new CMain();
		System.out.println(cm);
		cm = new CMain();
		System.out.println(cm);
	}
}
