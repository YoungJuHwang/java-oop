package abstraction;

public class Himart {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setTvInfo("LG", "TV", "lg1234", "50inch", "올레드");
		Computer computer = new Computer();
		computer.setComputerInfo("삼성", "Computer", "sm1234", "i5-z", "8G", "2TB");
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.setSmartPhoneInfo("샤오미", "smartphone", "s-1234", "1024만화소", "500g");
		Product[] cart = new Product[3];
		cart[0] = tv;
		cart[1] = computer;
		cart[2] = smartPhone;
		
		for (int i = 0; i < cart.length; i++) {
			System.out.println(cart[i].display());
		}
	}
}
