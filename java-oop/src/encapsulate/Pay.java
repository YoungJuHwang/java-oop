package encapsulate;

public class Pay {
	final double TAX_RATE = 0.097;
	private int salary;
	private String name;
	private int tax;
	//alt + shift + s
	//멤머 메소드
	
	public Pay() {
		// TODO Auto-generated constructor stub
	}
	public Pay(int salary, String name){
		this.name = name;
		this.salary = salary;
		this.tax = (int) (salary * TAX_RATE);
		
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int input) {
		this.tax = (int) (input * TAX_RATE);
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "연봉 " + this.salary +"만원을 받는 " + this.name + "님께서 납부할 세금은" + this.tax + "만원 입니다";
	}
}
