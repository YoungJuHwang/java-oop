package polymorphism2;

public interface Admin {
	
	
	public String openAccount(int accountNO, String name, int restMoney);
	
	
	public Account2 searchAccountByAccountNo(int accountNo);
	//1. 계좌번호로 그 계좌가 존재하는지 체크 후 계좌정보 호출.
		//   (계좌명, 계좌번호, 잔액)
	
	public Account2[] searchAccountByName(String name);
	//계좌명으로 계좌번호를 검색
	
	public String closeAccount(int accountNO);
	//계좌를 해지하는 기능
		//해지 요청시 그 계좌가 존재하는지 체크 후 
		//존재하면 " ---고객님 요청하신 해지건이 완료되었습니다."
		//존재x 면 " ---고객님 요청하신 계좌는 존재하지 않습니다."
	
	public int countAll();
	//전체 계좌수

}
