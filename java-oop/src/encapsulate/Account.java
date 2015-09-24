package encapsulate;

import java.util.Scanner;

public class Account {
	
	public static final String BANK_NAME = "한빛은행";
	private int accountNo;
	private String ownerName;
	private String password;
	private int restMoney;
	
	Scanner scan = new Scanner(System.in);
	
	public int getAccountNo() {
		return this.accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getPassword() {
		return password;
	}
	public int getRestMoney() {
		return restMoney;
	}
	public void setAccountNo() {
		this.accountNo = (int) (Math.random() * 1000000) + 100000;
	}
	public void setOwnerName(String name) {
		
		this.ownerName = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}
	
	public void deposit(){
		
		System.out.println("입금할 금액 입력 : ");
		int input = scan.nextInt();
		if(input < 0){
			System.out.println("다시 입력하세요");
			this.restMoney += input;
			System.out.println(this.toString());
		} else {
			this.restMoney += input;
			System.out.println(this.toString());
		}
	}
	
	public void withdraw(){
		
		System.out.println("출금할 금액 입력 : ");
		int output = scan.nextInt();
		if (restMoney > output) {
			this.restMoney -= output;
			System.out.println(this.toString());
		} else {
			System.out.println("잔액이 부족합니다.");
		}

	}
	public String toString() {
		// TODO Auto-generated method stub
		return "입출금계좌\n"+BANK_NAME+"\n"+"계좌번호 : "+this.accountNo
				+"\n"+"계좌명 : " + this.ownerName +"\n"+ "비밀번호 : *****" +"\n"+ 
		"잔액 : "+this.restMoney;
	}
}
