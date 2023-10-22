package review.week5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import oracle.net.aso.l;


public class DeptManager3 extends JFrame implements ActionListener {
	/*선언부*/
	/* ****************************************************************************************************************************************/
	//JDBC API 활용하여 오라클 서버에서 부서목록 조회하기
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DBConnectionMgr dbMGR = null;
	/* ****************************************************************************************************************************************/
	List<Map<String, Object>> deptList = new ArrayList<Map<String,Object>>();
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
	DeptManager3(){
		
	}
	/*정의메소드*/
	//화면구현, 이벤트버튼 넣기
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
	//리스트<맵<String,Object>>으로 활용하여 부서정보 더하기
	public List<Map<String, Object>> getDeptList() {
		Map<String, Object> map = new HashMap<>();
		map.put("DEPTNO", 10);
		map.put("DNAME", "영업부");
		map.put("LOC", "부산");
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
	/* ******데이터서버연동 메소드*********************************************************************************************************/
	//리스트<DeptDTO> 데이터 연동하기 -> sql
	public List<DeptDTO> getDTOList() {
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT empno, ename, sal, ename");
		sql.append("FROM   emp, dept");
		sql.append("WHERE emp.deptno = dept.deptno");
		try {
			con = dbMGR.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			DeptDTO dto = null;
			while(rs.next()) {
				dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				list.add(dto);
			}
			System.out.println(list);
		} catch (SQLException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			e.getStackTrace();
		}
		return list;
	}
	//List<Map<String,Object>>  리턴타입으로 정보더하기 
	public List<Map<String,Object>> getMapList() {
		List<Map<String, Object>> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT empno, ename, sal, ename");
		sql.append("FROM   emp, dept");
		sql.append("WHERE emp.deptno = dept.deptno");		
		try {
			con = dbMGR.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			Map<String, Object> map = null;
			while(rs.next()) {
				map = new HashMap<String, Object>();
				map.put("empno",rs.getInt("empno"));
				map.put("ename",rs.getInt("ename"));
				map.put("sal",rs.getInt("sal"));
				map.put("dname",rs.getInt("dname"));			
				list.add(map);
			}
			System.out.println(map);
		} catch (SQLException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			e.getStackTrace();
		}
		return list;
	}
	//새로고침 구현하기 
	public void refreashData() {
		
	}
	/*메인메소드*/
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		DeptManager3 dm = new DeptManager3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		/*조회*/
		if(obj == jbtnSelect) {
			System.out.println("조회 버튼 클릭");
			List<DeptDTO> list = getDTOList();
			while(dtm_dept.getRowCount()>0) {
				dtm_dept.removeRow(0);
			}
			for(int i=0; i<list.size();i++) { //갖고있는 리스트를 행으로 다 불러오기 
				DeptDTO dept = list.get(i);
				Vector<Object> v = new Vector<Object>();
				v.add(0, dept.getDeptno());
				v.add(1, dept.getDname());
				v.add(2, dept.getLoc());
				dtm_dept.addRow(v);
			}
		}
		/*삭제*/
		else if(){
		}		
		/**/
		else if(){
		}		
		/**/
		else if(){
		}		
		/**/
		else if(){
		}		
	}
}
