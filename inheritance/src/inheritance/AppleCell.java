package inheritance;

public class AppleCell extends Cell {

	@Override
	void turnOn() {
		System.out.println("IOS 운영체제를 시작합니다.");
	}

	@Override
	void turnOff() {
		System.out.println("IOS 운영체제를 종료합니다.");
	}
	
}
