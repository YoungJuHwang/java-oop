package encapsulate;

public class CardMain2 {
	/*
	 * 무늬는 하트로 동일한 상태에서 두 카드의 숫자를 비교
	 * 더 높은 수의 카드가 이기는 게임.
	 * 1 ~ 10 정수 난수 구하기?
	 * int n = (int) (Math.random() * 10) + 1;
	 */
	public static void main(String[] args) {
		
		/*
		 * 클래스 객체 = new 생성자(인자);
		 * 카지노 생성자 인자로 카드 객체 두개를 집어넣어라.
		 * 카지노 생성자에서 카드 객체 두개의 숫자를 비교해서
		 * 위너, 루저 인스턴스 변수에 할당하고
		 * toString으로 출력해라.
		 */
		Card2 p1 = new Card2();
		Card2 p2 = new Card2();
		Casino2 cp = new Casino2(p1, p2);
		System.out.println(p1.getNum());
		System.out.println(p2.getNum());
		System.out.println(cp.toString());
		
		
	}
}
