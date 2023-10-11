package com.step5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class M {
	/*선언부*/
	JFrame jf = new JFrame();
	JButton jbtn = new JButton("조회"); //여기서 jbtn버튼은 해당 버튼 객체를 가리키게 됨.
	JButton jbtn2 = jbtn; //이건 뭘까??? jbtn2를 생성했는데? 참조를 윗줄의 jbtn에서 진행함. 
	
	/*
	jbtn 변수에 저장된 객체의 주소를 jbtn2 변수에 대입하는 것임.
	즉, 두 개의 변수(jbtn, jbtn2)는 동일한 버튼 객체를 참조 
	JButton jbtn2 = jbtn; 문장은 동일한 버튼을 가리키기 위해 jbtb2에도 같은 주소값(참조)을 할당하는 것입니다.
	객체 참조가 같은 객체에 대한 접근을 공유하는 것이기 때문에 
	한 변수로 해당 객체의 속성을 수정하면 다른 변수에서도 동일한 변화가 발생
	*/
	
	/*생성자*/
	public M() {
		initDisplay();
	}
	/*정의메소드*/
	public void initDisplay() {
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.add("South",jbtn2);
		jf.add("North",jbtn);  //마지막에 재정의된 버튼으로 생성된다!
	}
	/*메인메소드*/
	public static void main(String[] args) {
		M m = new M();
	}
}