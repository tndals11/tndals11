package jdbcPrj05;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDao { // Dao => 메소드
	Scanner sc = new Scanner(System.in);
	Connection conn = null; // 전역 변수
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DBConnect db = DBConnect.getInstance();

	// 화면 메뉴
	int menu() {
		System.out.println("============== 코리아IT아카데미 회원가입 프로그램 Ver.1 ==============");
		System.out.println(" 1.회원목록 | 2.회원가입 | 3.회원수정 | 4.회원삭제 | 5.회원검색 | 6.종료 ");
		System.out.println("===============================================================");
		System.out.println("숫자를 선택해주세요 (1 ~ 6) >> ");
		int choice = sc.nextInt();

		return choice; // 선택한 값을 리턴
	}

	// 회원목록
	List<Member> getMembers() throws Exception { // -> 배열이므로 s가 붙는다
		System.out.println("===============================================================");
		System.out.println("                     1.코리아아이티 회원 목록 출력                   ");
		System.out.println("===============================================================");
		System.out.println("");
		db.getConnection();

		List<Member> list = new ArrayList<Member>(); // list.add(객체명)
		conn = db.getConnection();
		String sql = "SELECT * FROM member ORDER BY id DESC";

		pstmt = conn.prepareStatement(sql);

		rs = pstmt.executeQuery();

		while (rs.next()) {
			Member m = new Member();
			m.setId(rs.getInt(1));
			m.setEmail(rs.getString(2));
			m.setPasswd(rs.getString(3));
			m.setName(rs.getString(4));
			m.setDepart(rs.getString(5));
			m.setPasswd(rs.getString(6));
			m.setSalary(rs.getInt(7));
			m.setStartDate(rs.getString(8));
			m.setEndDate(rs.getString(9));
			
			list.add(m);

		}

		return list;
	}

	// 회원가입
	int setMember() throws Exception {
		System.out.println("===============================================================");
		System.out.println("                     2.코리아아이티 회원 가입 화면                   ");
		System.out.println("===============================================================");
		System.out.println("");

		conn = db.getConnection();

		String sql = "INSERT INTO member VALUES(NULL,?, ?, ?, ?, ?, ?, now(), ?);";
		pstmt = conn.prepareStatement(sql);

		Member m = new Member();
		m.setEmail("tmdals0923121@naver.com");
		m.setPasswd("*********");
		m.setName("이길동");
		m.setDepart("인사팀");
		m.setPostion("대리");
		m.setSalary(50000000);
		m.setEndDate(String.valueOf(LocalDate.now()));

		pstmt.setString(1, m.getEmail());
		pstmt.setString(2, m.getPasswd());
		pstmt.setString(3, m.getName());
		pstmt.setString(4, m.getDepart());
		pstmt.setString(5, m.getPostion());
		pstmt.setInt(6, m.getSalary());
		pstmt.setString(7, m.getEndDate());

		int result = pstmt.executeUpdate();

		return result;
	}

	// 회원수정
	int updateMember(int pk) throws Exception {
		System.out.println("===============================================================");
		System.out.println("                     3.코리아아이티 회원 수정 화면                   ");
		System.out.println("===============================================================");
		System.out.println("");
		db.getConnection();

		return 0;
	}

	// 회원삭제
	int deleteMember(int pk) throws Exception { // 중복되지않는 값을 바꾸기위해 pk(고유번호)로 바꾼다
		conn = db.getConnection();		
		String sql = "DELETE FROM member WHERE id = ?"; // ? => 변수를 의미한다
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pk); // 1번째 칸에 pk => id번호
		int result = pstmt.executeUpdate();
		
		return result;
	}

	// 회원검색
	// member 테이블에 id만 나오기 때문에 List를 사용하지 않는다
	Member searchMember(int searchID) throws Exception { // pk => primary key
		conn = db.getConnection();
		 String sql = "SELECT * FROM member WHERE id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, searchID);
		rs = pstmt.executeQuery();
		// 회원검색은 1개만 출력되기 때문에 loop를 사용하지 않아도 된다.
		
		Member m = null; // return값을 주기위해 전역변수 
		if ( rs.next() ) { // while문을 사용하게 된다면 List를 사용해야 한다.
			m = new Member();
			m.setId(rs.getInt(1));
			m.setEmail(rs.getString(2));
			m.setPasswd(rs.getString(3));
			m.setName(rs.getString(4));
			m.setDepart(rs.getString(5));
			m.setPostion(rs.getString(6));
			m.setSalary(rs.getInt(7));
			m.setStartDate(rs.getString(8));
			m.setEndDate(rs.getString(9));
		}
		
		return m;
	}

	// 종료
	void disConnect() {
		System.out.println("===============================================================");
		System.out.println("                      6.코리아아이티 종료                          ");
		System.out.println("===============================================================");
		System.out.println();
		System.exit(0);
	}

}
