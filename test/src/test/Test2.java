package test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while (true) {
			System.out.println("A(a).입력 |  Q(q).종료");
			System.out.println("선택 >> ");
			char ch = sc.next().charAt(0);
			
			
			if( ch == 'a' || ch == 'A') {
				System.out.println("영어입력(띄어쓰기 없이) > ");
				String str = sc.next();
				System.out.println(str.toUpperCase());
			} else if (ch == 'q' || ch == 'Q') {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}
		
		
		
	
		
	}
}
