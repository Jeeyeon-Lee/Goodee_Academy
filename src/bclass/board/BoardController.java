package bclass.board;

import java.util.List;
import java.util.Map;

public class BoardController {
		BoardDao bDao = new BoardDao(this);
		//전체조회 메소드
		public List<Map<String, Object>> getBoardList() {
			System.out.println("getBoardList 호출 성공");
			return null;
		}
	}
