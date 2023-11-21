package jdbcPrj02;

import java.sql.*;

public class jdbcPr02Ex {

	public static void main(String[] args) {
		jdbcPr02Ex jdbc = new jdbcPr02Ex();
		jdbc.insertDB();
		
	}
	
	public void insertDB() {
		try {
			// 1. 데이터베이스 연결 성공 시....
			// Class.forName();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 연결객체 
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			// 정상적으로 연결 된다면 
			Connection conn = DriverManager.getConnection(url, id, pwd); 
			// conn : 데이터베이스에 연결되었으니까...
			System.out.println("성공");
			String sql = "INSERT INTO register VALUES(101, '홍길동', '1234')"; // mysql 값을 입력
			
			// 위 변수에 저장된 쿼리를 실행하는 creatstatement() 객체 사용
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("회원가입이 완료되었습니다.");
			
			
			//3. createStatement("INSERT INTO ...");
			
			
			
		} catch (Exception e) {
			System.out.println("데이터 베이스 접속 실패...");
			
		}
		
	}
}
