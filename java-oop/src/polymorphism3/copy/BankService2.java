package polymorphism3.copy;

import java.util.Scanner;

public class BankService2 implements Bank2{
	Account2 account = new Account2();
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void open() {
		//System.out.println("이름 입력 : ");
		//String name = scan.next();
		//System.out.println("비번 입력 : ");
		//String password = scan.next();
		
		//account.setAccountNo();
		//account.setOwnerName(name);
		//System.out.println(account.toString());
	}
	@Override
	public void deposit() {
		account.deposit();
		System.out.println("잔액 : "+account.getRestMoney());
		
	}
	@Override
	public void withdraw() {
		account.withdraw();
		System.out.println("잔액 : "+account.getRestMoney());
	}
	@Override
	public void search() {
		System.out.println(account.toString());
	}

}
