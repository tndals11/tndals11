package jdbcPrj03;

import java.sql.*;


class updateDao {
	void updateDB() {
		try {
			Connection conn = null;
			Statement stmt = null; 
	
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			String url = "jdbc:mysql://localhost:3306/grp"; 
			String id = "root";
			String pw = "1234";
			
			// 접속정보
			conn = DriverManager.getConnection(url, id, pw); // 정보를 보내준다
			
			String sql = "UPDATE member SET com_name = '이영희' WHERE com_id = 1";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result > 0 ) {
				System.out.println( "회원 정보가 수정되었습니다." );
			} else {
				System.out.println("관리자에게 문의하세요.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패... ");
		}
	}
}

class DeleteDao {
	void DeleteDB() {
		try {
			Connection conn = null;
			Statement stmt = null; 
	
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			String url = "jdbc:mysql://localhost:3306/grp"; 
			String id = "root";
			String pw = "1234";
			
			// 접속정보
			conn = DriverManager.getConnection(url, id, pw); // 정보를 보내준다
			String sql = "DELETE FROM member WHERE com_id = 1";
			stmt = conn.createStatement();
			
			int row = stmt.executeUpdate(sql);
			
			if(row > 0 ) {
				System.out.println("사원 정보가 삭제되었습니다.");
			} else {
				System.out.println("삭제할 수 없습니다.\n관리자에게 문의하세요");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("관리자에게 문의하세요");
		}
	}
}


public class JDBCPrj05 {
	public static void main(String[] args) {
		updateDao dao = new updateDao();
//		dao.updateDB();
		DeleteDao dao1 = new DeleteDao();
		dao1.DeleteDB();
	}

}
