package jdbc.oracle;

public class BookVO {
	/*선언부*/
	//변수 오라클에서 가져오기!! 
	 private int b_no     = 0;  
	 private String b_title  = "";  
	 private String b_author = "";  
	 private int b_price  = 0;  
	 //자료구조에 생성해두진 않았지만 코드 설계 중에 필요한 변수나 클래스를 코드로 작성해도 가능함!! 
    int count = 5;//도서 주문량
    int start = 0;//시작페이지
    int end = 0;//끝나는 페이지
    int pagePerList = 10;
    int totalRecord = 45; 
	/*생성자*/

	/*정의메소드*/

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_author() {
		return b_author;
	}

	public void setB_author(String b_author) {
		this.b_author = b_author;
	}

	public int getB_price() {
		return b_price;
	}

	public void setB_price(int b_price) {
		this.b_price = b_price;
	}

	/*메인메소드*/
	public static void main(String[] args) {

	}

}
