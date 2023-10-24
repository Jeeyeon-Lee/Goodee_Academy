package collec.map;

import java.util.HashMap;
import java.util.Map;

class Map1{
	Map<String, Object> map = new HashMap<String, Object>();
	public Map1() {
		System.out.println(map.size());
		map.put("1",1);                     //키 1, 벨류 1
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.containsKey("1"));
		System.out.println(map.containsKey("2"));
	}
	Map1(int i){
		map = new HashMap<String, Object>();
		System.out.println(map.size());
	}
}
public class MapMain1 {

	public static void main(String[] args) {
		Map1 m1 = new Map1();
		System.out.println(m1.map.size());
		Map1 m2 = new Map1(3);
	}

}
