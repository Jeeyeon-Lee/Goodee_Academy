package com.step5_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DeptManager2 extends JFrame implements ActionListener{
	/*선언부*/
	//자료구조 관련 (부서별 저장, 여러 속성의 추가 및 관리가 필요한 코드이므로 부서-List/각 내용-map으로 같이 사용)
	//List 컬렉션은 데이터를 순차적으로 저장하고 관리하는 데 유용
	//Map 컬렉션은 고유한 키와 해당하는 값을 매핑하여 검색과 수정을 용이
	//Set 컬렉션은 중복된 값을 제거하고 유일한 값들을 관리하는 데 사용
	List<Map<String, Object>> deptList = new ArrayList<>();
	//화면처리 관련
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[3][3]; //데이터는 아직x, 후처리
	DefaultTableModel  dtm_dept = new DefaultTableModel(datas,header); //폼, 양식만 만들어 DataSet 구상하기! 
	//파라미터 순(2차배열 자리, 1차배열 자리)
	//javax.swing.table.DefaultTableModel.DefaultTableModel(Object[][] data, Object[] columnNames)
	JTable jt_dept          = new JTable(dtm_dept); //위 데이터를 테이블에 넣겠음.
	JScrollPane jsp_dept = new JScrollPane(jt_dept); //속지 또한 테이블을 참조함.  	
	JPanel jp_north         = new JPanel();
	JButton jbtnSelect    = new JButton("조회");
	JButton jbtnInsert    = new JButton("입력");
	JButton jbtnDelete    = new JButton("삭제");  //이 때 새로고침
	JButton jbtnAdd       = new JButton("행추가");
	JButton jbtnDel        = new JButton("행삭제");
	JButton jbtnExit        = new JButton("종료");
	/*생성자*/
	public DeptManager2() {
		initDisplay();
	}
	/*정의메소드*/
	//화면처리 & 액션리스너 추가
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
	//데이터를 deptList 저장하는 메소드 (List Map 사용)
	public List<Map<String, Object>> getDeptList(){
		//HashMap은 키(key)와 값(value)의 쌍으로 데이터를 저장하는 데 사용
		Map<String, Object> map = new HashMap<>();
		//Map의 생성 메소드는 put(k,v)
		map.put("DEPTNO",10);          //대문자인 이유, 토드에서는 대문자로 사용하고 있음. 맞춰서 보내줘야함.
		map.put("DNAME", "영업부");
		map.put("LOC", "부산");
		//List의 생성 메소드 add(e)
		deptList.add(map);
		map = new HashMap<>();//복사본
		map.put("DEPTNO", 20);
		map.put("DNAME", "개발부");
		map.put("LOC", "대구");
		deptList.add(map);
		map = new HashMap<>();//복사본
		map.put("DEPTNO", 30);
		map.put("DNAME", "인사부");
		map.put("LOC", "서울");
		deptList.add(map);
		return deptList;	
	}
	/*메인메소드*/
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true); //첫 MVC패턴을 사용했던 swing에서 제공되는 창의 형태!
		DeptManager2 dm = new DeptManager2();
	}
	//버튼이벤트로 추상메소드 구현하기!
	@Override
	public void actionPerformed(ActionEvent e) {
		//JButton jbtnSelect    = new JButton("조회");
		Object obj = e.getSource();
		if(obj == jbtnSelect) {
			System.out.println("조회 버튼 클릭");
			//테이블에 행이 남아있다면 0번째를 삭제해 -> 행이 있다면 모두 삭제가 됨 
			while(dtm_dept.getRowCount()>0) { 
				dtm_dept.removeRow(0);
			}
			//deptList에 저장되어있는 각 Map 요소를 가져와라
			//
			for(int i=0;i>deptList.size();i++) {
				Map<String, Object> map = deptList.get(i);
				//Vector는 테이블 모델(dtm_dept)에 데이터를 추가하기 위해 사용-크기가 조정되는 배열과 유사한 기능!
				Vector<Object> v = new Vector<>();
				//Vector add(int index, Object element)
				//Map get(Object key)
				v.add(0, map.get("DEPTNO"));
				v.add(1,map.get("DNAME")); //벡터에 초기화
				v.add(2,map.get("LOC")); //벡터에 초기화
				dtm_dept.addRow(v);
			}
		}
		//JButton jbtnInsert    = new JButton("입력");
		else if(obj == jbtnInsert) {
			System.out.println("입력 버튼 클릭");
			//Vector로 추가하는 것 필요
			List<Object> addRow = new Vector<>();
			dtm_dept.addRow((Vector<?>) addRow);
			
		}
		//JButton jbtnDelete    = new JButton("삭제");  //이 때 새로고침
		else if(obj == jbtnDelete) {
			System.out.println("삭제 버튼 클릭");
			int index = jt_dept.getSelectedRow(); //선택한 행의 번호를 index
			if(index<0) { //안눌렸다면?
				JOptionPane.showConfirmDialog(this, "삭제할 데이터를 선택하세요", "Info", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			else {
				System.out.println(index);//선택한 인덱스의 행번호 출력
				//그 인덱스 번호를 리스트에서 삭제 List.remove(int index)
				Map<String, Object> map = deptList.remove(index);
				//삭제된 내용 출력 검색 Map.get(Object key)
				System.out.println(map+", "+map.get("DEPTNO")+", "+ map.get("DNAME")+", "+map.get("LOC"));
				//삭제 되었나요??
				if(map!=null) {
					JOptionPane.showMessageDialog(this, "삭제 성공 하셨습니다..","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
					refreshData(); //새로고침 메소드 호출
				}
				else {
					JOptionPane.showMessageDialog(this, "삭제 실패하셨습니다.","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				}
			}
		}
		//JButton jbtnAdd       = new JButton("행추가");
		else if(obj == jbtnAdd) {
			System.out.println("행추가 버튼 클릭");
			//행추가 방법 1. Vector 사용
			Vector<Object> addRow = new Vector<>();
			//dept에 줄 생성하면서 vector로 자료에도 넣기
			dtm_dept.addRow(addRow);
			//행추가 방법 2. 1차 배열 사용
//			Object addRow2[] = new Object[3];
//			dtm_dept.addRow(addRow2);
			
		}
		//JButton jbtnDel        = new JButton("행삭제");
		else if(obj == jbtnDel) {
			System.out.println("행삭제 버튼 클릭");
//			//한줄도 안남으면 멈춰야지 if로!! 
			int index = jt_dept.getSelectedRow(); //사용자가 선택한 로우의 인덱스값을 반환하기
			if(index<0) {  //아무것도 선택안했을 때, 삭제할 데이터 선택하라고 하기
				JOptionPane.showMessageDialog(this, "삭제할 행을 선택해주세요","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				return;
			}else {
				JOptionPane.showMessageDialog(this, "삭제되었습니다","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				dtm_dept.removeRow(index);
			}
		}
		//JButton jbtnExit        = new JButton("종료");
		else if(obj == jbtnExit) {
			System.out.println("종료 버튼 클릭");
		    int option = JOptionPane.showConfirmDialog(this, "프로그램을 종료하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
		    if (option == JOptionPane.YES_OPTION) {
		    	System.exit(0);
		    }
		}
	}
	public void refreshData() {
		while(dtm_dept.getRowCount()>0) {       //테이블의 줄이 0 이상이면(일단 출력이 된 화면이라면)
			dtm_dept.removeRow(0);                   //0번째 로우를 삭제함. 왜? 로우가 삭제될 때 마다 dtm의 로우수가 줄어든다. 
		}
	}

}
