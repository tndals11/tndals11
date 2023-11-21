package emp.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
	// 필드
	private Long empID;
	private String empDepart;
	private String name;
	private int empMoney;
	private LocalDate statrDate; // 시간, 날짜 = LocalDate 사용
	private LocalDate endDate;

	// 기본(파라미터가 없는) 생성자
	public Employee() {
	}

	// 파라미터가 존재하는 생성자
	public Employee(Long empID, String empDepart, String name, 
			int empMoney) {
		this.empID = empID;
		this.empDepart = empDepart;
		this.name = name;
		this.empMoney = empMoney;
		this.statrDate = statrDate;
		this.endDate = endDate;
	}

	// getter, setter => 캡슐화
	public Long getEmpID() {
		return empID;
	}

	public void setEmpID(Long empID) {
		this.empID = empID;
	}

	public String getEmpDepart() {
		return empDepart;
	}

	public void setEmpDepart(String empDepart) {
		this.empDepart = empDepart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpMoney() {
		return empMoney;
	}

	public void setEmpMoney(int empMoney) {
		this.empMoney = empMoney;
	}

	public LocalDate getStatrDate() {
		return statrDate;
	}

//	 public void setStatrDate(LocalDate statrDate) 
//		this.statrDate = statrDate;
//  } 
//	LocalDate set(입력) 내가 입력하는게 아니라 
//	자동으로 입력해줘야하기 때문에 set을 삭제해준다.
	public LocalDate getEndDate() {
		return endDate;
	}

	// 메소드
	@Override
	public String toString() {
		return "[ 사번 : " + this.empID + ", 부서 = " + this.empDepart + ", 이름 =" + this.name + ", 급여 =" + this.empMoney;
	}

}
