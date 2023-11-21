package jdbcPrj03;

import java.sql.*;


// 동작을 별도의 클래스 작업
class DBDao {
	void insertDB() throws ClassNotFoundException, SQLException { // I/O 입출력 => 예외처리가 필수 
		// 1. 연결 : Connection
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver"); // java와 DB 연결
		
		String url = "jdbc:mysql://127.0.0.1:3306/grp"; // jdbc:mysql://호스트번호:3306/DB이름
		String id = "root";
		String pw = "1234";
		
		// 접속정보
		conn = DriverManager.getConnection(url, id, pw); // 정보를 보내준다
		Statement stmt = null; // 연결객체.statement
		stmt = conn.createStatement(); // 쿼리를 실행하기 위한 사전 작업
		
		// 2. 쿼리실행 : Statement, PrepareStatement
		String query = "INSERT INTO member VALUES( NULL, '삼길동', now(), now())";
		stmt.execute(query);
		System.out.println("INSERT Completed...");
		
		// 3. 결과 출력 : ResultSet
		
	}
}

public class JDBCPrj03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBDao dao = new DBDao();
		dao.insertDB();
		
		
	}
}
