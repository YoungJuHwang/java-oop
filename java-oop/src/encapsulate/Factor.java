package encapsulate;

public class Factor {
	public int[] factor(int input){
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			if ((input % i) == 0 ) {
				count++;
			}
		}
		int[] result = new int[count];
		count = 0; //변수 재활용 및 배열 사이즈!!!!!!!!!
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				result[count] = i;
				count++;
			}
		}
		
		return result;
	}
	
}
