package review.week5;
//데이터베이스 연결을 관리하기 위한 유틸리티 클래스입니다. 
//주요 기능으로는 데이터베이스 연결 객체(Connection)를 얻어오고,
//사용 후에는 자원을 해제하는 역할을 수행

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnectionMgr {
	/*선언부*/
	static DBConnectionMgr dbMGR = null;
	Connection con = null;
	PreparedStatement prst = null;
	ResultSet rs = null;
	public static final String _DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String _URL= "jdbc:oracle:thin:@127.0.0.1:1521:orcl11";
	public static final String _USER = "scott";
	public static final String _PW = "tiger";
	/*정의메소드*/
	//메소드를 통해 객체생성을 하므로 if문 사용해서 조건별 객체 생성이 가능해짐. 
	public static DBConnectionMgr getInstance() {
		if(dbMGR ==null) dbMGR = new DBConnectionMgr();//전변에 대한 null 체크 후 객체를 생성함
		//메소드 앞에 static을 붙여서 추가인스턴스화 없이 직접 메소드 호출이 가능하도록 설계 - 싱글톤 패턴과 관계 있음. 
		return dbMGR;
	}
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //java.lang.Class<T> -> java reflection API 공부, F/W만들 수 있음. (https://jeongkyun-it.tistory.com/225)
			con = DriverManager.getConnection(_URL,_USER,_PW);
		}
		catch (ClassNotFoundException e) {
			System.out.println("클래스를 못 찾는다.");
		}
			catch (Exception e) {
			e.getStackTrace();
			}
		return con;
	}
	public static void freeConnection(ResultSet rs, PreparedStatement pstmt, Connection con){
		try {
			if(rs !=null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*위 코드에서 22번과 24번 호출 시 문제가 없다면 catch문은 사용x */
	public static void freeConnection(PreparedStatement pstmt, Connection con){
		try {
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void freeConnection(ResultSet rs, CallableStatement cstmt, Connection con){
		try {
			if(rs !=null) rs.close();
			if(cstmt !=null) cstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void freeConnection(CallableStatement cstmt, Connection con){
		try {
			if(cstmt !=null) cstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}