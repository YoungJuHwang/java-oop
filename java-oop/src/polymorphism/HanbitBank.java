package polymorphism;

import java.util.Scanner;

public class HanbitBank {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Account p1 = new Account();
		
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
		
	}
}
