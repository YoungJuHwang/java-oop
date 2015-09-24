package polymorphism3.copy;

import java.util.Scanner;

public class HanbitBank2 {
	public static void main(String[] args) {
		BankService2 service = new BankService2();
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
				service.account.setAccountNo();
				service.account.setOwnerName(name);
				System.out.println(service.account);
				service.open(); break;
			case 2: service.deposit(); break;
			case 3: service.withdraw(); break;
			case 4: service.search(); break;
			case 5: return;
			default:
				break;
			}
		}
	}
}
