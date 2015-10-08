package inheritance;

import java.util.Scanner;

public class HanbitBank {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Account p1 = new Account();
		MinusAccount maccount = new MinusAccount();
		
		System.out.println("1. 한빛은행 2. 러쉬앤캐쉬");
		int bank = scan.nextInt();
		switch (bank) {
		case 1: //한빛은행(Account)
			System.out.println("이름 입력 : ");
			String name = scan.next();
			System.out.println("비번 입력 : ");
			String password = scan.next();
			
			p1.setAccountNo();
			p1.setOwnerName(name);
			System.out.println(p1.toString());
			
			for( ; ;){
				System.out.println("1.입금 2. 출금 3. 계좌조회 4. 종료");
				int choose = scan.nextInt();
				switch(choose){
				case 1:
					p1.deposit();
					System.out.println("잔액 : "+p1.getRestMoney());
					break;
				case 2:
					p1.withdraw();
					System.out.println("잔액 : "+p1.getRestMoney());
					break;
				case 3:
					System.out.println(p1.toString());
					break;
				case 4:
					return;
				}
			}
		case 2: //러쉬앤캐쉬(MinusAccount)
			System.out.println("이름 입력 : ");
			String name1 = scan.next();
			System.out.println("비번 입력 : ");
			String password1 = scan.next();
			
			maccount.setAccountNo();
			maccount.setOwnerName(name1);
			System.out.println(maccount.toString());
			
			for( ; ;){
				System.out.println("1.입금 2. 출금 3. 계좌조회 4. 종료");
				int choose = scan.nextInt();
				switch(choose){
				case 1:
					maccount.deposit();
					System.out.println("잔액 : " + maccount.getRestMoney());
					break;
				case 2:
					maccount.withdraw();
					System.out.println("잔액 : " + maccount.getRestMoney());
					break;
				case 3:
					System.out.println(p1.toString());
					break;
				case 4:
					return;
				}
			}
		default:
			return;
		}
		
	}
}
