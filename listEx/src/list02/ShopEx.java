package list02;

import java.util.Scanner;

public class ShopEx {

	public static void main(String[] args) {
		// 판매자로 회원가입 -> 판매자 승인 -> 상품 등록(여러개 = List)
		// 홍길동만 볼 수 있는 List 배열 공간을 만든다 
		
		Seller seller1 = new Seller(1002, "홍길동");
		Seller seller2 = new Seller(1002, "이길동");
		Seller seller3 = new Seller(1002, "삼길동");
		Seller seller4 = new Seller(1002, "사길동");
		
		
		seller1.addItem("삼성 노트북" , 1000_000, 10);
		seller1.addItem("무선 마우스" , 1000_000, 10);
		seller1.showMemberInfo();
		
		System.out.println("======================================================================");
		
		seller2.addItem("삼성 노트북" , 1000_000, 10);
		seller2.addItem("무선 마우스" , 1000_000, 10);
		seller2.showMemberInfo();
	}

}
