package list03;

public class Member {
	// 필드 선언
	private int ID;
	private String name;
	
	// 파라미터가 있는 생성자
	public Member(int iD, String name) {
		ID = iD;
		this.name = name;
	}
	
	// getter, setter
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 메소드
	@Override
	public String toString() {
		return "멤버 [아이디 = " + ID + ", 이름 = " + name + "]";
	}
}
