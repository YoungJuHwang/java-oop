package encapsulate;

import java.util.Scanner;

/**
 * @file_name : FactorMain.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 약수 알고리즘
 */
public class FactorMain {
	public static void main(String[] args) {
		
		System.out.println("약수 구하고 싶은 수를 입력");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		Factor p = new Factor();
		int[] results = p.factor(input);
		
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
		}
}
