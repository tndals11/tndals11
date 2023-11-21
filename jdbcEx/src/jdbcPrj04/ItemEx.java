package jdbcPrj04;

import java.sql.*;

class ItemCrud {

	void selectItem() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // 배열

		Class.forName("com.mysql.cj.jdbc.Driver"); // java와 DB 연결

		String url = "jdbc:mysql://127.0.0.1:3306/shop"; // jdbc:mysql://호스트번호:3306/DB이름
		String id = "root";
		String pw = "1234";

		conn = DriverManager.getConnection(url, id, pw);
		String sql = "SELECT * FROM items ORDER BY item_id DESC;";

		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();

		while (rs.next()) { // DB => 객체를 한번 지나고 => 화면 출력
			Items item = new Items(); // 초기화

			item.setItemID(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setItemPrice(rs.getInt(3));
			item.setItemStock(rs.getInt(4));
			item.setItemDate(rs.getString(5));

			System.out.println(item.toString());

		}

	}

	void insertItem() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // java와 DB 연결

			String url = "jdbc:mysql://127.0.0.1:3306/shop"; // jdbc:mysql://호스트번호:3306/DB이름
			String id = "root";
			String pw = "1234";

			conn = DriverManager.getConnection(url, id, pw);

			String sql = "INSERT INTO items VALUES( NULL,?,?,?,now() )";
			// conn.prepareStatement(sql); 실행하는 구문
			pstmt = conn.prepareStatement(sql);

			Items item = new Items(); // getter, setter를 담고있는 클래스
			item.setItemName("한돈 ++");
			item.setItemPrice(1000000);
			item.setItemStock(10);

			pstmt.setString(1, item.getItemName()); // 실제 DB에 저장하는 곳
			pstmt.setInt(2, item.getItemPrice());
			pstmt.setInt(3, item.getItemStock());
			int row = pstmt.executeUpdate();

			if (row > 0) {
				System.out.println(item.getItemName() + " 상품 등록이 완료되었습니다.");
			} else {
				System.out.println("상품 등록에 실패하였습니다\n확인하세요");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ItemEx {
	public static void main(String[] args) throws Exception {
		ItemCrud crud = new ItemCrud();
		// crud.insertItem();
		crud.selectItem();
	}

}
