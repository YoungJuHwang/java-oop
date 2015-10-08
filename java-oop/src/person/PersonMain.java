package person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("조회할 주민번호 입력 : ");
		
		Person p1 = new Person("800101-1234567"); //default 생성자. 인자값 같게 해야함.
		Person p2 = new Person(scan.next());
		//p1 과 p2는 서로 다른 주소
		//p1.getSsn()과 p2.getSsn()은 같은 주소
		String s1 = new String("800101-1234567");
		String s2 = new String("800101-1234567");
		
		Test t = new Test("800101-1234567");
		if (p1.getSsn() == (t.getSsn())) {
			System.out.println("상수풀 주소를 참조하는군");
		} else {
			System.out.println("모든 게 구라");
		}
		
		if (p1.equals(p2)) {
			System.out.println("같은 클래스 객체입니다.");
		} else {
			System.out.println("다른 클래스 객체입니다.");
		}
		if (p1.equals(t)) {
			System.out.println("같은 클래스 객체입니다.");
		} else {
			System.out.println("다은 클래스 객체입니다.");
		}
		/*
		 * p1과 p2가 동일인물인지 체크하는 로직 완성
		 * 삼항연산자로 처리.
		 * 현재 2015년
		 * 현재 p1의 나이는 몇살입니까?
		 * [결과물]
		 * p1과 p2는 동일인물이며, 나이는 **살 입니다.
		 * 
		 */
		
		int year = 0, result = 0;
		switch (p2.getSsn().charAt(7)) {
		case '1': case '2':
			year = 1900;
			break;
		case '3': case '4':
			year = 2000;
			break;
		default:
			break;
		}
		Date today = new Date();
		SimpleDateFormat asd = new SimpleDateFormat("yyyy");

		result = Integer.parseInt(asd.format(today)) - (Integer.parseInt(p2.getSsn().substring(0, 2)) + year);
		System.out.println(p1.getSsn().equals(p2.getSsn()) ? "p1과 p2는 동일"
				+ "나이는"+ result : "p1과 p2는 동일인물이 아님"+result);
		
		
	}
	
}

class Person{
	private String ssn; //주민번호
	private String age; //나이
	private String name; 
	
	public Person(String ssn) { //태어나자마자 주민번호 부여받음
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}
	public String getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			return true;
		} else {
			return false;
		}
		
	}
}
class Test{
	private String ssn;
	public Test(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
}

