package emp;

import java.util.Scanner;

import emp.service.EmployeeSrv;

public class EmployeesEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeSrv srv = new EmployeeSrv(); // 인스턴스 객체 생성
		boolean run = true;
		
		while(run) {
			srv.menu();
			System.out.println("메뉴를 선택해주세요 >> ");
			int choice = sc.nextInt();
			switch(choice) {
			 
			case 1:
				srv.empCreate();
				
				break;
				
			case 2:
				srv.empAdd();
				break;
				
			case 3:
				srv.empList();
				break;
			
			case 4:
				srv.Exit();
				System.exit(0);
				System.out.println("");
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				System.out.println("숫자 1~4를 입력해주세요");
				System.out.println("");
				continue;
			}
		}
		
	}
}
