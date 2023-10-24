package collec.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListMapMain {
    List<Map<String, ListMapVO>> lmList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    /* 생성자 */
    public ListMapMain() {
    }

    /* 값 추가 메소드 */
    public void addValue() {
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.print("값을 입력하세요 (이름|나이|등급): ");
            String input = sc.nextLine();
            StringTokenizer st = new StringTokenizer(input, "|");
            try {
                if (st.countTokens() != 3) {
                    throw new IllegalArgumentException("잘못된 형식의 입력입니다.");
                }
                String name = st.nextToken().trim();
                int age = Integer.parseInt(st.nextToken().trim());
                int rank = Integer.parseInt(st.nextToken().trim());
                ListMapVO vo = new ListMapVO();
                vo.setName(name);
                vo.setAge(age);
                vo.setRank(rank);
                Map<String, ListMapVO> map = new HashMap<>();
                map.put("data", vo);
                lmList.add(map);
                System.out.println("값이 추가되었습니다.");
                isValidInput = true;
            } catch (NumberFormatException e) {
            	System.out.println("숫자 형식의 값이 아닙니다. 다시 입력해주세요.");
            } catch (IllegalArgumentException e) {
            	System.out.println(e.getMessage());
            }
        }
    }
    
    /* 값 삭제 메소드 */
    public boolean removeValue() {
    	displayValues();
    	System.out.print("삭제할 값의 인덱스를 입력하세요: ");
    	int index = Integer.parseInt(sc.nextLine());
    	if (index >= 0 && index < lmList.size()) {
    		lmList.remove(index);
    		return true;
    	}
    	return false;
	}
    /* 값 조회 메소드 */
    public void displayValues() {
        for (int i = 0; i < lmList.size(); i++) {
            Map<String, ListMapVO> map = lmList.get(i);
            ListMapVO vo = map.get("data");
            System.out.println(i + ": " + vo.getName() + " | " + vo.getAge() + " | " + vo.getRank());
        }
    }
    /* 메인메소드 */
	public static void main(String[] args) {
	    ListMapMain lm=new ListMapMain();
	    Scanner scanner=new Scanner(System.in);

	    while(true) {
	        System.out.println("[1] 값 추가");
	        System.out.println("[2] 값 삭제");
	        System.out.println("[3] 값 조회");
	        System.out.println("[4] 종료");
	        System.out.print("> ");
	        String choiceStr=scanner.nextLine();

	       if ("1".equals(choiceStr)) { // 값 추가
	           lm.addValue();
	           continue;
	       } else if ("2".equals(choiceStr)) { // 값 삭제
	           boolean isRemoved=lm.removeValue();
	           if(isRemoved){
	               System.out.println("값이 삭제되었습니다.");
	           }else{
	              	System.out.println("값 삭제에 실패했습니다.");
	            }
	                
	            continue;
	       } else if ("3".equals(choiceStr)) { // 값 조회
	            lm.displayValues();
	            continue; 
	       } else if ("4".equals(choiceStr)) { // 종료
	             break; 
	       } else{
	            	System.out.println("유효하지 않은 선택입니다. 다시 선택해주세요."); 
	       }
	   }
	   scanner.close();
	}
}