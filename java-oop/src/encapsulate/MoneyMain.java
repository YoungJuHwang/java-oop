package encapsulate;

import java.util.Scanner;

/**
 * @file_name : Money.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 금액 입력하면 화폐단위별로 분류.
 */
public class MoneyMain {
	public String[] countmoney(int price) {
		
		//int price = 0;
		//int []moneyUnit = new int[10];
		int []moneyUnit = {50000,10000,5000,1000,500,100,50, 10};
		int []resultmoney = new int[moneyUnit.length];
		String[] results = new String[moneyUnit.length];
		
		for (int i = 0; i < moneyUnit.length; i++) {
			resultmoney[i] = price / moneyUnit[i];
			price = price % moneyUnit[i];
			
			results[i] = moneyUnit[i] + "원 : " + resultmoney[i] + "매";
			
		}
		return results;
	}	
	
}
