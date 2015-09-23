package encapsulate;
/**
 * @file_name : Kaup.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 23.
 * @story     : 인스턴스 변수
 */
public class Kaup {

	private String name; // 메소드들이 공통으로 가져가서 사용하는 변수.
	private double cm;   //
	private double kg;	 //private 변수선언은 무조건 getter,setter 필요함.
	private String result;
	
	//alt + shift + s !!!!!!!!!!!!!!!!!!!!!
	public void setResult() {
		int idx = 0;
		idx = (int)((kg / (cm * cm)) * 10000);
		
		if (idx >=30) {
			result = "비만";
		}
		else if(idx >= 24){
			result = "과체중";
		}
		else if (idx >= 20) {
			result = "정상";
		}
		else if (idx >= 15) {
			result = "저체중";
		}
		else if (idx>= 13) {
			result = "마름";
		}
		else if (idx >= 10) {
			result = "영양실조";
		}
		else {
			result = "소모증";
		}
		this.result = result;
	}
	public String getResult() {
		
		return result;
	}

	public String getName() {
		return name;
	}

	public double getCm() {
		return cm;
	}

	public double getKg() {
		return kg;
	}

	public void setName(String foo) {
		name = foo; //메인에서 입력받아 밤색name의 값을 this.name에 저장
						  //즉. 같은 클래스 내에 메소드들이 같이 쓰기 위함. 
	}	//자기 영역에 같은 이름이 있으면 먼저 가져다 쓰지만 
		//없으면 메소드 밖에서 찾아서 성격마저 바꿈.

	public void setCm(double cm) {
		this.cm = cm;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	
	@Override
	public String toString() {
		return this.getName() + "님께서는"+this.getResult()+"입니다.";
	}
	
	
	
	
	
	
	
	
	
	
	
}