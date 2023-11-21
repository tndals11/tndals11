package test2;

import java.lang.reflect.Member;
import java.sql.*;

public class KorDbMemberDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	void insertDisp() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("연결성공...");

		String url = "jdbc:mysql://localhost:3306/kordb";
		String id = "kordb";
		String pw = "0923";

		conn = DriverManager.getConnection(url, id, pw);

		String sql = "INSERT INTO kor_member VALUES(NULL,?,?,NOW(),?,?)";

		pstmt = conn.prepareStatement(sql);

		KorDbMember kdm = new KorDbMember();
		kdm.setMemName("사길동");
		kdm.setMemPW("4444");
		kdm.setMemGender("M");
		kdm.setMemText("자기소개4");

		pstmt.setString(1, kdm.getMemName());
		pstmt.setString(2, kdm.getMemPW());
		pstmt.setString(3, kdm.getMemGender());
		pstmt.setString(4, kdm.getMemText());

		int result = pstmt.executeUpdate();

		if (result > 0) {
			System.out.println(kdm.getMemName() + "님 회원가입이 완료되었습니다.");
		} else {
			System.out.println("회원가입이 실패했습니다.\n관리자에게 문의하세요");
		}

	}

	void selectDisp() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("연결성공...");

		String url = "jdbc:mysql://localhost:3306/kordb";
		String id = "kordb";
		String pw = "0923";

		conn = DriverManager.getConnection(url, id, pw);

		String sql = "SELECT * FROM kor_member ORDER BY mem_id";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while ( rs.next() ) {
			KorDbMember kdm = new KorDbMember();
			kdm.setMemID(rs.getInt(1));
			kdm.setMemName(rs.getString(2));
			kdm.setMemPW(rs.getString(3));
			kdm.setMemDate(rs.getString(4));
			kdm.setMemGender(rs.getString(5));
			kdm.setMemText(rs.getString(6));
			
			System.out.println(kdm.toString());
		}
		
	}
}
