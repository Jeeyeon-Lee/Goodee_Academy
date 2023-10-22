package review.week5;

import java.util.Random;

public class BaseballGameLogic {

	/*선언부*/
	int my[] = new int[3];
	int com[] = new int[3];
	BaseballGameUI bbgUI = null;
	/*생성자*/
	public BaseballGameLogic(BaseballGameUI baseballGameUI) {
		this.bbgUI = baseballGameUI;
	}
	/*정의메소드*/
	//무엇에 대한 숫자세기? 유저가 입력한 숫자 3자리(String 형식)
	public String account(String user) {
		if(user.length() !=3) {
			return "세 자리 숫자로 입력하세요.";
		}
		int temp = 0; //임의의 저장
		int strike = 0;
		int ball = 0;
		try {
			temp = Integer.parseInt(user);
		} catch (NumberFormatException e) {
			return "숫자로 입력하세요";
		}
		my[0] = temp/100;
		my[1] = (temp%100)/10;
		my[3] = temp%10;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(com[i] == my[j]) {
					if(i == j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
			if(strike ==3) {
				return "축하합니다, 정답입니다.";
			}
		}
 		return strike +"스" + ball +"볼";
	}
	//컴퓨터의 세자리 숫자 채번
	public void ranCom() {
		Random r = new Random();
		com[0] = r.nextInt(10);
		do {
			com[1] = r.nextInt(10);
		}while(com[0]==com[1]);
		do {
			com[2] = r.nextInt(10);
		}while((com[2]==com[0])||(com[2]==com[1]));
	}
}
