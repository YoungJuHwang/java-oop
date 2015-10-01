package polymorphism2;

import java.util.Scanner;

public class Account2 {
	
	public static final String BANK_NAME = "한빛은행";
	protected int accountNo;
	protected String ownerName;
	private String password;
	protected int restMoney;
	
	Scanner scan = new Scanner(System.in);
	
	public Account2(){
		this(0,"");
	}
	public Account2(int a){
		
	}
	public Account2(int a, String b){
		
	}
	
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
		this.accountNo = (int) (Math.random() * 999999) + 100000;
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
	
	public String toString() {
		// TODO Auto-generated method stub
		return "입출금계좌\n"+BANK_NAME+"\n"+"계좌번호 : "+ this.accountNo
				+"\n"+"계좌명 : " + this.ownerName +"\n"+ "비밀번호 : *****" +"\n"+ 
		"잔액 : "+this.restMoney + "\n";
	}
}
