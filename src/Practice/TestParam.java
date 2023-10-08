package practice;
class Param{
	//선언부
	int ival;
}
public class TestParam {
	//생성자
	public TestParam() {
		System.out.println("TestParam 호출");
		Param p = null;
		System.out.println("생성자"+p);
	}
	//정의메소드
	void effectParam(Param p) {
		p = new Param();
		System.out.println("effecParam"+p);
		System.out.println("메소드 ival 1 : "+p.ival);
		p.ival = 100;
		System.out.println("메소드 ival 1 : "+p.ival);
	}
	//메인메소드
	public static void main(String[] args) {
		TestParam tp = new TestParam();
		Param p = null;
		tp.effectParam(p);
		p = new Param();
		p.ival = 500;
		tp.effectParam(p);
		System.out.println("메인 ival : "+p.ival);
		
	}

}
