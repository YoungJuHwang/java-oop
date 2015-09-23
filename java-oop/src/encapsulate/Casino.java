package encapsulate;

public class Casino {

	private int win;
	
	public Casino(Card p1, Card p2) {
		if (p1.getNumber() > p2.getNumber()) {
			 this.win = p1.getNumber();
		}else {
			this.win = p2.getNumber();
		}
	}

	public String toString() {

		return this.win + "가 더 크다";
	}
}
