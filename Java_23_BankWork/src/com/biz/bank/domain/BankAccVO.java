package com.biz.bank.domain;
/*
 * 은행 계좌 정보를 담을 class
 * 계좌번호
 * 현잔액
 * 최종거래
 * 거래방법
 */
public class BankAccVO {

	private String Num;
	private int balance;
	private String date;
	private String remark;
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
