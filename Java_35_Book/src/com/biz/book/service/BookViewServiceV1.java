package com.biz.book.service;

import java.util.List;

import com.biz.book.domain.BookVO;

public class BookViewServiceV1 {

	List<BookVO> bookList;

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	public void search(int startPrice, int endPrice) {

		this.ListTitle();
		for (BookVO vo : bookList) {
			int price = vo.getB_price();
			if (price >= startPrice && price <= endPrice) {
				this.body(vo);
			}
		}
	}

	public void search(String text) {
		this.ListTitle();
		for (BookVO vo : bookList) {
			if (vo.getB_title().contains(text.trim())) {
				this.body(vo);
			}
		}
	}

	private void ListTitle() {
		System.out.println("============================================================");
		System.out.println("도서정보 v1");
		System.out.println("============================================================");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격");
		System.out.println("------------------------------------------------------------");

	}

	private void body(BookVO vo) {
		System.out.print(vo.getB_isbn() + "\t");
		System.out.print(vo.getB_title() + "\t");
		System.out.print(vo.getB_comp() + "\t");
		System.out.print(vo.getB_writer() + "\t");
		System.out.println(vo.getB_price() + "\n");
	}

	public void view() {
		this.ListTitle();
		for (BookVO vo : bookList) {
			this.body(vo);
		}
		System.out.println("============================================================");
	}
}
