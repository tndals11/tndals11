package list02;

public class MemberEx {

	public static void main(String[] args) {
		// 입력, 출력, 삭제, 검색
		Member m1 = new Member(1, "일길동"); // 입력
		Member m2 = new Member(2, "이길동");
		Member m3 = new Member(3, "삼길동");
		
		MemberDao dao = new MemberDao(); // 
		dao.addMember(m1);
		dao.addMember(m2);
		dao.addMember(m3);
		
		// dao.delteMember(3);
		
		System.out.println("회원 정보를 검색합니다....");
		System.out.println("검색할 회원 아이디를 입력하세요.");
		System.out.println("");
		
		dao.findByID(3);
		
		dao.showMember(); // 화면에 출력
		
		
	}

}
