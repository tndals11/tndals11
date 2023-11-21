package inheritance;

class Add {
	String title = "계산기 프로그램";

	void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	int add(int num1, int num2) {
		return num1 + num2;
	}
}

class DeskTop extends Add { // 단일 상속
	
	void Os() {
		System.out.println("Windows Ver 11....");
	}
}

class LapTop extends Add {
	
	void Os () {
		System.out.println("IOS Ver 16...");
	}
}

public class inherEx01 {
	public static void main(String[] args) {
		DeskTop d = new DeskTop();
		System.out.println("데스크 탑 컴퓨터");
		d.turnOn();
		d.Os();
		System.out.println(d.title);
		System.out.println("결과 값은 : " + d.add( 10, 20 ));
		d.turnOff();
		System.out.println();
		
		System.out.println("==========LapTop============");
		LapTop l = new LapTop();
		l.turnOn();
		l.Os();
		System.out.println(l.title);
		System.out.println("결과 값은 : " + l.add( 20, 40 ));
		l.turnOff();
		
		
		
	}

}