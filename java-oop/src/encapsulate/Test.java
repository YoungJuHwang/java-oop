package encapsulate;

import java.util.Scanner;

import bean.CountMoney;

public class Test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액 입력 : ");
		int price = scan.nextInt();
		
		CountMoney m = new CountMoney(); //같은 패키지 내 money의 참조변수 선언 후 m에 저장.
		String[] result = m.countmoney(price); //파라미터 = 매개변수 와 return
		//즉 return 받은 results 값을 
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		 
	}
}
