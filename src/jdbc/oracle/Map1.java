package jdbc.oracle;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	/*선언부*/
	Map<String, Object> map = null;
	/*생성자*/

	/*정의메소드*/
	public void methodA() {
		map = new HashMap<String, Object>();
	    map.put("b_title","자바의 정석");
	    map.put("b_author","남궁성");
	    map.put("b_price", 30000);
	}
	public void methodAPrint() {
		if(map != null) {
		System.out.println(map.get("b_title"));
		System.out.println(map.get("b_author"));
		System.out.println(map.get("b_price"));
		}
		else {
		System.out.println("map이 널값입니다.");
		}
	}
	Map<String, Object> meathodC(Map<String, Object> pmap){ //리턴타입, 파라미터타입 맵
		Map<String, Object> rmap = null;
		this.map = rmap;
		return rmap;
	}
		
	/*메인메소드*/
	public static void main(String[] args) {
		Map1 m = new Map1();
		m.methodA();
		m.methodAPrint();
		m.meathodC(null);
	}

}
