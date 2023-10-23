package review.week5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BaseballGameEvent implements ActionListener{

	/*선언부*/
	int cnt = 0; //coutnt용 숫자
	BaseballGameUI bbgUI = null;
	/*생성자*/
	public BaseballGameEvent(BaseballGameUI baseballGameUI) {
		this.bbgUI = baseballGameUI;
	}
	/*정의메소드*/
	//게임 나가기 
	public void exit() {
		System.exit(0);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();
		Object obj = e.getSource();
		if("지우기".equals(label)){     //누른값의 문자열
			bbgUI.jta_display.setText("");  //입력칸 비워줌 
		}
		else if("나가기".equals(label) || obj == bbgUI.jmi_exit) {//or이니까 둘중 하나만 true이어도 호출된다.
			exit();//사용자 정의 메소드 호출이다.
		}
		//새게임을 누른거야?
		else if(obj == bbgUI.jbtn_new) {
			bbgUI.bbgLogic.ranCom();
			bbgUI.jtf_user.requestFocus();
		}
		//이벤트가 발생한 이벤트 소스의 문자열을 비교하기
		else if(e.getSource()==bbgUI.jtf_user) {
			bbgUI.jta_display.append(++cnt+"회 : "+bbgUI.jtf_user.getText()+" : "+bbgUI.bbgLogic.account(bbgUI.jtf_user.getText())+"\n");
			bbgUI.jtf_user.setText("");
		}///////////입력하고 엔터 쳤을 때
		else if(obj==bbgUI.jmi_dap || "정답".equals(label)) {
			//1-먼저 채번(동사-기능-메소드 호출)하고 그 다음에 com배열에 있는 값을 출력해 준다.
			//ranCom();
			bbgUI.jta_display.append("정답은 "+bbgUI.bbgLogic.com[0]+bbgUI.bbgLogic.com[1]+bbgUI.bbgLogic.com[2]+" 입니다.\n");
			//jta_display.append(com[0]+com[1]+com[2]);//0
		}
	}///////////////end of actionPerformed
}