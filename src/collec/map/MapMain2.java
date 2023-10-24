package collec.map;

import java.util.HashMap;
import java.util.Map;
import collec.list.CustomerVO;

class Map2{
	Map<String, CustomerVO> map = new HashMap<>();
	public Map2() {
		System.out.println(map.size());
		CustomerVO cvo = new CustomerVO();
		cvo.setC_name("나신입");
		cvo.setC_id(10);
		cvo.setC_birthday("2005-09-11");
		map.put("1", cvo);//map.size()=1
		System.out.println(map.size());
	}
}
public class MapMain2 {

	public static void main(String[] args) {
		System.out.println("main");
		Map2 m = new Map2();
		CustomerVO cvo = m.map.get("1");
		System.out.println(cvo);
		System.out.println(m.map.get("1"));
		System.out.println(m.map.get("1").getC_id());
		System.out.println(m.map.get("1").getC_name());
		System.out.println(m.map.get("1").getC_birthday());
		//출처가 같은지 확인하는 법
		System.out.println(cvo.getC_name().equals(m.map.get("1").getC_name()));
		System.out.println(cvo instanceof CustomerVO);
		System.out.println(m.map.get("1") instanceof CustomerVO);
	}

}
