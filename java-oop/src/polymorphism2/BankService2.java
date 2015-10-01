package polymorphism2;

import java.util.Scanner;

public class BankService2 implements Bank2{
	Account2 account2 = new Account2();
	Scanner scan = new Scanner(System.in);

	@Override
	public String open(String name) {
		account2.setAccountNo();
		account2.setOwnerName(name);
		return account2.toString();
	}
	@Override
	public int deposit(int input) {
		if(input < 0){
			return account2.getRestMoney();
			} else {
			return account2.restMoney += input;
		}
		
	}
	@Override
	public int withdraw(int output) {
		if (output > account2.getRestMoney()) {
			return account2.getRestMoney();
		} else {
			return account2.restMoney -= output;
		}
		
	}
	@Override
	public String search() {
		return account2.toString();
	}

}
