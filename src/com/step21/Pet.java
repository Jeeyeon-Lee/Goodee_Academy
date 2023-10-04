package com.step21;
class DPet{
	String kind = "강아지";
	public String favorite() 		{
		String kind = "길냥이";
		System.out.println("제가 좋아하는 동물이에요");
		kind = "호랑이";
		return kind;
	}
}
public class Pet {

	public static void main(String[] args) {
		DPet d = new DPet();
		System.out.println(d.kind);   //강아지 : 기본값 전변 출력
		String kind = "고양이";       
		System.out.println(kind);     //고양이 : 재정의 값 출력 
		String other = d.favorite();  //other 값에 메소드의 값 저장
		System.out.println(other);    //호랑이 : 메소드에서 마지막 정의된 값 출력
	}

}
