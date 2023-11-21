package test;

public class Test6 {
	public static void main(String[] args) {
		String jumin = "001234-4234567";
		
		String gender = jumin.substring(7, 8);
		
		
		if (gender.equals("1") || gender.equals("3")) {
			System.out.println("남자");
		} else if (gender.equals("2") || gender.equals("4")) {
			System.out.println("여자");
		} else {
			System.out.println("주민번호 8번째 자리가 틀립니다.\n(1,3)남자, (2,4)여자입니다");
		}
	}
}
