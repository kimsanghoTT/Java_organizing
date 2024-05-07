package ncs4.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {

	private String productName;
	private Date putDate;			//입고일
	private Date getDate;			//출고일
	private int putAmount;			//입고수량
	private int getAmount;			//출고수량
	private int inventoryAmount;	//재고수량
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일");
		String format1 = sdf.format(putDate);
		String format2 = sdf.format(getDate);
		inventoryAmount = putAmount - getAmount;
		return productName 
				+ ", " + format1 + " 입고, " 
				+ putAmount + "개, "
				+ format2 + " 출고, "
				+ getAmount + "개, 재고"
				+ inventoryAmount
				+ "개";
	}
}
