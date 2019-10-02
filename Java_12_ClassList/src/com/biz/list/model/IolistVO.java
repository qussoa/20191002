package com.biz.list.model;

public class IolistVO {
	/*
	 * 마트에서 거래할 거래내용을 관리할 클래스 거래일자, 거래시각, 상품이름, 상품단가, 수량, 상품금액 date time pname price
	 * qty total (price * qty) String String String int int int
	 */
	private String strDate;
	private String strTime;
	private String strPname;
	private int intPrice;
	private int intQty;
	private int total;

	public IolistVO(String strDate, String strTime, String strPName, int intPrice) {
		this.strDate = strDate;
		this.strTime = strTime;
		this.strPname = strPName;
		this.intPrice = intPrice;
	}

	public IolistVO(String strDate, String strTime, 
			String strPName, int intPrice, int intQty) {
		this.strDate = strDate;
		this.strTime = strTime;
		this.strPname = strPName;
		this.intPrice = intPrice;
		this.intQty = intQty;
	}

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public String getStrTime() {
		return strTime;
	}

	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}

	public String getStrPname() {
		return strPname;
	}

	public void setStrPname(String strPname) {
		this.strPname = strPname;
	}

	public int getIntPrice() {
		return intPrice;
	}

	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}

	public int getIntQty() {
		return intQty;
	}

	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
