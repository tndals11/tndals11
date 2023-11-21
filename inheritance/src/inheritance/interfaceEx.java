package inheritance;

interface Boot {
	void powerOn();

	void powerOff();

}

interface OS {
	void msOS();

	void appleOS();
}

class Mac implements Boot, OS {

	@Override
	public void powerOn() {
		System.out.println("컴퓨터를 시작합니다");
	}

	@Override
	public void powerOff() {
		System.out.println("컴퓨터를 종료합니다");
	}

	@Override
	public void msOS() {
	}

	@Override
	public void appleOS() {
		System.out.println("애플 운영체제 시작");
	}

}

public class interfaceEx {

	public static void main(String[] args) {
		// 부팅, 운영체제 따로 만들어서 다중 상속으로 처리
		// abstract : 상속 -> 오버라이드

		// interface -> implements : 상속을 -> 구현한다
		
		Mac m = new Mac();
		m.powerOn();
		m.appleOS();
		m.powerOff();
	
	}

}
