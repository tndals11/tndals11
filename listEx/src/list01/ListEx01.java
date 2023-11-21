package list01;

import java.util.*;

public class ListEx01 {

	public static void main(String[] args) {
		// List -> ArrayList,Vector
		// 입력, 수정, 삭제 -> 데이터 변동이 잦은
		// List는 자료의 중복을 허용한다.
		// 정수를 출력하는 ArrayList
		// 배열을 출력할 때는 항상 for문과 같이 사용된다.
		
		// <>제네릭을 사용
		// <> 안에는 Wapper Class를 사용해야한다
		List<Integer> list = new ArrayList<Integer>();
		list.add(100); // 값을 입력할 때는 add
		list.add(200);
		

		
		list.clear(); // 모두 삭제
		
		
				
		int size = list.size();
		
		System.out.println("====일반 for문====");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " "); // ArrayList 값을 가져올때는 get
			
		}
		System.out.println();
		System.out.println("====향상된 for문====");
		
		for(Integer a : list) { // 제네릭 안에 들은 타입을 적어줘야한다
			System.out.print(a + " ");
		}
		
		
	}

}
