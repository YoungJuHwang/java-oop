package polymorphism2;

import java.security.acl.Acl;

public class AdminService implements Admin{
	private Account2[] accountList;
	private int count;
	private int tempCount;
	
	public int getTempCount() {
		return tempCount;
	}

	public void setTempCount(int tempCount) {
		this.tempCount = tempCount;
	}

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
	public String openAccount(String name, int restMoney) {
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
			if (accountList[i].getAccountNo() == accountNo ) {
				searchAccount = accountList[i];
			}
		}

		return searchAccount;
	}

	@Override
	public Account2[] searchAccountByName(String name) {
		int tempCount = searchCountByName(name); //계좌개설한 사람들 수.
		//System.out.println(tempCount);
		if (tempCount == 0) {
			return null;
		}
		Account2[] tempList = new Account2[tempCount];
		tempCount = 0;
		for (int i = 0; i < count; i++) {
			
			if (name.equals(accountList[i].getOwnerName())) {
				tempList[tempCount] = accountList[i];
				tempCount++;
			}
				
			//tempList에 accountList에 있는 계좌들의 이름을 입력.
		}
		for (int i = 0; i < tempCount; i++) {
			//System.out.println(accountList[i]);
			System.out.println(tempList[i]);
		} // for출력문을 메인으로 빼내야함..
		
		return tempList;
	}

	private int searchCountByName(String name) { //동명이인 갯수 알아내기.
		int tempCount1 = 0;
		for (int i = 0; i < count; i++) {
			//System.out.print("계설된 계좌aaaa : "+accountList[i]+"\n");
			if (name.equals(accountList[i].getOwnerName())) {
				tempCount1++;
			}
		}
		//System.out.println(tempCount1); //총 고객에서 같은 이름 수.
		return tempCount1;
	}

	@Override
	public String closeAccount(int accountNo) {
		
		searchAccountByAccountNo(accountNo);
		
		
		return null;
		
		/*for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNo() == accountNo) {
				accountList[i] = accountList[count];
			}
			else{
				
			}
		}
		accountList[count-1] = null;
		count--;
		
		
		return "요청한 계좌는 없습니다.";*/
	}

	

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

}
