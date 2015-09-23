package encapsulate;

import java.util.Scanner;

/**
 * @file_name : Kaup.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 23.
 * @story     : 카우프지수
 */
public class KaupMain {
	/*
	 * To. 개발자님
	 * 사람의 이름을 입력하고, 몸무게 키를 입력하면
	 * 해당 사람의 상태가 비만인지 저체중인지 알려주는
	 * 카우프 프로그램을 만들어주세요.
	 * 카우프 지수 구하는 공식은 키의 제곱을 몸무게로 나눈 후
	 * 10000을 곱한 인덱스값입니다.
	 * 
	 * 그 인덱스결과가 30이상이면 비만
	 * 24이상이면 과체중, 20이상이면 정상
	 * 15이상이면 저체중, 13이상이면 마름
	 * 10이상이면 영양실조, 그 미만이면 소모증 이랍니다.
	 */
	public static void main(String[] args) {
		
		Kaup instance = new Kaup();  //instance : 참조변수.
		Scanner scan = new Scanner(System.in);
		String name = "";  //지역변수
		double kg, cm = 0.0;
		//-----------값을 입력-----------------
		System.out.println("사람의 이름 입력 : ");
		name = scan.next();
		System.out.println("몸무게 입력(kg) : ");
		kg = scan.nextDouble();
		System.out.println("키 입력(cm) : ");
		cm = scan.nextDouble();
		//-------------연산(알고리즘)--------------
		instance.setName(name); //set은 택배아저씨.
		instance.setCm(cm);		//get은 받는사람.
		instance.setKg(kg);
		instance.setResult();
		
		//-------------값을 출력-------------------
		//System.out.println(instance.getName() + "님은 " + result + "입니다.");
		// 이제 이걸 바꿈.
		System.out.println(instance.toString());
	}
}
