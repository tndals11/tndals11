package test;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
			System.out.println("학년(1 ~ 4)을 입력해주세요 >> ");
			int student = sc.nextInt();

			System.out.println("점수를 입력해주세요 >> ");
			int num = sc.nextInt();
			
			if( student <= 3 && num >= 60 ) {
				System.out.println("합격입니다.");
			} else if (student == 4 && num >= 80)  {
				System.out.println("졸업입니다.");
			} else if (student == 4 && num < 80) {
				System.out.println("재시험입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}
	}


