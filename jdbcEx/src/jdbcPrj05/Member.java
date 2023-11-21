package jdbcPrj05;

public class Member {
	private int id;
	private String email;
	private String passwd;
	private String name;
	private String depart;
	private String postion;
	private int salary;
	private String startDate;
	private String endDate;

	public Member() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
//		if ( passwd.length() > 12 || passwd.length() < 9) {
//			System.out.println("비밀번호가 너무 짧거나 깁니다.\n다시 확인해주세요");
//			this.passwd = "";
//		}
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary < 100000) {
			this.salary = 100000;
		} else {
			this.salary = salary;
		}
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) { // 예외처리
		
			this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "[아이디 =" + id + ", " + "이메일 =" + email + ", " + "비밀번호 =" + passwd + ", " + "이름 =" + name + ", " + "부서 ="
				+ depart + ", " + "직급 =" + postion + ", " + "급여 =" + salary + ", " + "입사일 =" + startDate + ", "
				+ "퇴사일 =" + endDate + "]";
	}

}
