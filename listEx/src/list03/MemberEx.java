package list03;

public class MemberEx {
	public static void main(String[] args) {
		Member m = new Member(1, "홍길동"); // member에 값을 입력
		Member m2 = new Member(2, "이길동");
		Member m3 = new Member(3, "삼길동");
		
		MemberDao dao = new MemberDao();
		dao.add(m); // dao에 배열에 Member 클래스의 ID와 name의 값을 넣어준다.
		dao.add(m2);
		dao.add(m3);
		
		dao.show(); // 화면에 출력하는 메소드
		
		System.out.println("==================");
		System.out.println("정보 삭제");
		dao.delet();
		
		System.out.println("==================");
		System.out.println("회원 정보 검색");
		dao.search(2);
	}
}
