package jdbcPrj05;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	// singleton : 개발자가 한번만 만들어서 공유하는것 아무나 new 객체를 이용해서 만들지 못하게 한다
	
	// 1. 객체 생성 1번만 작성 : private static 
	private static DBConnect db = new DBConnect();
	
	// 2. 객체생성(생성자) 1번만 그리고 아무나 접근 private
	private DBConnect() {}
	
	// 1,2 만들어 놓은 객체에 접근을 하려면 public 이용해서 싱글톤 접근 메소드 생성
	public static DBConnect getInstance() { // return 타입 => DBConnect
		return db;
	}
	
	// 4. 사용할 메소드 작업하기 : Connection
	Connection getConnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pw = "1234";
		Connection conn = DriverManager.getConnection(url, id, pw);
		System.out.println("연결 완료...");
		
		return conn;
	}
}
