package polymorphism2;

public interface Bank2 {
	//1. 개설
	public String open(String name);
	//2. 입금
	public int deposit(int input);
	//3. 출금
	public int withdraw(int output);
	//4. 조회
	public String search();
}
