package list04;

public class MemberEx {

	public static void main(String[] args) {
		// 줄(Dao) -> 칸(member)
		MemberDao md = new MemberDao();
		
		// 칸 생성
		md.addMember( new Member("홍길동", "0000"));
		md.addMember( new Member("김철수", "1111"));
		
		md.showInfo(); // 전체를 볼때는 매개변수가 필요가 없다
		
		System.out.println("---------------------------");
		md.deleteMember("김철수");
	
		md.showInfo();
	}

}
