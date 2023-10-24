package collec.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import collec.list.CustomerVO;

class Map3{
	Map<String, List<Map<String, CustomerVO>>> map = new HashMap<String, List<Map<String,CustomerVO>>>();
	Map3(){
		List<Map<String, CustomerVO>> list = new ArrayList<Map<String,CustomerVO>>();
		Map<String, CustomerVO> imap = new HashMap<String, CustomerVO>();
		CustomerVO cvo = new CustomerVO();
		cvo.setC_id(12);
		cvo.setC_name("토마토");
		cvo.setC_birthday("2000-05-11");
		imap.put("1", cvo);
		list.add(imap);
		map.put("outer", list);
		}
}
public class MapMain3 {

	public static void main(String[] args) {
		Map3 m3 = new Map3();
		System.out.println(m3.map.size());
		System.out.println(m3.map.get("1"));
		System.out.println(m3.map.get("outer"));
		System.out.println(m3.map.get("outer") instanceof List);		  //"outer" List 타입이니? true
		System.out.println(m3.map.get("outer") instanceof Map);		  //"outer" Map 타입이니? false
		System.out.println(m3.map.get("outer").get(0) instanceof List);//List 타입이니? false
		System.out.println(m3.map.get("outer").get(0) instanceof Map);//Map 타입이니? true
		System.out.println(m3.map.get("outer").get(0).get("1") instanceof CustomerVO);//true
		System.out.println(m3.map.get("outer").get(0).get("1").getC_id());//12
		System.out.println(m3.map.get("outer").get(0).get("1").getC_name());//true
		System.out.println(m3.map.get("outer").get(0).get("1").getC_birthday());//true
	}
}
