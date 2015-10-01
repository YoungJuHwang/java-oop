package rps;

import java.util.Scanner;

public class GameRpsMain {
	/*
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위바위보 게임을 시작합니다");
		GameRpsService service = new GameRpsServiceImpl(); //깊은 복사(deep copy)
		GameRps gameRps = new GameRps();
		
		while (true) {
			System.out.println("1.가위 2.바위 3.보");
			int userVal = scan.nextInt();
			
			//System.out.println(service.playGame(userVal));
			//System.out.println(service.getResult(userVal));
			
			gameRps.setComVal(); //컴터 랜덤 발생.
			gameRps.setRpsVal(gameRps.comVal); //랜덤수에 따른 가위바위보대응.
			//System.out.println("컴퓨터 : " + gameRps.rpsVal);
			//gameRps.setRpsVal(userVal);
			
			service.playGame(userVal, gameRps.getComVal());
			
		}
	}
}
