package inheritance;


public class inherEx03 {
	public static void main(String[] args) {
		// interface, abstract -> 객체 생성해서 사용x(new x)
		// 본체({}(중괄호가 없는) x)
		
		Student s = new Student();
		s.eat();
		s.study();
		System.out.println(s.name = "이름 : 홍길동");
		System.out.println("나이 : " + (s.age = 20));
		System.out.println(s.stdID = "학생증 번호 : A200100001");
		s.sleep();
		
		System.out.println("===================================");
		
		Employee e = new Employee();
		e.eat();
		e.work();
		System.out.println(e.empID = "사원 번호 : 100500001");
		System.out.println(e.name = "이름 : 나출근");
		System.out.println("나이는 : " + (e.age = 20));
		e.sleep();
		
		
		
	}

}
