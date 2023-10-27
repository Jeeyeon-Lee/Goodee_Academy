package bclass.step2;

import java.util.StringTokenizer;

class Life1{
	String s = null;
	public void init() {
		s = new String("300|kiwi"); 
	}
	public void service() {
		StringTokenizer st = new StringTokenizer(s,"|");
		st.nextToken();
		String who = st.nextToken();
		System.out.println(who);
	}
	public void destroy() {
		if(s != null) {
			s = null;
			System.gc();
		}
	}
}	
public class LifrMain {
	public static void main(String[] args) {
		Life1 life = new Life1();
		life.init();
		life.service();
		life.destroy();
	}
}
