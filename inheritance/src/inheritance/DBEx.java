package inheritance;

interface QueryEx {

	// 입력
	void insert(); // {}없음

	// 수정
	void update();

	// 삭제
	void delete();

	// 출력
	void select();
}

class Mysql implements QueryEx {

	@Override
	public void insert() {
		System.out.println("Mysql 데이터베이스를 이용해 회원가입합니다.");
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}
}

class Oracle implements QueryEx {

	@Override
	public void insert() {
	} // 쓰기 싫은것은 안에 값을 안 넣어도 된다

	@Override
	public void update() {
	}

	@Override
	public void delete() {
	}

	@Override
	public void select() {
		System.out.println("오라클 데이터베이스로 검색합니다.");
	}

}

public class DBEx {

	public static void main(String[] args) {
		Mysql m = new Mysql();
		m.insert();

		System.out.println("=======================");

		Oracle o = new Oracle();
		o.select();
	}

}
