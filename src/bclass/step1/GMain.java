package bclass.step1;
class G{
	int i = 1;
	static int j =10; //얘로만 한다
}
public class GMain {

	public static void main(String[] args) {
		G g = new G();
		System.out.println(g.i);
		System.out.println(G.j);
		g.i++; //2
		G.j++; //11
		System.out.println(g.i);
		System.out.println(G.j);
		g = new G();
		g.i++; //2
		G.j++; //12
		System.out.println(g.i);
		System.out.println(G.j);
		g = new G();
		g.i++; //2
		G.j++; //13
		System.out.println(g.i);
		System.out.println(G.j);
		
	}

}
