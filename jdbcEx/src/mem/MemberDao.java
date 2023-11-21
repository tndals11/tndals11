package mem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	void insertDao() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("연결성공");

		String url = "jdbc:mysql://localhost:3306/userinfo";
		String id = "userinfo";
		String pw = "1234";

		conn = DriverManager.getConnection(url, id, pw);

		String sql = "INSERT INTO member VALUES(NULL,?,?,NOW())";

		pstmt = conn.prepareStatement(sql);

		Member m = new Member();

		m.setUserID("이길동");
		m.setUserPW("3333");

		pstmt.setString(1, m.getUserID());
		pstmt.setString(2, m.getUserPW());

		int result = pstmt.executeUpdate();

		if (result > 0) {
			System.out.println(m.getUserID() + "회원가입이 완료");
		} else {
			System.out.println("회원가입을 실패했습니다.");
		}

	}
	void selectDao() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("연결성공");

		String url = "jdbc:mysql://localhost:3306/userinfo";
		String id = "userinfo";
		String pw = "1234";

		conn = DriverManager.getConnection(url, id, pw);

		String sql = "SELECT * FROM member ORDER BY user_num DESC";
		
		pstmt = conn.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while( rs.next() ) {
			Member m = new Member();
			m.setUserNum(rs.getInt(1));
			m.setUserID(rs.getString(2));
			m.setUserPW(rs.getString(3));
			m.setUserDate(rs.getString(4));
			
			System.out.println(m.toString());
			
		}
		
	}
}
