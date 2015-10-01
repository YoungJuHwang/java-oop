package rps;

import java.security.Provider.Service;

public class GameRpsServiceImpl implements GameRpsService{

	GameRps gamerps = new GameRps();
	
	@Override
	public String getResult(int result1) {
		String result = null;
		switch (result1) {
		case 1:
			result = "유저가 이김";
			break;
		case 2:
			result = "비김";
		case 0:
			result = "컴퓨터가 이김";
		default:
			break;
		}
		return result;
	}
	@Override
	public String playGame(int user, int com) {
		int result1 = 0; //1 : 유저가 이김, 0 : 컴퓨터가 이김. 2 : 비김.
		switch (user - com) {
		case -1:
			result1 = 0;
			break;
		case 2:
			
			break;
		case 1:
			result1 = 1; 
			break;
		case -2:
			result1 = 1;
		case 0:
			result1 = 2;
			default:
				break;
		}
		return "컴퓨터는";
	}

}
