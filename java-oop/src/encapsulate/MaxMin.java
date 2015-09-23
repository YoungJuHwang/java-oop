package encapsulate;

/**
 * @file_name : MaxMin.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 최고점, 최저점 구하기. + 오름차순 정리.
 */
public class MaxMin {
	public int[] maxmin(int score[]){
		
		int max=0, min=1000;
		int temp=0;
		
		for(int j = 0; j < score.length-1;j++){
			for (int i = 0; i < score.length-1; i++) {
				if (score[i] > score[i+1]) {
				temp = score[i];
				score[i] = score[i+1];
				score[i+1] = temp;
				}
			}
		}
		/*int []results = new int[2];
		for (int i = 0; i < score.length; i++) {
			
			if(max < score[i]){
				max = score[i];
			}if(min > score[i]) {
				min = score[i];
			}
		}
		
		results[0] = max;
		results[1] = min;
		*/
		return score;
		
	}
	
	
}
