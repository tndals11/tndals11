package jdbcPrj05;

import java.util.List;
import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) throws Exception {
		MemberDao dao = new MemberDao();
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		
		while ( run ) {
			int choice = dao.menu(); // menu의 return값이 int이므로 int로 값을 받는다
			
			switch ( choice ) {
			
			case 1: 
				List<Member> list = dao.getMembers();
				
				if ( list.isEmpty() ) {
					System.out.println("가입된 회원이 없습니다.");
				} else {
					for(Member m : list) {
						System.out.println("가입된 회원은" + list.size() +"명 입니다.");
						System.out.println(m.toString());
						System.out.println();
					}
				}
				
				break;
			
			case 2:
				int result = dao.setMember();
				
				if( result > 0 ) {
					System.out.println("회원가입이 완료되었습니다.");
				} else {
					System.out.println("회원가입이 되지않았습니다.\n관리자에게 문의하세요 ");
				}
				break;
				
			case 3: 
				dao.updateMember(0);
				break;
				
			case 4:
				dao.deleteMember(0);
				System.out.println("===============================================================");
				System.out.println("                     4.코리아아이티 회원 삭제 화면                   ");
				System.out.println("===============================================================");
				System.out.println("삭제할 번호 입력 >> ");
				int id = sc.nextInt();
				// dao.deleteMember => return 값이 0,1이 나오기 때문에 결과 값을 정수로 받아준다.
				int delNum = dao.deleteMember(id); 
				
				if( delNum > 0 ) { 
					System.out.println("회원삭제가 완료되었습니다.");
				} else {
					System.out.println("회원삭제가 되지않았습니다.\n관리자에게 문의하세요 ");
				}
				
				break;
				
			case 5:
				System.out.println("===============================================================");
				System.out.println("                     5.코리아아이티 회원 검색 화면                   ");
				System.out.println("===============================================================");
				System.out.println("");
				
				System.out.println("검색할 회원 번호 입력 >> ");
				int searchID = sc.nextInt();
				// dao.deleteMember => return 값이 0,1이 나오기 때문에 결과 값을 정수로 받아준다.
				
				Member m = dao.searchMember(searchID);
				
				if( m == null ) {
					System.out.println("검색된 회원이 없습니다.");
					
				} else {
					System.out.println(searchID + "(으)로 검색된 회원정보입니다");
					System.out.println(m.toString());
				}
				System.out.println();
				break;
			
			case 6:
				dao.disConnect();
				break;
			
			default : 
				System.out.println("숫자 (1 ~ 6)를 눌러주세요 ");
				break;
			}
		
			
			
			
			}
		}
		
		
	}


