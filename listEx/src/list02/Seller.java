package list02;
import java.util.ArrayList;
import java.util.List;

public class Seller {
	private int memberID;
	private String memberName;
	List<Item> list = null; // 전역변수 리스트 선언 
	
	
	public Seller(int memberID, String memberName) {
		this.memberID = memberID; // 화면에 아이디
		this.memberName = memberName; // 화면에 이름을 출력
		
		list = new ArrayList<Item>(); // 그 회원 안에 상품목록을 생성
		
	}
	
	// 상품 정보를 담을곳
	public void addItem(String itemName, int itemPrice, int itemStock) {
		Item item1 = new Item();
		item1.setItemName(itemName);
		item1.setItemPrice(itemPrice);
		item1.setItemStrock(itemStock);
		
		list.add(item1);// 배열에 추가
	}
	
	public void showMemberInfo() {
		for(Item info : list) {
			System.out.println("판매자 아이디 : " + memberID 
		+ ", 판매자 이름" + memberName 
		+ "상품명 : " + info.getItemName()
		+ "상품가격 : " + info.getItemPrice()
		+ "상품재고 : " + info.getItemStrock());
		System.out.println("==============================");
		}
		System.out.println(list.size() + "상품이 등록 되어 있습니다.");
	}
}
