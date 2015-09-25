package polymorphism2;

import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
		AdminService adminService = new AdminService(); //
		Account2 account2 = new Account2(1000); // 계좌생성 가능수 설정.
		Scanner scan = new Scanner(System.in);
	
		
		while (true) {
			System.out.println("관리자 메뉴 : 1. 계좌개설 2.검색(계좌번호) 3.검색(이름) 4.계좌해지 5.총계좌수 6. 종료");
			int key = scan.nextInt();
			switch (key) {
			case 1: 
				System.out.println("계좌번호입력");
				int accountNo = scan.nextInt();
				System.out.println("이름입력 : ");
				String name = scan.next();
				System.out.println("입금액 입력 : ");
				int restMoney = scan.nextInt();
				System.out.println(adminService.openAccount(accountNo, name, restMoney));
				System.out.println(adminService.getCount());
				break;
				
			case 2: 
				
				break;
			
			case 3: 
				
				break;
				
			case 4: 
				
				break;
			case 5: 
				
				break;
			case 6:
				return;
			}
		}
		
	}
}
