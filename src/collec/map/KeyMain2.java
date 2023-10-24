package collec.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyMain2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "85");
		map.put(2,"75");
		map.put(3,"65");
		
		Object names[] = null;
		Set<Integer> set = map.keySet();     //map의 key값을 set에 저장
		names = set.toArray();                  //set의 요소를 배열로 전환하여 names에 저장
		
		Object[] its = map.keySet().toArray(); //map의 key를 배열로 전환하여 its라는 배열에 저장
		its = set.toArray();                       //itst에 그 요소를 초기화하여 저장
		for(Object obj : its) {
			System.out.println(obj);
		}
		System.out.println("====================");
		System.out.println(names.length);  //3
		for(int i=0;i<names.length;i++) {   //1  2  3 
			Integer key = (Integer)names[i];
			System.out.println(key);
		}
	}
}
