package encapsulate;

public class Card {
	private String kind; //카드무늬
	private int number;  //카드숫자
	static int WITDTH = 100; //카드 너비
	static int HEIGHT = 180; //카드 높이
	
	public Card() {
		this.kind = "하트";
		this.number = (int) ((Math.random() * 10) + 1);
	}
	/*public String getKind() {
		return kind;
	}
	public void setKind() {
		this.kind = "하트";
	}*/
	public int getNumber() {
		return number;
	}
	public void setNumber() {
		this.number = (int) ((Math.random() * 10) + 1);
	}
	
}
