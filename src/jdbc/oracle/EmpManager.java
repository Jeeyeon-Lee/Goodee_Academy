package jdbc.oracle;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpManager extends JFrame implements ActionListener {
	/*선언부*/
	JPanel jp_north = new JPanel();
	JButton jbtn_select   = new JButton("조회");
	JButton jbtn_insert   = new JButton("입력");
	JButton jbtn_update = new JButton("수정");
	JButton jbtn_delete  = new JButton("삭제");
	String data[][] = new String[0][3];                  //2차 배열
	String header[] = {"사원번호", "사원명","급여"};
	DefaultTableModel dtm = new DefaultTableModel(data,header);       //데이터 값(web에서 JSON의 역할이 됨)
	JTable jt = new JTable(dtm);                                                         //틀, 양식, 표
	JScrollPane jsp = new JScrollPane(jt);                                             //속지(위 내용 다 포함)   
	/*생성자*/
	public EmpManager() {
		init();
	}
	/*정의메소드*/
	//데이터 초기화 메소드(선언부에서는 data 3*3 가 선언만 되었고, 값이 없는 상태임)
	//2차 배열에 값 넣는 방법
	public void init() {
		data = new String[][] {
			{"7566","나신입","3000"},
			{"7499","나초보","4000"},
			{"7748","나일등","4500"}
		};
	}
	//화면구현 메소드 & 버튼에 액션리스너 추가 필요
	public void initDisplay() {
		System.out.println("initDisplay 호출");
		jbtn_select.addActionListener(this); //this는 나 자신 EmpManager 
		jbtn_insert.addActionListener(this); //this는 나 자신 EmpManager 
		jbtn_update.addActionListener(this); //this는 나 자신 EmpManager 
		jbtn_delete.addActionListener(this); //this는 나 자신 EmpManager 
		jp_north.setLayout(new GridLayout(1,4)); //GridLayout은 창을 n으로 나누어서 가득 사용-1*4 레이아웃을 새로 구성(default는 왼쪽에서부터 오른쪽으로 생성되며 공간이 남음)
		jp_north.add(jbtn_select);
		jp_north.add(jbtn_insert);
		jp_north.add(jbtn_update);
		jp_north.add(jbtn_delete);
		Container con = this.getContentPane();
		dtm = null;
		dtm = new DefaultTableModel(data, header);
		jt = null;
		jt = new JTable(dtm);
		jsp = null;
		jsp = new JScrollPane(jt);
		this.add("Center",jsp);  //(위치, 컴포넌트)
		this.setSize(500,300);
		this.setVisible(true);
		this.add("North",jp_north);		
	}
	/*메인메소드*/
	public static void main(String[] args) {
		EmpManager em = new EmpManager();
		em.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//수정버튼을 누르면 아래 내용으로 수정이 되는 메소드 구현
		Object obj = e.getSource();
		if(obj == jbtn_update) {
			/*
			사용메소드
			getRowCount() 
			isRowSelected()
			getValueAt()
			setValueAt()
			 */
			for(int i=0;i<dtm.getRowCount();i++) {
				if(jt.isRowSelected(i)) {
					String name = (String)dtm.getValueAt(i, 1);
					System.out.println(name); //나신입, 나초보, 나일등
					if(name.equals("나신입")) {    //나신입은 급여 5000으로 
						dtm.setValueAt(5000, i, 2); //세번째 행 값을 5000으로 바꿔줘
					}
					else if(name.equals("나초보")) {    //나초보는 급여 3500으로 
						dtm.setValueAt(3500, i, 2); //세번째 행 값을 3500으로 바꿔줘
					}
					else if(name.equals("나일등")) {    //나일등은 급여 5500으로 
						dtm.setValueAt(5500, i, 2); //세번째 행 값을 5500으로 바꿔줘
					}
				}
			}
		}
	}
}
