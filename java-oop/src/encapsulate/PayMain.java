package encapsulate;

import java.util.Scanner;

/**
 * @file_name : PayMain.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 23.
 * @story     : 세금 공제한 실급여 환산 프로그램
 */
public class PayMain {
	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력받아 
	 * [연봉 ? 를 받는 ? 님께서 납부할 세금은 ? 만원입니다.]
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정권이 바뀔 때 마다 변하니 쉽게 적용가능하게 만들어주세요.
	 * 현 정권은 세율이 9.7%입니다.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Pay p = new Pay();
		String name = null;
		int salary;
		
		System.out.println("이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.println("연봉 입력 : ");
		salary = scan.nextInt();
		
		p.setName(name);
		p.setSalary(salary);
		p.setTax(salary);
		
		
		Pay pp = new Pay(2400, "암마");
		Pay ppp = new Pay(1200,"snrn?");
		
		
		System.out.println("9월 급여 내역 ");
		System.out.println(p.toString());
		System.out.println(pp.toString());
		System.out.println(ppp.toString());
	}
}
