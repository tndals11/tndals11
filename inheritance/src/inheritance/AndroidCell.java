package inheritance;

public class AndroidCell extends Cell {

	@Override
	void turnOn() {
		System.out.println("안드로이드 운영체제를 시작합니다.");
	}

	@Override
	void turnOff() {
		System.out.println("안드로이드 운영체제를 종료합니다.");
	}
	
}
