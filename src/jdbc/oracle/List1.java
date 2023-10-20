package jdbc.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List1 {
	/*선언부*/

	/*생성자*/

	/*정의메소드*/

	/*메인메소드*/
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(map);
		List li = new ArrayList(); //제네릭 빼고도 가능
		System.out.println(li);
		System.out.println(li.size());
		li.add(map);
		System.out.println(li.size());
		System.out.println(li);        
		map.put("b_no", 1);
		map.put("b_title", "혼공자");
		System.out.println("=============");
		System.out.println(li instanceof List); //li가 List 의 속성 확인
		System.out.println(li instanceof ArrayList);
		System.out.println("=============");
		System.out.println(map.get("b_no"));
		System.out.println(map.get("b_title"));
		System.out.println(map.get("b_author"));
		System.out.println("=============");
		int b_price = (int) map.get("b_price"); //이게 VO와 Map을 제네릭으로 선택했을 때의 차이점??
		b_price = (int) map.get("b_price"); //이게 VO와 Map을 제네릭으로 선택했을 때의 차이점??
		System.out.println(b_price); //리턴값이 "java.util.Map.get(Object)" is null 
		System.out.println(map);        // {b_no=1, b_title=2}

	}

}
