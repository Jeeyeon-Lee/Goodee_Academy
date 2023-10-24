package collec.list;

import java.util.ArrayList;
import java.util.List;


public class CustomerManager {
	List<CustomerVO> cList = null;//전변은 언제 스캔이 되나요?
	CustomerManager(){
		cList = new ArrayList<>();
	}
	CustomerManager(int i){
	}
	/***********************************************************
	 * 고객정보 등록하기 구현 - 없는 걸 새로 등록하기 
	 * @param cVO - 한 번에 여러가지의 값을 넘겨받을 수 있는 VO 사용
	 * @return
	 ***********************************************************/
	public boolean customerInsert(CustomerVO cVO) {
		boolean isOk = false;
		return isOk;
	}
	/************************************************************
	 * 고객정보 수정하기 구현 - 기존 정보 변경하기
	 * select(1건) = rcVO or Map - pcVO - 1이면 성공, 0이면 실패 판정
	 * UPDATE customer SET c_name = ?, c_birthday =? WHERE c_id = ?
	 * @param cVO 
	 * @return
	 *************************************************************/
	public boolean customerUpdate(CustomerVO cVO) {
		boolean isOk = false;
		return isOk;
	}
	/**************************************************************
	 * 고객정보 삭제하기 구현 - 기존테이블에서 삭제
	 * DELETE FROM customer WHERE c_id =?(primary key)
	 * @param cVO
	 * @return true이면 성공, false이면 실패
	 ***************************************************************/
	public boolean customerDelete(int c_id) { //기본키인 id만으로도 처리할 수 있음. 
		boolean isOk = false;
		return isOk;
	}
	/****************************************************************
	 * 고객정보 상세보기 구현
	 * @param c_id
	 * @return
	 ****************************************************************/
	public CustomerVO customerSelect(int c_id) {
		CustomerVO rcVO = null;
		return rcVO;
	}
	/*****************************************************************
	 * 고객정보 전체보기 구현
	 * @return
	 ******************************************************************/
	public List<CustomerVO> customerSelectAll() {
		List<CustomerVO> cList = null;
		return cList;
	}
	public static void main(String[] args) {
		CustomerManager cm = null;
		cm = new CustomerManager(0);
	}

}