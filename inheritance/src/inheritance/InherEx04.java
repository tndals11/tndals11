package inheritance;

public class InherEx04 {

	public static void main(String[] args) {
		// 생성자를 이용해서 만들기 모델, 색상을 저장 후 출력
		
		Phone p = new Phone("KT", "Black");
		p.disp();
		p.turnOn();
		p.turnOff();
		
		System.out.println("------------------------");
		// Android.java
		// modelm color, company -> 생성자
		
		
		Android ad = new Android("삼성", "갤럭시"
				+ "" , "Sliver");
		ad.disp();
		
	}

}
