package emp.service;

import java.util.Scanner;

import emp.vo.Employee;

public class EmployeeSrv {
	Scanner sc = new Scanner(System.in);
	Employee[] emp = null; // 모든곳에서 쓰기위해 전역변수로 선언을 해주어야한다
	
	public EmployeeSrv() {
	}

	public void menu() {
		// 1.사원추가(create)| 2.사원등록(add)| 3.사원목록|(list) 4. 종료
		System.out.println("=========== Welcome To Employees System ==========");
		System.out.println("1.사원추가| 2.사원등록| 3.사원목록| 4.Exit");
		System.out.println("==================================================");
	}

	public void empCreate() {
			System.out.println("사원 추가 페이지");
			System.out.println("추가할 사원 수 >>");
			int count = sc.nextInt();
			emp = new Employee[count]; // 스캐너로 값을 입력받아 배열을 생성
			System.out.println(emp.length + "명의 사원을 추가할 수 있습니다.");
		}

	public void empAdd() {
		System.out.println("사원 등록 페이지");
		System.out.println(emp.length + "명의 사원을 등록할 수 있습니다.");
		for(int i = 0; i < emp.length; i++) {
			// 배열에 선언과 초기화를 동시에 Scanner로 입력해 값을 담아준다
			emp[i] = new Employee(sc.nextLong(),sc.next(), sc.next(), sc.nextInt());
		}
		System.out.println("사원이 등록되었습니다.");
	}
	
	public void empList() {
		System.out.println("사원 목록 페이지");
		System.out.println("사원 목록을 출력합니다.");
		
		for(Employee person : emp) { // Employee에 데이터 타입이 모두 들어 있으므로 
			System.out.println(person);
			System.out.println("-----------------------------------");
		}
	}

	public void Exit() {
		System.out.println("시스템을 종료합니다.");
	}

}
