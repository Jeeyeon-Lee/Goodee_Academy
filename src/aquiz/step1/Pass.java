package aquiz.step1;

public class Pass {
	int x = 5;

	public void doStuff(int x) {
		System.out.println("메소드 안 값  ++x : "+ ++x);
//		System.out.println("doStuff에서 전변 x : " + ++this.x);
		System.out.println("메소드 안 값  x : "+x);
	}

	public static void main(String[] args) {
		Pass p = new Pass();
		p.doStuff(p.x);
		System.out.println("전변  x : "+p.x);
	}

}
