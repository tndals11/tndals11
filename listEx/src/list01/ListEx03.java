package list01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item { // 타입을 담을 객체 
	private Long itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStrock;

	public Item(Long itemNum, String itemName, int itemPrice, int itemStrock) {
		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStrock = itemStrock;
	}

	public void itemDisp() {
		System.out
				.println("상품번호 : " + itemNum + ", 상품이름 : " + itemName + ", 상품가격 : " + itemPrice + "상품 재고" + itemStrock);
	}

}

class ItemDao { // 리스트를 담을 클래스 
	// <제네릭> : 원하는 데이터 타입을 명시해줘야한다
	public List<Item> getItems() { // 동작할 메소드
		// 객체(Item) : 상품번호, 상품명 ,가격, 재고
		List<Item> list = new ArrayList<Item>();

		// add(배열안에 객체 생성자를 만들어 입력해줘야한다)
		list.add(new Item(10001000L, "IBM 노트북", 2000000, 10));
		list.add(new Item(20002000L, "게이밍 노트북", 50000, 999));
		list.add(new Item(10001000L, "LG LED 모니터", 750000, 50));
		return list;
	}

}

public class ListEx03 {
	public static void main(String[] args) {
		ItemDao dao = new ItemDao();
		List<Item> list = dao.getItems(); // List 줄 타입 
										  // <제네릭> 타입을 명시 
		System.out.println("등록된 상품은 " + list.size() + "개 입니다.");
		System.out.println("===============for1 상품출려==================");

		System.out.println("for2");
		for (Item item : list) { // 향상된 for문
			item.itemDisp();
		}

	}

}
