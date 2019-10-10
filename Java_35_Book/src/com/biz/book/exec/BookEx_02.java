package com.biz.book.exec;

import java.io.IOException;
import java.util.List;

import com.biz.book.domain.BookVO;
import com.biz.book.service.BookReadServiceV1;
import com.biz.book.service.BookViewServiceV1;

public class BookEx_02 {
	public static void main(String[] args) {
		
		BookReadServiceV1 bRead = new BookReadServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		
		String bookFile = "src/com/biz/book/도서정보.txt";
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			bView.setBookList(bookList);
			//bView.view();
			bView.search("전부");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
