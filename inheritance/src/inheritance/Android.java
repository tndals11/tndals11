package inheritance;

public class Android extends Phone {
	String company;
	
	public Android() {}
	
	public Android (String company, String model, String color) {
		super(model, color); // 부모에게 상속받은 메개변수를 사용
		
		this.company = company; // this 현재 페이지 
	}
	
	void disp() {
		System.out.println("회사명 : "+ company + " 모델 : " + model + " 색상 : " + color);
		
	}
	
	
}
