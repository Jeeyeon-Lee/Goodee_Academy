package com.step6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.util.DBConnectionMgr;

public class ZipCodeView extends JFrame implements ActionListener, FocusListener, MouseListener{
	/*선언부*/
	String zdo = null;
	Connection 			con 	= null;
	PreparedStatement 	pstmt 	= null;
	ResultSet 			rs 		= null;
	JPanel jp_north = new JPanel();//Div태그 span생각
	String zdos[] = {"전체","서울","경기","강원"};
	String zdos2[] = {"전체","부산","전남","대구"};
	Vector<String> vzdos = new Vector<>();//vzdos.size()==>0
	JComboBox jcb_zdo = new JComboBox(zdos);//West
	JComboBox jcb_zdo2 = null;//West
	JTextField jtf_search = new JTextField("동이름을 입력하세요.");//Center
	JButton jbtn_search = new JButton("조회");//East
	String cols[] = {"우편번호","주소"};
	String data[][] = new String[0][2];
	DefaultTableModel dtm_zipcode = new DefaultTableModel(data,cols);
	JTable jtb_zipcode = new JTable(dtm_zipcode);
	JTableHeader jth = jtb_zipcode.getTableHeader();
	JScrollPane jsp_zipcode = new JScrollPane(jtb_zipcode
			,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	String zdos3[] = null;
	DBConnectionMgr dbMgr = null;//싱글톤 패턴으로 관리한다. 복제본을 만들지 않는다. 절대로....
	MemberShipView memberShipView = null;
	/*생성자*/
	public ZipCodeView() {}
	public ZipCodeView(MemberShipView memberShipView) {
		this.memberShipView = memberShipView;
	}
	/*정의메소드*/
	//화면처리부
	public void initDisplay() {
		jtb_zipcode.requestFocus();
		jtb_zipcode.addMouseListener(this);
		jtf_search.addFocusListener(this);
		jbtn_search.addActionListener(this);
		jtf_search.addActionListener(this);
		//북쪽 배치하는 속지를 FlowLayout-> 동서남북중앙 - UI솔루션
		jp_north.setLayout(new BorderLayout());
		//vzdos.copyInto(zdos2);
		for(int x=0;x<zdos2.length;x++) {
			vzdos.add(zdos2[x]);
		}
		for(String s:vzdos) {
			System.out.println("s===>"+s);
		}
		//jcb_zdo2 = new JComboBox(zdos3);//West
		//jp_north.add("East",jcb_zdo2);
		jp_north.add("Center",jtf_search);
		jp_north.add("East",jbtn_search);
		this.add("North",jp_north);
		this.add("Center",jsp_zipcode);
		this.setTitle("우편번호 검색");
		this.setSize(430, 400);
		this.setVisible(true);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		ZipCodeView zcs = new ZipCodeView();
		zcs.initDisplay();//화면이 먼저 열리도록 하고 오라클서버를 나중에 연결하자
		//zcs.refreshData("가산");
	}
	/* ***********************************************************************************
	사용자로부터 동이름 입력받아서 조건 검색을 구현하기
	************************************************************************************/
	//데이터 파라미터값으로 새로고침 
	public void refreshData(String dong) { //동 선택에 따라 새로운 데이터로 고침!
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT zipcode, address     ");
		sql.append("FROM zipcode_t              ");
		sql.append("WHERE dong LIKE ?||'%'");  //?는 어떤 값이든
		dbMgr = DBConnectionMgr.getInstance();
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			//물음표 자리 처리 필요
			pstmt.setString(1, dong); 
			rs = pstmt.executeQuery();
			Map<String, Object> rmap = null;
			while(rs.next()) {
				rmap = new HashMap<>();
				rmap.put("zipcode", rs.getInt("zipcode"));
				rmap.put("address", rs.getInt("address"));
				list.add(rmap);
			}
			System.out.println(list);
			//위는 우편을 가져오는 거였다면, 값을 데이터로 넣는 작업 필요함!
			for(int i=0;i<list.size();i++) {
				Map<String, Object> map = list.get(i); 
				Vector<Object> v = new Vector<Object>();
				v.add(0,map.get("zipcode"));
				v.add(1,map.get("address"));
				dtm_zipcode.addRow(v);
			}
			//예외처리
		}catch (SQLException se) {
			System.out.println(se.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtn_search || obj == jtf_search) { 
			System.out.println(jtf_search.getText()); //입력받은 텍스트 가져와보기
			String dong = jtf_search.getText();
			refreshData(dong);//이벤트 들어올 때마다 새로고침
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getClickCount()==2) { //더블클릭했니?
			//화면에서 더블클릭한 행의 인덱스값 반환
			int index = jtb_zipcode.getSelectedRow();
			int zipcode = (int) dtm_zipcode.getValueAt(index, 0);
			String address = (String)dtm_zipcode.getValueAt(index, 1);
			System.out.println(zipcode + ", " + address);
			//부모의 주소번지가 필요함. 
			//insert here 회원가입창에서 우편번호와 주소자리 조회된 결과를 자동으로 출력해줌
			//MembershipView인스턴스화하면 그 때 즉시 ZipCodeView 객체가 생성되고 이 때 파라미터 자리에
			//this는 앞에 인스턴스화를 통해 현재 로딩 중인 그 원본이므로 복사본이 아니다...
			memberShipView.jtf_zipcode.setText(String.valueOf(zipcode));
			memberShipView.jtf_address.setText(String.valueOf(address));
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void focusGained(FocusEvent e) {
		Object obj = e.getSource();
		//서치에 커서를 두었니?  커서 놓는 칸을 빈 칸으로 만들어줘
		if(obj==jtf_search) {
			jtf_search.setText("");
		}
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

}
