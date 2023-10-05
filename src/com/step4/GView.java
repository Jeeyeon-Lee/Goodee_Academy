package com.step4;
//해당클래스 그려보기
//GLogic에서 GView j 사용하기
//GView에서 GLogic i 사용하기
//사용자정의 클래스, 자바제공 클래스 사이 활용하기 가능한가
class GLogic{
	int i = 4;
	//생성자, 파라미터값에 여러 값 다 올 수 있음.
	//둘 다 클래스 참조해도 되나?서로? 되는데
	public GLogic(GView gv) {
		//GView의 주소, j값을 호출하고 싶음.
		System.out.println(gv);    //첫번째 주소
		System.out.println(gv.j);  //j값 5, 가져오기 성공
	}
}
public class GView {
	int j = 5;
	GView() { 
		//GLogic의 i값 가져오고 싶음.->인스턴스화
		GLogic gl = new GLogic(this);
		System.out.println(gl.i);   //i값 4, 가져오기 성공
	}
	public static void main(String[] args) {
		GView gv = new GView();          //생성자 첫번째 호출
		System.out.println(gv);
		gv = new GView();                //생성자 두번째 호출
		System.out.println(gv);
	}
}
