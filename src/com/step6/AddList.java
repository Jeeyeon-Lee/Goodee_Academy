package com.step6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;

import com.google.gson.Gson;

class Emp1{
	/*선언부*/
	private int empno;
	private String ename;
	/*정의메소드*/
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}
class Dept1{
	/*선언부*/
	private String dname;
	/*정의메소드*/
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
		
	}
}
public class AddList {
	public static void main(String[] args) {
		JButton jbtnSelect = new JButton();
		/* 리스트의 로우값(행)을 버튼으로 넣어줌 
		 * 선언부, 생성부 이름 다름. 다형성을 이룸. 재사용성, 이식성, 유연성 생김
		 */
		List<JButton> li  = new ArrayList<>();
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("empno", 7782);
		map.put("ename", "CLARK");
		map.put("dname", "ACCOUNTING");
		list.add(map); //List에 누적을 시켜줘야  n번째로 계속 생성됨 
		System.out.println(list);    //list 형식
		Gson g = new Gson();   // Gson import하기 위한 과정 거치는 것 필요(노션 참고) 
		String temp = g.toJson(list);
		System.out.println(temp);     //json 형식으로 변환 완료 -> 브라우저 출력시 연동됨?! 아름답게 출력? 
	}

	}

}
