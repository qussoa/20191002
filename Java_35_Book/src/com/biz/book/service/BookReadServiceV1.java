package com.biz.book.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.book.domain.BookVO;
import com.biz.book.utils.BookSetting;

public class BookReadServiceV1 {

	public List<BookVO> bookList;
	
	public List<BookVO> getBookList(){
		return bookList;
	}
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public BookReadServiceV1() {	
		bookList = new ArrayList<BookVO>();
	}
	
	public void readBookInfo(String bookFile) throws IOException {
		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		int lineNumber = 0;
		
		
		while(true) {
			//System.out.println(++lineNumber);
			reader = buffer.readLine();
			if(reader == null) break;
			String[] books = reader.split(":");
			BookVO bVO = new BookVO();
			bVO.setB_isbn(books[BookSetting.FILE.ISBM]);
			bVO.setB_comp(books[BookSetting.FILE.COMP]);
			bVO.setB_title(books[BookSetting.FILE.TITLE]);
			bVO.setB_writer(books[BookSetting.FILE.WRITER]);
			bVO.setB_title(books[BookSetting.FILE.TITLE]);
			bVO.setB_date(books[BookSetting.FILE.DATE]);
			
			int price = Integer.valueOf(books[BookSetting.FILE.PRICE].trim());
			bVO.setB_price(price);
			int page = Integer.valueOf(books[BookSetting.FILE.PAGE].trim());
			bVO.setB_page(page);
			bookList.add(bVO);
		
			
		}//while end
		buffer.close();
		fileReader.close();
	}
	
}
