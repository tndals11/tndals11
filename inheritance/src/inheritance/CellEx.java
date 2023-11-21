package inheritance;

public class CellEx {

	public static void main(String[] args) {
			AndroidCell ad = new AndroidCell();
			ad.turnOn();
			ad.turnOff();
			
			System.out.println("===========================");
			
			AppleCell ac = new AppleCell();
			ac.turnOn();
			ac.turnOff();
			
		
	}

}
