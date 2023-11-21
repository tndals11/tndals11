package test2;

public class KorDbMember {
	private int memID;
	private String memName;
	private String memPW;
	

	private String memDate;
	private String memGender;
	private String memText;
	public int getMemID() {
		return memID;
	}
	public void setMemID(int memID) {
		this.memID = memID;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemPW() {
		return memPW;
	}
	public void setMemPW(String memPW) {
		this.memPW = memPW;
	}
	public void setMemDate(String memDate) {
		this.memDate = memDate;
	}
	public String getMemGender() {
		return memGender;
	}
	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}
	public String getMemText() {
		return memText;
	}
	public void setMemText(String memText) {
		this.memText = memText;
	}
	@Override
	public String toString() {
		return "[멤버 번호 =" + memID + ", 이름 =" + memName + ", 비밀번호 =" + memPW + ", 가입일 =" + memDate
				+ ", 성별 =" + memGender + ", 자기소개 =" + memText + "]";
	}
	
	
	
	
	
	
}
