package abstraction;

import java.util.zip.CRC32;

public class TV extends Product{

	protected String size;
	protected String screen;
	
	public void setTvInfo(String company, String name,
			String serialNo, String size, String screen) {
		
		this.size = size;
		this.screen = screen;
		super.setProductInfo(company, name, serialNo);
	}
	
	@Override
	public String display() {
		
		return "제조회사 : "+super.company+" \n "
				+ "제품명 : "+super.name+" \n "
				+ "고유번호 : "+super.serialNo+" \n "
				+ "인치 : "+this.size+"\n "
				+ "화면 : "+this.screen;
	}

}
