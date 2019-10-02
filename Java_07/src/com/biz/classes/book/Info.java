package com.biz.classes.book;
/*
 * Value Object 정보처리 할 때 기본적인 데이터의 묶음
 */

public class Info {

	public static void main(String[] args) {

		Book book = new Book();
		
		book.strName = "엄마를 부탁해";
		book.strPub = "문학동네";
		book.strWrit = "신경숙";
		book.intPrice = 11700;
		
		System.out.println("===============================================");
		System.out.println("도서 정보");
		System.out.println("-----------------------------------------------");
		book.bookInfo();
		System.out.println("-----------------------------------------------");
		System.out.println("도서\t         출판사\t         저자\t 가격");
		book.list();
		System.out.println("===============================================");
	}

}
