package encapsulate;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		//String ps = scan.nextLine();
		
		Scanner scan = new Scanner(System.in);
		Account p1 = new Account(); //통장 정보.
		
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("비번 입력 : ");
		String password = scan.next();
		
		p1.setAccountNo();
		p1.setOwnerName(name);
		System.out.println(p1.toString());
		
		
		for( ; ;){
			System.out.println("1.입금 2. 출금 3. 잔액조회 4. 종료");
			int choose = scan.nextInt();
			switch(choose){
			case 1:
				p1.deposit();
				break;
			case 2:
				p1.withdraw();
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
