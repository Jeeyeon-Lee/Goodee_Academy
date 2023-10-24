package collec.map;
class A1{
	A2 keySet() {  //A2 객체를 리턴타입으로 두어 반환해주는 keySet 메소드
		return new A2();
	}
}
class A2{
	Object[] toArray() {  //길이가 3인 배열을 생성하여 반환하는 toArray 메소드
		return new Object[3];
	}
}
public class AMain1 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		Object objs[] = a1.keySet().toArray(); //objs라는 변수에 길이가 3인 배열을 생성하여 대입해줌.
		System.out.println(objs.length);       //3
		for(Object obj : objs) {                 //배열에 아직 값을 넣지 않았으니 null 3회 나옴.
			System.out.println(obj);
		}
	}

}
