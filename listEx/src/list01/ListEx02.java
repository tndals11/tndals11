package list01;

import java.util.*;

public class ListEx02 {

	public static void main(String[] args) {
		// 정수 타입 입력 후 -> 삭제 -> 출력(for1)
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		list.remove(1);
		list.remove(0);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 문자열 입력, 삭제, 출력
		List<String> list1 = new ArrayList<String>();
		list1.add("#f 0 0"); // red , 255, 0, 0
		list1.add("#0 f 0"); // Green
		list1.add("#0 0 255"); // blue #00f -> f(255)
		
		list1.remove(2);
		list1.remove("#f00");
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		for(String a : list1) {
			System.out.println(a);
		}
		
	}

}
