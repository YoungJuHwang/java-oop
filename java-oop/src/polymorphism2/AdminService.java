package polymorphism2;

public class AdminService implements Admin{
	private Account2[] accountList;
	private int count;
	
	public AdminService() {
		this(0);
	}
	
	public AdminService(int count) {
		accountList = new Account2[1000]; // 개설가능 계좌수 정함.
	}
	
	
	public Account2[] getAccountList() {
		return accountList;
	}

	public int getCount() {
		return count; // 계좌개설 숫자.
	}

	public void setAccountList(Account2[] accountList) {
		this.accountList = accountList;
	}

	public void setCount(int count) {
		this.count = count;
	}

	//계좌총갯수 구하기 위해서 각 사용자들의 계좌정보담는 배열 필요
	@Override
	public String openAccount(int accountNO, String name, int restMoney) {
		Account2 account2 = new Account2();
		String msg = "";
		account2.setAccountNo();
		account2.setOwnerName(name);
		account2.setRestMoney(restMoney);
		accountList[count] = account2;
		count++; // 계좌개설 숫자.
		msg = account2.toString();
		return msg; //나중에 36~4? 날리고 리턴에 한번에 정리 가능
	}
	
	@Override
	public Account2 searchAccountByAccountNo(int accountNo) {  //계좌번호(아이디)로 계좌찾기
		Account2 searchAccount = null;
		for (int i = 0; i < this.getCount(); i++) {
			/*if ( ) {
				searchAccount = accountList[i];
			}*/
		}

		return searchAccount;
	}

	@Override
	public Account2[] searchAccountByName(String name) {
		int tempCount = searchCountByName(name);
		if (tempCount == 0) {
			return null;
		}
		Account2[] tempList = new Account2[tempCount];
		tempCount = 0;
		for (int i = 0; i < tempList.length; i++) {
			//완성해야함
			tempCount++;
		}
		return tempList;
	}

	private int searchCountByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

}
