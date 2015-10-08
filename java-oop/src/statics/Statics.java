package statics;
/**
 * @file_name : Statics.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 10. 5.
 * @story     : 스태틱 초기화 블록
 */
public class Statics {
	/*
	 * 스태틱 초기화 블록
	 *  - 생성자보다 먼저 호출되는 블록이다.
	 *  A a = new A() 와 상관없이 초기화 작업을 위해 만들어진 블록. 
	 *  힙영역과 상관없이 스태틱 영역에서 초기화 되는 것이다.
	 *  
	 */
	public static void main(String[] args) {
		System.out.println("main을 타고 들어옴");
		Box box = new Box();
		Box box2 = new Box("생성자-오버로딩");
		System.out.println("스태틱 필드 값 " + box.name2);
		Box.test(); //스태틱 메소드 사용법
		box.test(); //인스턴스 메소드 사용법
	}
}
class Box{
	public static String name2 = "한빛학원"; //static은 고정된 값이므로 값을 반드시 지정해 줘야 함.
	// final 과의 차이점은 : 메모리에 저장되는 장소가 다르다. 성격은 비슷함.static은 가장 먼저 메모리 영역 차지
	private String name;
	public Box(){
		System.out.println("기본 생성자");
	}
	public Box(String s){ //생성자 오버로딩
		System.out.println("오버로딩 생성자");
	}
	public static void test() {
		System.out.println("스태틱 메소드");
	}
	static{
		System.out.println("스태틱 초기화 블록");
	}
	{
		System.out.println("인스턴스 초기화 블록");
	}
	public String getName() {
		
		return "한빛 인스턴스";
	}
	
}












