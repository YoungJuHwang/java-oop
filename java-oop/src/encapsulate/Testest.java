package encapsulate;

public class Testest {
	public static void main(String[] args) {
		
		int num = 0;
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			num = (int) (Math.random() * 10) + 1;
			arr[i] = num;
			//System.out.println(arr[i]);
		}
		System.out.println(arr);
	}
}
