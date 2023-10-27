package bclass.step1;
class C1{
	int i;
}
class C2{
	
}
public class CMain {
	C1 c1 = null; //선언만 하고 있음!
	public static void main(String[] args) {
		CMain cm = new CMain();
		System.out.println("main");
		System.out.println(cm.c1);
		System.out.println(cm.c1 instanceof C1); //생성전이어서 타입 없음.
		cm.c1 = new C1();                           //생성하게 됨 
		System.out.println(cm.c1);
		System.out.println(cm.c1 instanceof C1); //생성전이어서 타입 없음.
		System.out.println(cm.c1.i);
		System.out.println(cm.c1.i+3);
	}

}
