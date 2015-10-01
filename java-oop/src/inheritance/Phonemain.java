package inheritance;

import java.util.Scanner;

import polymorphism2.Admin;

/**
 * @file_name : Phonemain.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 30.
 * @story     : 상속예제
 */
public class Phonemain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //인스턴스 => 참조변수
		
		Phone androidPhone = new AndroidPhone();
		System.out.println("구매할 사이즈 선택 ");
		String size = scan.next();
		System.out.println("안드로이드폰으로 통화할 사람 : ");
		String name2 = scan.next();
		System.out.println("보낼 메시지 입력 : ");
		String msg2 = scan.next();
		((AndroidPhone) androidPhone).setData(msg2, name2, size);
		System.out.println(((AndroidPhone) androidPhone).getData());
		
		System.out.println("==============================");
		Phone iphone = new Iphone();
		System.out.println("아이폰으로 통화할 사람");
		String name = scan.nextLine();
		System.out.println("보낼 메시지 입력 : ");
		String msg = scan.next();
		((Iphone) iphone).setData(msg, name);
		System.out.println(((AndroidPhone) iphone).getData());
		
		System.out.println("==============================");
		Phone celphone = new Celphone();
		celphone.setCompany("노키아");
		System.out.println(celphone.getCompany() + "를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람 : ");
		celphone.setCall(scan.next());
		
		System.out.println("==============================");
		
		
		Phone phone = new Phone(); //타입 인스턴스(객체) = new 생성자.
		phone.setCompany("삼성 집전화기");
		System.out.println(phone.getCompany() + "를 사용합니다.");	
		System.out.println("통화할 사람 : ");
		phone.setCall(scan.next());
		System.out.println(phone.getCall());
		
	}
}

class AndroidPhone extends Iphone{
	public static String BRAND = "안드로이드폰"; //오버라이딩.
	private String size;
	private String data;
	
	@Override
	public String getData() {
		return data;
	}
	public void setData(String data, String name, String size) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.setSize(size);
		this.data = super.getCompany()+"\t"
					+super.isPortable()+"\t"
					+super.getCall()+"\t"
					+"대화명"+this.getSize()+"로 볼수있음\t"
					+data+" : 카톡메세지전달";
		
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
}

class Iphone extends Celphone{
	private String data; //인스턴스 변수
	public final static String BRAND = "아이폰";//static은 고정. 클래스변수
	public static boolean TRUE = true;
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	public void setData(String data, String name) { 
		super.setCompany(BRAND); //무조건 아이폰 브랜드만 만듬.
		super.setPortable(TRUE); //무조건 휴대전화만 만듬.
		super.setCall(name);
		this.data = super.getCompany()+"\t"
					+super.isPortable()+"\t"
				    +super.getCall()+"\t"
					+data+" : 메시지 전달";
	}
	
}


class Phone{
	private String company, call; //인스턴스 변수 => heap영역
	final static double TAX_RATE = 0.095;//스태틱 변수 (전역변수) => 스태틱영역 : 전 클래스(프로잭트)가 공유하는 값. 
									// 여기다 두는 이유는 둘데 없음. 메인에 두면 에러.
	public String getCompany() {
		return company;
	}

	public String getCall() {
		return call;
	}

	public void setCompany(String company) {
		this.company = company; //밤색은 지역변수(메소드 변수) => 스택영역
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
	
}
class Celphone extends Phone{ //extends를 하면 Celphoen은 빈공간이여도
							  //Phone의 역할을 다 가진다.
	private boolean portable; // 이동성 유무 판단.
	private String move;
	
	
	public boolean isPortable() {
		return portable;
	}
	public String getMove() {
		return move;
	}
	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
		
		this.portable = portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	
	
	
}
