package abstraction;
/**
 * @file_name : Product.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 10. 1.
 * @story     : 제품을 추상클래스로 만든 예제
 */
public abstract class Product {
	protected String company;
	//public final int A = 0;					//상수는 모두가 알 수 있게 public으로 선언.
	protected String name;
	protected String serialNo;
	
	public void setProductInfo(String company, String name, String serialNo){ //구상메소드 concrete 
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
	public abstract String display(); // 추상메소드(메소드바디가 없다.) 
	
}
