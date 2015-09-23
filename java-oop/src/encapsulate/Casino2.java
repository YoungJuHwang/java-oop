package encapsulate;

public class Casino2 {

	private int win;
	public Casino2(Card2 p1, Card2 p2) {
		if (p1.getNum() > p2.getNum()) {
			win = p1.getNum();
		}
		else {
			win = p2.getNum();
		}
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return win + "가 이김" ;
	}
	
	
}
