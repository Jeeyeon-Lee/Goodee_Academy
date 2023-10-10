package com.step5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BaseballGameView extends JFrame implements ActionListener {
	//선언부
	JFrame jf = new JFrame();
	String 		imgPath = "D:\\workspace_java\\dev_java\\src\\com\\week2\\";
	Image img = null;
	JMenuBar jmb = new JMenuBar();
	JMenu jm_game = new JMenu("게임");
	JMenuItem jmi_new = new JMenuItem("새 게임");
	JMenuItem jmi_dap = new JMenuItem("정답");
	JMenuItem jmi_clear = new JMenuItem("지우기");
	JMenuItem jmi_exit = new JMenuItem("나가기");
	JMenuItem jmi_menu = new JMenuItem("새 게임");
	JMenu jm_info = new JMenu("도움말");
	JMenuItem jmi_detail = new JMenuItem("야구숫자게임이란?");
	JMenuItem jmi_create = new JMenuItem("만든 사람들");
	//중앙 속지
	JPanel jp_center = new JPanel();
	//출력화면
	JTextArea jta_display = null;
	JScrollPane jsp_display = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextField jtf_user = new JTextField();
	Font font = new Font("Thoma",Font.BOLD, 14);
	JPanel jp_east = new JPanel();
	//버튼추가
	JButton jbtn_new = new JButton("새게임");
	JButton jbtn_dap = new JButton("정답");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_exit = new JButton("나가기");
	//변수
	int my[] = new int[3];
	int com[] = new int[3];
	int cnt = 0;
	//사용자메소드
	public void ranCom() {
		Random r = new Random();
		com[0] = r.nextInt(10);
		do {
			com[1] = r.nextInt(10);
		}while(com[0] == com[1]);
		do {
			com[2] = r.nextInt(10);
		}while(com[0] == com[2]||com[1] == com[2]);
	}
	public String account(String user) {
		if(user.length()!=3) {
			return "세 자리 숫자로 입력하세요.";
		}
		int temp = 0;
		int strike = 0;
		int ball = 0;
		try {
			temp = Integer.parseInt(user);
		}catch (NumberFormatException e) {
			return "숫자만 입력하세요.";
		}
		//사용자 입력 수 
		my[0] = temp/100;
		my[1] = (temp%100)/10;
		my[3] = temp%10;
		//컴퓨터 값과 비교하여 스트라이크, 볼 카운트하기
		for(int i=0;i<com.length;i++) {
			for(int j=0;j<my.length;j++) {
				if(com[i] == my[j]) {
					if(i==j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
			if(strike ==3) {
				return "정답입니다, 축하합니다.";
			}
		}//for문 끝
		return strike+"스 / "+ball;
	}
	//나가기 메소드
	public void exit() {
		System.exit(0);
	}
	//화면그리기
	public void initDisplay() {
		jta_display = new JTextArea();
		jsp_display = new JScrollPane(jta_display);
		jta_display.setOpaque(false);
		jf.setResizable(false);
		//jf.setContentPane(new BgPanel());
		//////////////// 툴바에 들어갈 이미지 버튼 추가하기 ///////////////
		//////////////// 메뉴 바 추가 시작 /////////////////
		jm_game.add(jmi_new);
		jm_game.add(jmi_dap);
		jm_game.add(jmi_clear);
		jm_game.add(jmi_exit);
		jm_info.add(jmi_detail);
		jm_info.add(jmi_create);
		jmb.add(jm_game);
		jmb.add(jm_info);
		//////////////// 메뉴 바 추가  끝   /////////////////
		System.out.println("initDisplay 호출 성공");
		//이벤트 소스와 이벤트 처리 클래스를 매핑하는 코드 추가
		//EventHandler ehandler = new EventHandler();
		//jtf_user.addActionListener(ehandler);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame:내안에 actionPerformed
		jtf_user.addActionListener(this);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame:내안에 actionPerformed
		jbtn_new.addActionListener(this);
		jbtn_dap.addActionListener(this);
		jbtn_clear.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jmi_exit.addActionListener(this);
		jbtn_new.setBackground(new Color(158,9,9));
		jbtn_new.setForeground(new Color(212,212,212));
		jbtn_dap.setBackground(new Color(7,84,170));
		jbtn_dap.setForeground(new Color(212,212,212));
		jbtn_clear.setBackground(new Color(19,99,57));
		jbtn_clear.setForeground(new Color(212,212,212));
		jbtn_exit.setBackground(new Color(54,54,54));
		jbtn_exit.setForeground(new Color(212,212,212));
		jp_east.setLayout(new GridLayout(4,1));
		jp_east.add(jbtn_new);
		jp_east.add(jbtn_dap);
		jp_east.add(jbtn_clear);
		jp_east.add(jbtn_exit);
		jta_display.setFont(font);
		jta_display.setBackground(new Color(255,255,200));
		jta_display.setForeground(new Color(57,109,165));

		jf.setJMenuBar(jmb);
		jtf_user.setBackground(new Color(255,255,200));
		jp_center.setBackground(Color.green);
		jp_east.setBackground(Color.black);
		jp_center.setLayout(new BorderLayout(0,10));
		jp_center.add("Center",jsp_display);
		jp_center.add("South",jtf_user);
		jta_display.setLineWrap(true);
		jf.setLayout(new BorderLayout(10,20));
		jf.add("Center",jp_center);
		jf.add("East",jp_east);
		jf.setTitle("야구 숫자 게임 Ver1.0");
		jf.setSize(400, 300);
		jf.setVisible(true);
	}
	//생성자
	BaseballGameView(){
		ranCom();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();
		System.out.println(label);
		Object obj = e.getSource();
//		System.out.println(obj);
		if("지우기".equals(label)) {
			jta_display.setText("");
		}
		else if("나가기".equals(label)) {
			exit();
		}
		else if(obj == jbtn_new || obj == jmi_new) { //버튼, 메뉴바 or 로 처리
			cnt = 0; //회 초기화
			ranCom();//정답 초기화
			jta_display.setText(""); //append뒤에 붙이기, setText 덮어쓰기
//			jta_display.append("정답은 "+com[0]+com[1]+com[2]+" 입니다.\n"); //정답확인용
		}
		//이벤트가 발생한 이벤트 소스의 문자열을 비교하기
		else if(e.getSource()==jtf_user) {
			jta_display.append(++cnt+"회 " +jtf_user.getText()+" : " 
		    + account(jtf_user.getText())+"\n");  //사용자가 입력한 값 : 0스0볼 출력
			jtf_user.setText("");
		}///////////입력하고 엔터 쳤을 때
		else if(obj==jmi_dap || "정답".equals(label)) {
			//1-먼저 채번(동사-기능-메소드 호출)하고 그 다음에 com배열에 있는 값을 출력해 준다.
			jta_display.append("정답은 "+com[0]+com[1]+com[2]+" 입니다.\n");
		}
	}///////////////end of actionPerformed
}
