package list03;

import java.util.ArrayList;
import java.util.List;
public class MemberDao { // MemberDao에 기능을 구현
	List<Member> list = null; // 전역으로 사용하기 위한 리스트 생성
	
	// 생성자 
	public MemberDao() {
		list = new ArrayList<Member>(); // 리스트를 구현
	}
	
	// 입력 메소드
	public void add(Member m) {
		
		list.add(m); // Member 클래스에 입력된 ID와 Name을 배열에 추가
	
	}
	
	public void show() { // 화면에 출력 
 		
		for(Member member : list) {
 			System.out.println(member);
 			System.out.println("==========");
 			
 		}
	}
	
	public void delet() {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getID() == 1) { // list.get(i) 리스트 배열안에 ID 번호가 == 1이랑 동일할시 
				list.remove(i); // .remove 삭제
				System.out.println(list.get(i) + "의 정보를 삭제했습니다.");
			}
		}
	}
	
	public void search(int searchid) {
		for(int i = 0; i < list.size(); i++) {
				int tmp = list.get(i).getID();
				if(tmp == searchid) {
					Member m = list.get(i);
					System.out.println("회원 아이디 : " + m.getID());
					System.out.println("회원 이름 : " + m.getName());
					System.out.println("회원 정보를 출력하였습니다.");
				}
			}
		}
	}