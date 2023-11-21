package jdbcPrj03;

import java.sql.*;


class SelectDao {
	void selectDB() {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null; //while
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); // DB연결
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grp", "root", "1234");
		
		String sql = "SELECT  * FROM member ORDER BY com_id DESC LIMIT 1;";
		stmt = conn.createStatement();
		
		rs = stmt.executeQuery(sql); // rs 객체 배열  
		
		while( rs.next() ) { // 한줄씩 값을 가져와서
			// System.out.println(rs.getInt("com_id"));
			System.out.println("===================== 사원 목록 출력 =======================");
			System.out.println("사번 : "  + rs.getInt(1)+ ", 이름 : " + rs.getString(2) 
							+ ", 입사일 : " +rs.getDate(3) + " 퇴사일 : " + rs.getDate(4));
			System.out.println("=========================================================");
			System.out.println();
		}
		
	} catch (Exception e) {
		System.out.println("연결 실패...");
	}
	
	
	}
}



public class JDBCPrj04 {

	public static void main(String[] args) {
		SelectDao dao = new SelectDao();
		dao.selectDB();
	}

}
