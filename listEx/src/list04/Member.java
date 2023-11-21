package list04;

public class Member {
	// 필드
	private String userID;
	private String userPW;
	
	public Member() {} // 디폴트 생성자
	
	public Member(String userID, String userPW) { // 파라미터가 존재하는 생성자
		this.userID = userID;
		this.userPW = userPW;
	}
	
	// getter,setter
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	
	// 출력 메소드
	public void disp() { 
		System.out.println("아이디 : " + userID  + " 비밀번호 : " + userPW);
	}
	
	
	
	
	
}
