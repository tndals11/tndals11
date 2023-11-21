package jdbcPrj04;

public class Items {
	private int itemID;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String itemDate;

	// getter, setter
	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		if (itemPrice < 0) { // 예외처리
			this.itemPrice = 0;
		}
		this.itemPrice = itemPrice;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {

		if (itemStock < 0) {
			this.itemStock = 0;
		}

		this.itemStock = itemStock;
	}

	public String getItemDate() {
		return itemDate;
	}

	public void setItemDate(String itemDate) {
		this.itemDate = itemDate;
	}

	@Override
	public String toString() {
		return "상품정보 [상품번호 =" + itemID + ", 상품이름=" + itemName + ", 상품가격=" + itemPrice + ", 상품재고=" + itemStock + ", 상품날짜"
				+ itemDate + "]";
	}

}
