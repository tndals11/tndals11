package list02;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	List<Member> list = null; 
	          	
	public MemberDao() { // 줄만드는곳 = List
		list = new ArrayList<Member>();
	}
	
	public void addMember(Member m) {	
		list.add(m);
	}
	
	public void showMember() {
		for(Member mem : list) {
			System.out.println(mem);
			System.out.println("==============");
		}
	}
	
	public void delteMember(int id) {
		// 저장된 자료 -> MemberID == id -> remove(배열번호)
		for(int i = 0; i < list.size(); i++) {
			// 저장된 아이디
			if(list.get(i).getMemberID() == id) { // 배열에 0, 1, 2,를 만나면
				list.remove(i);
				System.out.println(id + "회원번호를 삭제했습니다.");
			}
		}
		System.out.println(id +"는 존재하지 않는 회원번호 입니다.");
		System.out.println("");
		
	}
	
	public void findByID(int searchID) {
		for(int i = 0; i < list.size(); i++) {
			int tmpID = list.get(i).getMemberID();
			
			if( tmpID == searchID) 	{
				Member m = list.get(i);
				
				System.out.println("=====================");
				System.out.println("검색된 회원을 출력합니다.");
				System.out.println("회원 아이디 : " + m.getMemberID() );
				System.out.println("회원 이름 : " + m.getMemberName() );
				System.out.println("=====================");
				
				
			}
		}
	}
}
