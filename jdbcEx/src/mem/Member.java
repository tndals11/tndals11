package mem;

public class Member {
	private int userNum;
	private String userID;
	private String userPW;
	private String userDate;
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
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
	public String getUserDate() {
		return userDate;
	}
	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	
	@Override
	public String toString() {
		return "회원정보 [회원번호 =" + userNum + ", 회원 아이디 =" + userID + ", 회원 비밀번호 =" + userPW + ", 회원 가입일 =" + userDate
				+ "]";
	}
	
	
}
