package com.step5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
				dtm_dept.removeRow(0);              //0번째 로우 삭제!
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
		/*삭제하기*/
		else if(obj == jbtnDelete) {
			System.out.println("삭제버튼 클릭");
			int index = jt_dept.getSelectedRow(); //index는 사용자가 선택한 로우의 번호
			//index가 0보다 작다(선택안되어있을 때)
			if(index<0) {
				//JOptionPane 특정상황 시 팝업 창 띄우기
				//shouMessageDialog(클래스, 메시지, 타이틀명, 아이콘) 메시지 띄우는 메소드
				JOptionPane.showMessageDialog(this, "삭제할 데이터를 선택하시오", "Info", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			else {//index가 선택되었을 때
				System.out.println(index);//선택한 index의 번호는?
				DeptDTO rdept = deptList.remove(index); //DTo의 deptList에서 해당 index 삭제(remove)
				System.out.println(rdept+", "+rdept.getDeptno()+", "+rdept.getDname()+", "+rdept.getLoc());//삭제된 것 불어오기 
				//삭제 성공했니??(이런 조건들이 빈틈없는 코드를 완성함!!
				if(rdept!=null) {//삭제된 rdept가 null값이 아니니? 그럼 삭제된거
					JOptionPane.showMessageDialog(this, "삭제 성공 하였습니다.", "Info", JOptionPane.INFORMATION_MESSAGE);
					refreshData(); //새로고침 메소드 실행
				}
			}
		}
		/*종료 하기*/
		else if(obj == jbtnExit) {
			System.out.println("종료버튼 클릭");
			dispose();
		}
		/*행추가 하기*/
		else if(obj == jbtnAdd) {
			System.out.println("행추가버튼 클릭");
			Vector<Object> addRow = new Vector<>();
			dtm_dept.addRow(addRow);
		}
		/*행삭제 하기 1*/
		else if(obj == jbtnDel) {
			System.out.println("행삭제버튼 클릭");
			//행이 없을 때 멈추려면?
			int index = dtm_dept.getRowCount();
		    if (index > 0) {
		        dtm_dept.removeRow(0);
		        JOptionPane.showMessageDialog(this, "행 삭제 성공하였습니다.", "Info", JOptionPane.INFORMATION_MESSAGE);
		    } else {
		        JOptionPane.showMessageDialog(this, "삭제할 행이 없습니다.", "Info", JOptionPane.INFORMATION_MESSAGE);
		    }
		}
		/*행삭제 하기 2*/
		else if(obj == jbtnDel) {
			System.out.println("행삭제버튼 클릭");
			int index = jt_dept.getRowCount();
			if(index>0) {
				DefaultTableModel model = (DefaultTableModel) jt_dept.getModel();
				model.removeRow(0);
				JOptionPane.showMessageDialog(this, "행 삭제 성공하였습니다.", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(this, "삭제할 행이 없습니다.", "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		/*행삭제 하기 2*/
		else if(obj == jbtnDel) {
			System.out.println("행삭제버튼 클릭");
				
		}
		
		/*입력 하기*/
		else if(obj == jbtnInsert){
			System.out.println("입력버튼 클릭");
			//매개변수로 전달된 벡터(Vector) 형태의 데이터를 테이블에 새로운 행으로 추가합니다.
			List<Object> addRow = new Vector<>();
			//?는 와일드카드 타입으로, 어떤 타입도 될 수 있다는 의미->유연성 확보, 이를 메소드에 전달하여 새로운 행 추가
			dtm_dept.addRow((Vector<?>) addRow);
		}
	}
	//새로고침 메소드
	public void refreshData() { //테이블이 9 이상이면 0번째 로우 삭제하기
		while(dtm_dept.getRowCount()>0) {
			dtm_dept.removeRow(0);
		}
	}

}
