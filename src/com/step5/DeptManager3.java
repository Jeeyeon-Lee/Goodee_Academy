package com.step5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import com.util.DBConnectionMgr;

public class DeptManager3 extends JFrame implements ActionListener {
	/*선언부*/
	/* ****************************************************************************************************************************************/
	Connection con                = null;
	PreparedStatement pstmt   = null;
	ResultSet rs                      = null;
	//JDBC API 활용하여 오라클 서버에서 부서목록 조회하기(DBConnectionMgr을 통해 연결 가능)
	DBConnectionMgr dbMGR = null;
	/* ****************************************************************************************************************************************/
	//리스트, 맵 생성
	List<Map<String, Object>> deptList = new ArrayList<>();
	//화면처리 관련
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[3][3]; //데이터는 아직x, 후처리
	DefaultTableModel  dtm_dept = new DefaultTableModel(datas,header); //폼, 양식만 만들어 DataSet 구상하기! 
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
	DeptManager3(){
		initDisplay();
		dbMGR = DBConnectionMgr.getInstance(); //오라클서버 연결안되어있으면 생성하기!
	}
	/*정의메소드*/
	//화면처리부/////////////////////////////////////////////////////////////////////////////////////////////////////////
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
	//리스트, 맵 활용하여 새로 자료구조에 더하는 메소드//////////////////////////////////////////////////////////////
//	public List<Map<String, Object>> getDeptList() {
//		Map<String, Object> map = new HashMap<>();
//		map.put("DEPTNO",10);          //대문자인 이유, 토드에서는 대문자로 사용하고 있음. 맞춰서 보내줘야함.
//		map.put("DNAME", "영업부");
//		map.put("LOC", "부산");
//		deptList.add(map);
//		map = new HashMap<>();//복사본
//		map.put("DEPTNO", 20);
//		map.put("DNAME", "개발부");
//		map.put("LOC", "대구");
//		deptList.add(map);
//		map = new HashMap<>();//복사본
//		map.put("DEPTNO", 30);
//		map.put("DNAME", "인사부");
//		map.put("LOC", "서울");
//		deptList.add(map);
//		return deptList;
//	}
	//서버연동하여 리스트 더하는 메소드(getConnection)////////////////////////////////////////////////////////////////////////////////////
	public List<DeptDTO> getDTOList() {
		System.out.println("제네릭 타입을 getter/setter로 처리할 때");
		List<DeptDTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();    //java.lang.StringBuilder.StringBuilder() -> sql문생성
		//sql문으로 작성 그런데 어디에서???
		sql.append("SELECT deptno,dname,loc FROM dept");
		//try-catch문으로 예외처리하여 작성
		 //deptMGR의 connection메소드 사용해서 DB연결하고, 
		//거기의 문구를 sql에 따라 문자열을 넣을거고 Connection객체를 주입받을거임.
		try { 
			con = dbMGR.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			DeptDTO dto = null;
			//DeptDTO를 dto로 생성하면서 리스트에 추가해줘
			while(rs.next()){
				dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				list.add(dto);
			}
			System.out.println(list);
			//부적절한 식별자일 때,
		} catch (SQLException se) {
			System.out.println(se.toString());
		} catch (Exception e) {
			e.printStackTrace(); //이력을 출력해줘
		}
		return list;
	}
	public List<Map<String, Object>> getMapList() {  //2번째로 연습! Map 두 개 이상 조인할 때 유용, 이것으로 많이 연습 필요!
		System.out.println("제네릭 타입을 Map으로 처리할 때");
		List<Map<String, Object>> list = new ArrayList<>();
		//StringBuffer는 스레드 안전, StringBuilder 불안전, 인터셉트가능 but, 지금은 로컬이니까 괜찮음. 
		//String과 비교할 때 하나로 관리 가능-메모리에 대한 이익 있음.
		StringBuilder sql = new StringBuilder(); //append는 옆으로 붙는 것 가능
		sql.append("SELECT empno, ename, sal, dname   ");
		sql.append("FROM emp, dept                   ");
		sql.append("WHERE emp.deptno = dept.deptno  ");
		try {
			con = dbMGR.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			Map<String, Object> map = null;
			while(rs.next()) {
				map = new HashMap<>();
				map.put("empno", rs.getInt("empno"));
				map.put("ename", rs.getString("ename"));
				map.put("sal", rs.getInt("sal"));
				map.put("dname", rs.getString("dname"));
				//list 더하기
				list.add(map);
			}
			System.out.println(map);
			//예외처리 추가 필요
		}catch (SQLException se) {
			System.out.println(se.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

	/*메인메소드*/
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true); //첫 MVC패턴을 사용했던 swing에서 제공되는 창의 형태!
		DeptManager3 dm = new DeptManager3(); //상속된 JFrame도 호출이 됨.
	}
	/*오버라이드*/
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 호출은 반드시 addactionLister가 필요");
		Object obj = e.getSource();
		//버튼이 눌렸을 때의 이벤트 입력
		/*조회하기 List 버전*/
		if(obj == jbtnSelect) {                               //너 조회눌렀어?
			System.out.println("조회 버튼 클릭");
			List<DeptDTO> list = getDTOList();
			while(dtm_dept.getRowCount()>0)
				dtm_dept.removeRow(0);
			for(int i=0;i<list.size();i++) {
				DeptDTO dept = list.get(i);
				Vector<Object> v = new Vector<Object>();
				v.add(1, dept.getDeptno());
				v.add(2, dept.getDname());
				v.add(3, dept.getLoc());
				list.add(dept);
			}
		}
		/*삭제하기*/
		else if(obj==jbtnDelete) { //삭제를 눌렀어?
			System.out.println("삭제버튼 클릭");
			int index = jt_dept.getSelectedRow(); //사용자가 선택한 로우의 인덱스값을 반환하기
			if(index<0) {  //아무것도 선택안했을 때, 삭제할 데이터 선택하라고 하기
				JOptionPane.showMessageDialog(this, "삭제할 데이터를 선택하시오.","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				return; //메소드 탈출
			}
			else {  //로우를 선택했을 때 데이터를 삭제하기
				System.out.println(index);//선택하고 누른 데이터는 몇 번째 로우인가????
				//insert here
				Map<String, Object> map = deptList.remove(index);  //리스트에서 삭제해야 하니까 다트 앞에 deptList
				System.out.println(map+", "+map.get("DEPTNO")+", "+ map.get("DNAME")+", "+map.get("LOC"));
				//삭제성공하였나요?
				if(map!=null) {
					JOptionPane.showMessageDialog(this, "삭제 성공 하셨습니다..","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
					refreshData(); //새로고침 메소드 호출
				}
				else {
					JOptionPane.showMessageDialog(this, "삭제 실패하셨습니다.","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				}
			}
			}
		/*행추가 하기*/
		else if(obj==jbtnAdd) { //행추가 눌렀어? jp에 add 처리 필요! 
			System.out.println("행추가버튼 클릭");
			//행추가 방법 1. Vector 사용
			Vector<Object> addRow = new Vector<>();
			dtm_dept.addRow(addRow);
			//행추가 방법 2. 1차 배열 사용
//			Object addRow2[] = new Object[3];
//			dtm_dept.addRow(addRow2);
			
		}
		/*행삭제 하기 1번*/
//		else if(obj==jbtnDel) { //행삭제 눌렀어? 데이터가 사라지는게 아니라 UI에서 없애는 것!! jp에 delete 처리 필요! 
//			System.out.println("행삭제버튼 클릭");
//			dtm_dept.removeRow(0);
//			//한줄도 안남으면 멈춰야지 if로!! 
//			int index = jt_dept.getSelectedRow(); //사용자가 선택한 로우의 인덱스값을 반환하기
//			if(index<0) {  //아무것도 선택안했을 때, 삭제할 데이터 선택하라고 하기
//				JOptionPane.showMessageDialog(this, "행을 삭제했습니다.","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
//				return;
//			}else {
//				dtm_dept.removeRow(index);
//			}
//		}
		/*행삭제 하기 2번*/
		else if(obj == jbtnDel) {
//			//한줄도 안남으면 멈춰야지 if로!! 
			int index = jt_dept.getSelectedRow(); //사용자가 선택한 로우의 인덱스값을 반환하기
			if(index<0) {  //아무것도 선택안했을 때, 삭제할 데이터 선택하라고 하기
				JOptionPane.showMessageDialog(this, "삭제할 행을 선택해주세요","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				return;
			}else {
				dtm_dept.removeRow(index);
			}
		}
		/*입력 하기*/
		else if(obj==jbtnInsert) {
			System.out.println("입력버튼 클릭");
			List<Object> addRow = new Vector<>();
			dtm_dept.addRow((Vector<?>) addRow);
		}
		//JButton jbtnExit        = new JButton("종료");
		else if(obj == jbtnExit) {
			System.out.println("종료 버튼 클릭");
		    int option = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
		    if (option == JOptionPane.YES_OPTION) {
		    	System.exit(0);
		    }
		}
	}
	//새로운 정보 저장하는 메소드 
//	public void addData() {
//		while(dtm_dept.getRowCount()) {       //테이블의 줄이 0 이상이면(일단 출력이 된 화면이라면)
//			dtm_dept.removeRow(0);                   //0번째 로우를 삭제함. 왜? 로우가 삭제될 때 마다 dtm의 로우수가 줄어든다. 
//		}
//	}
	//새로고침(F5) 구현하기   -> 메소드 중심 코딩 전개
	public void refreshData() {
		while(dtm_dept.getRowCount()>0) {       //테이블의 줄이 0 이상이면(일단 출력이 된 화면이라면)
			dtm_dept.removeRow(0);                   //0번째 로우를 삭제함. 왜? 로우가 삭제될 때 마다 dtm의 로우수가 줄어든다. 
		}
	}
}