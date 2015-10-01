package rps;

public class GameRps {
	int rock, paper, scissors; //바위, 보, 가위
	String rpsVal; // 숫자와 대응되는 값.
	int comVal;
	
	public int getComVal() {
		return comVal;
	}
	public void setComVal() {
		this.comVal = (int) (Math.random()*3+1);
	}
	public int getRock() {
		return rock;
	}
	public int getPaper() {
		return paper;
	}
	public int getScissors() {
		return scissors;
	}
	public String getRpsVal() {
		return rpsVal;
	}
	public void setRock(int rock) {
		this.rock = rock;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	public void setScissors(int scissors) {
		this.scissors = scissors;
	}
	public void setRpsVal(int val) {
		switch (val) {
		case 1: rpsVal = "가위"; break;
		case 2: rpsVal = "바위"; break;
		case 3: rpsVal = "보자기"; break;

		default:
			break;
		}
	}
	
}
