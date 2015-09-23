package encapsulate;

public class Card2 {
	
	private int num;

	public Card2() {
		this.num = (int) (Math.random() * 10) + 1;
	}
	public int getNum() {
		return this.num;
	}
	public void setNum() {
		this.num = (int) (Math.random() * 10) + 1;
	} //프레임워크... 대형 프로잭트에선 규격을 지님. 쓸모없는 부분도
	  //용량을 잡아먹음 
	
}
