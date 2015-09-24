package inheritance;

import java.util.Scanner;

public class MinusAccount extends Account{
	
	public static final String BANK_NAME = "러쉬앤캐쉬";
	private int input, output;
	private int restMoney;
	private int accountNo;
	private String ownerName;
	private String password;
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getPassword() {
		return password;
	}

	public void setAccountNo() {
		this.accountNo = (int) (Math.random() * 1000000) + 100000;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	Scanner scan = new Scanner(System.in);
	
	public int getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}

	@Override
	public void withdraw() {
		System.out.println("출금할 금액 입력(M) : ");
		output = scan.nextInt();
		if (restMoney > (output-3000000)) {
			this.restMoney -= output;
		} else {
			System.out.println("대출 한도초과 입니다.");
		}
	}
	
	public void deposit(){
		
		System.out.println("입금할 금액 입력 : ");
		int input = scan.nextInt();
		if(input < 0){
			System.out.println("다시 입력하세요");
		} else {
			this.restMoney += input;
		}
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "입출금계좌\n"+BANK_NAME+"\n"+"계좌번호 : "+this.accountNo
				+"\n"+"계좌명 : " + this.ownerName +"\n"+ "비밀번호 : *****" +"\n"+ 
		"잔액 : "+this.restMoney;
	}
	
	
}
