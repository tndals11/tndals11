package jdbcPrj04;

import java.sql.*;

class insertDao {

	void selectDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // java와 DB 연결

			String url = "jdbc:mysql://127.0.0.1:3306/shop"; // jdbc:mysql://호스트번호:3306/DB이름
			String id = "root";
			String pw = "1234";

			// 접속정보
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "SELECT * FROM items ORDER BY item_id DESC";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery(); // 배열
			
			while( rs.next() ) {
				System.out.println("상품번호 : " + rs.getInt(1) + " ");
				System.out.println("상품이름 : " + rs.getString(2));
				System.out.println("상품가격 : " + rs.getInt(3));
				System.out.println("");
			}
			
			
		} catch (Exception e) {

		}

	}

	void insertDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // java와 DB 연결

			String url = "jdbc:mysql://127.0.0.1:3306/shop"; // jdbc:mysql://호스트번호:3306/DB이름
			String id = "root";
			String pw = "1234";

			// 접속정보
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공...");
			String sql = "INSERT INTO items VALUES(NULL,?,?,?,now())";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "돼지고기");
			pstmt.setInt(2, 20000);
			pstmt.setInt(3, 100000);

			int row = pstmt.executeUpdate();
			if (row > 0) {
				System.out.println(row);
				System.out.println("상품 등록이 완료 되었습니다.");
			} else {
				System.out.println("관리자에게 문의하세요");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}

public class JDBCPrj04 {
	public static void main(String[] args) {
		insertDao dao = new insertDao();
		//dao.insertDB();
		dao.selectDB();
	}

}
