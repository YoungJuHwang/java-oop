package encapsulate;

import java.util.Scanner;

/**
 * @file_name : CardMain.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 23.
 * @story     : 트럼프 게임
 */
public class CardMain {
	/*
	 * 무늬는 하트로 동일한 상태에서 두 카드의 숫자를 비교
	 * 더 높은 수의 카드가 이기는 게임.
	 * 1 ~ 10 정수 난수 구하기?
	 * int n = (int) (Math.random() * 10) + 1;
	 */
	public static void main(String[] args) {
		
		Card p1 = new Card();
		Card p2 = new Card();
		Casino casino = new Casino(p1,p2);
		
		System.out.println(p1.getNumber());
		System.out.println(p2.getNumber());
		System.out.println(casino.toString());
		
		
	}
}
