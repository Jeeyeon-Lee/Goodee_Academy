package bclass.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bclass.board.BoardVO;

public class FMain {
	//입력처리
	/* *************************************************************************
	 * INSERT INTO 테이블명(컬럼명 1, 컬럼명2,,,) values(?,?,?,?,?,?)
	 * 리턴 int
	 * @param BoardVO
	 **************************************************************************/
	public int boardInsert(BoardVO bVO) {
		int result = -1;
		return result;
	}
	//수정처리
	/* *************************************************************************
	 * UPDATE dept set dname =:dname, loc =:loc 
	 * WHERE deptno =:deptno;
	 * @param BoardVO
	 **************************************************************************/
	public int boardUpdate(BoardVO bVO) {
		int result = -1;
		return result;
	}
	//삭제처리
	/* *************************************************************************
	 * SELECT FROM freeboard 
	 * WHERE fb_no?;
	 * @param int fb_no
	 **************************************************************************/
	public int boardDelete(int fb_no) {
		int result = -1;
		return result;
	}
	//전체조회처리
	/* *************************************************************************
	 * SELECT* FROM freeboard;
	 * SELECT fb_no, fb_title, fb_writer, fb_hits, fb_group, fb_step, fb_date FROM freeboard;
	 * WHERE fb_title LIKE ?||'%'
	 * AND(OR) fb_date LIKE ?||'%'
	 * AND(OR) fb_writer LIKE ?||'%'
	 * @param 필요x
	 **************************************************************************/
	//상세조회처리
	public List<BoardVO> boardList(Map<String, Object> pmap) {
		List<BoardVO> bList = new ArrayList<>();
		return bList;
	}
	/* *************************************************************************
	 * SELECT FROM
	 * WHERE
	 * @param
	 **************************************************************************/

	public static void main(String[] args) {
	}

}
