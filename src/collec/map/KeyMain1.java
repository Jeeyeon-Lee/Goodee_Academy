package collec.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//소셜로그인 구현,  카카오 우편번호 검색,  카카오페이 도전
public class KeyMain1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //map 생성
		map.put("나신입", 85);                                   //map 추가
		map.put("나초보", 75);
		map.put("나일등", 65);
		
		Collection<Integer> values = map.values();
		System.out.println(values.size());
		
		Set<String> set = map.keySet();            //데이터 접근 : keySet() : map의 키 가져와서 set에 저장
		Object names[] = set.toArray();             //set의 요소들 배열로 변환하여 names 변수에 저장
		System.out.println(names.length);//저장된 배열의 길이는? 3
		for(int i=0;i<names.length;i++) {
			String key = (String)names[i];//배열 출력
            int value = values.toArray(new Integer[0])[i];
            System.out.println(key + ", " + value);
		}
	}
}
