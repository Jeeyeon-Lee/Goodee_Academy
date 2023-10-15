package com.step5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DeptManager extends JFrame implements ActionListener {
	/*선언부*/
	//deptList라는 배열정보담을 것 생성
	List<DeptDTO> deptList = new ArrayList<>();
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[3][3]; //데이터는 아직x, 후처리
	//DefaultTableModel vector의 값을 담는 테이블을 관리하는 패키지 ->header과 데이터를 담기
	DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);
	JTable jt_dept = new JTable(dtm_dept); //위 데이터 값을 표의 모양 생성
	JScrollPane jsp_dept = new JScrollPane(jt_dept); //위 테이블을 넣는 전체 창 생성
	JPanel jp_north = new JPanel();//북쪽에 버튼을 넣을 수 있는 부분 생성
	//아래 버튼을 생성 -> 나중에 JPanel 부분에 삽입 예정
	JButton jbtnSelect    = new JButton("조회");
	JButton jbtnInsert    = new JButton("입력");
	JButton jbtnDelete    = new JButton("삭제");  //이 때 새로고침
	JButton jbtnAdd       = new JButton("행추가");
	JButton jbtnDel        = new JButton("행삭제");
	JButton jbtnExit        = new JButton("종료");
	/*생성자*/
	public DeptManager() {
		getDeptList();
		initDisplay();
	}
	/*정의메소드*/
	//화면처리부 & 액션 삽입부
	public void initDisplay() {
		jbtnAdd.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnInsert.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnDelete.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnSelect.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnDel.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnExit.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT)); //패널에 들어가는 내용 왼쪽으로! 
		jp_north.add(jbtnSelect);
		jp_north.add(jbtnInsert);
		jp_north.add(jbtnDelete);
		jp_north.add(jbtnAdd);
		jp_north.add(jbtnDel);
		jp_north.add(jbtnExit);
		this.add("North", jp_north);
		this.add("Center",jsp_dept); //속지-데이터-테이블 다 연동 한꺼번에 나옴. 
		this.setSize(500,400);
		this.setVisible(true);
	}
	//입력되는 값을 리스트로 더하는 메소드
	public List<DeptDTO> getDeptList() {
		DeptDTO dept = new DeptDTO(10, "영업부", "부산");
		deptList.add(dept);
		dept = new DeptDTO(20,"개발부","대전");
		deptList.add(dept);
		dept = new DeptDTO(30, "운영부","인천");
		deptList.add(dept);
		return deptList;
	}
	/*메인메소드*/
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true); //첫 MVC패턴을 사용했던 swing에서 제공되는 창의 형태!
		DeptManager dm = new DeptManager(); //상속된 JFrame도 호출이 됨.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		/*조회하기*/
		if(obj == jbtnSelect) {
			System.out.println("조회버튼 클릭");
			while(dtm_dept.getRowCount()>0) {       //테이블의 줄이 0 이상이면(일단 출력이 된 화면이라면)
				dtm_dept.removeRow(0);                 //0번째 로우 삭제!
			}
			for(int i=0; i<deptList.size();i++) {
				DeptDTO rdept = deptList.get(i);
				//Vector 클래스는 확장 가능한 객체 배열을 구현
				Vector<Object> v = new Vector<>();
				//이 Vector의 지정된 위치에 지정된 요소를 삽입
				v.add(0,rdept.getDeptno());
				v.add(1,rdept.getDname());
				v.add(2,rdept.getLoc());
				//addRow 위에 삽입된 v를 table 맨 아래줄로 추가함. 
				dtm_dept.addRow(v);
			}
		}
	}

}
