package PolymorphsimFinish;
/**
 * @file_name : RoleMain.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 30.
 * @story     : 객체지향 특성을 설명하는 간단한 예제
 */
public class RoleMain {
	/*
	 * 은닉화 : 데이터는 감추고, 데이터를 주고받는 기능으로 정의한 방식.
	 * 			 * 객체의 속성과 행위를 하나로 묶고, 실제 구현 일부를 감춤.
	 * 상속 : 부모객체의 속성,기능을 이어받거나 변형해 사용하도록 확장.
	 * 		  * 새로운 클래스가 기존 클래스의 자료와 연산 이용하게 함.
	 * 추상화 : 불필요한 정보는 숨기고 중요한 정보만 표현함으로 프로그램 간단히함.
	 * 다형성 : 부모 객체에서 자식클래스들의 인스턴스를 담는 표현방식.
	 */
	public static void main(String[] args) {
		Human husband = new Husband(); // 다형성
		Human emp = new Employee();
		Human father = new Father();
		Human[] roles = {husband, emp, father}; // 배열은 하나의 객체!
		// == Human[] roles = new Human[3];    //배열은 객체. ex)int[] arr = new int[3];
		//    roles = {husband, emp, father};
		// Human h = new Human(); // 인터페이스는 생성자가 없다. 객체생성x
		
		for (int i = 0; i < roles.length; i++) {
			roles[i].role();
		}
		
	}
}
interface Human{  //추상화
	public void role();
}

class Man implements Human{
	private String name; //은닉화
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void role() {
		System.out.println("남자 역할");
	}
}

class Husband extends Man{ //상속
	@Override
	public void role() {
		System.out.println("남편 역할");
	}
	public void husbandWorry(){
		System.out.println("남편만의 고민");
	}
}

class Employee extends Man{
	@Override
	public void role() {
		System.out.println("직원 역할");
	}
	public void empWorry(){
		System.out.println("직장인의 고민");
	}
}

class Father extends Man{
	@Override
	public void role() {
		System.out.println("아버지 역할");
	}
	public void fatherWorry(){
		System.out.println("아버지의 고민");
	}
}




























