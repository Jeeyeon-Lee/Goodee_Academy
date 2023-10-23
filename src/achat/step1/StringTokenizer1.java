package achat.step1;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		String msg = "100#kiwi#tomato#오늘 뭐해?";
		msg = null;
		StringTokenizer st = new StringTokenizer(msg,"#");
		String protocol = st.nextToken();//100
		String from = st.nextToken();
		String to = st.nextToken();
		msg = st.nextToken();
		System.out.println(protocol);
		System.out.println(from);
		System.out.println(to);
		System.out.println(msg);
		System.out.println(st.hasMoreElements());//false
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
