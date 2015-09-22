package encapsulate;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 최고점, 최저점 구하기. + 오름차순 정리.
 */
public class MaxMinMain {
	public static void main(String[] args) {
		System.out.println("학생들 점수 입력시 최고점, 최저점 출력됩니다.");
		System.out.println("정원 수 입력.");
		
		Scanner scan = new Scanner(System.in);
		int as = scan.nextInt();
		int[] score = new int[as];
		System.out.println("학생들 수 입력 : ");
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		MaxMin m = new MaxMin(); //변수 m에 MaxMin의 참조변수 정보 존재.
		int[] results = m.maxmin(score);
		
		
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
		//int[] results = m.maxmin(score);
	}
}
