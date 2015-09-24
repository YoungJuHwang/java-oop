package polymorphism2;

import java.util.Scanner;

public class HanbitBank2 {
	public static void main(String[] args) {
		BankService2 service2 = new BankService2();
		Scanner scan = new Scanner(System.in);
		System.out.println("입금액을 입력해 주세요");
		
		while (true) {
			System.out.println("동작선택 : 1.개설 2.입금 3.출금 4.조회 5.종료");
			int key = scan.nextInt();
			switch (key) {
			case 1: 
				System.out.println("이름 입력 : ");
				String name = scan.next();
				System.out.println("비번 입력 : ");
				String password = scan.next();
				System.out.println(service2.open(name)); break;
				
			case 2: 
				System.out.println("입금할 금액 입력 : ");
				int input = scan.nextInt();
				System.out.println("잔액 : " +service2.deposit(input)); break;
			
			case 3: 
				System.out.println("출금할 금액 입력 : ");
				int output = scan.nextInt();
				System.out.println("잔액 : " +service2.withdraw(output)); break;
				//service2.withdraw(); break;
				
			case 4: 
				String abc = null;
				System.out.println(service2.search()); break;
			
			case 5: return;
			default:
				break;
			}
		}
	}
}
