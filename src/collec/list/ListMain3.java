package collec.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class List3{
	List<Double> li = new ArrayList<Double>();
	List<Boolean> isOk = null;
	public List3() {
		li.add(3.14);
		isOk = new ArrayList<Boolean>();
		isOk = new Vector<Boolean>();
		isOk.add(true);
		li.set(0, 4.11);
		isOk.set(0, false);
	}
}
public class ListMain3 {

	public static void main(String[] args) {
		List3 l3 = new List3();
		System.out.println(l3.li);
		System.out.println(l3.isOk);
		
	}

}
