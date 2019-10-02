package com.biz.list.model;

/*
 * 도서정보 관리 어플에서 사용할 클래스
 * 1. 추상화 단계 - 도서명,  저자,      출판사,  도서가격, 출판연도, ISBM 
 *                  name     writer     company  price     year      num
 *                  String   String     String   int       int       String
 *                  strNum   strWriter  strComp  intPrice  intYear   strNum
 */

//VO = Value Object = 데이터를 담는 최소 클래스
//VO 클래스를 만들떄
// 1. 추상화단계 : 멤버변수 추상
// 2. 멤버변수 선언 
// 3. 정보은닉 : 접근제한자를 private 선언
// 4. 캡슐화 : 보호된 정보를 접근할 게이트를 설정 :  getter() setter() method 생성, 선언
//             

public class BookVO {
	
	private String strNum;
	
	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intPubYear;
	
	
	// strNum 변수의 값읽기
	// String num = vo.getStrNum()
	public String getStrNum() {
		return strNum;
	}
	
	// setStrNum("9700001")
	// 멤버변수 strNum = "9700001" 이런 코드실행
	public void setStrNum(String strNum) {
		
		// this,strNum = 멤버변수
		// = strNum 매개변수의 값 멤버변수에 할당
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrWriter() {
		return strWriter;
	}
	public void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntPubYear() {
		return intPubYear;
	}
	public void setIntPubYear(int intPubYear) {
		this.intPubYear = intPubYear;
	}


}
