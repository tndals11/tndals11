package list04;

import java.util.ArrayList;
import java.util.List;

public class MemberDao { // 동작을 만들어주는
	// 생정자를 통해서 List를 생성, 저장 메소드, 삭제 메소드
	List<Member> list = null; // 전역변수 리스트 생성

	public MemberDao() { // 생성자
		list = new ArrayList<Member>(); // 줄 생성
	}

	public void addMember(Member m) { // 리스트안 내용을 추가하는 동작하는 메소드
		list.add(m);
	}

	public void deleteMember(String id) { // 삭제하는 메소드
		for (int i = 0; i < list.size(); i++) {

			String tmp = list.get(i).getUserID();
			if (tmp.equals(tmp)) {
				list.remove(i);
				System.out.println("선택하신 회원을 삭제하였습니다");
			}
		}
	}

	public void showInfo() { // 정보를 보여주는 메소드
		// 출력타입 : 별명
		for (int i = 0; i < list.size(); i++) {
			// 배열명.get(i).disp()이 붙는다
			System.out.println("출력할 회원 정보는 " + list.size() + "명 입니다.");
			list.get(i).disp();
			System.out.println("--------------------------");
		}

	}

}
