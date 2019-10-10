package com.biz.book.exec;

import java.io.IOException;
import java.util.List;

import com.biz.book.domain.BookVO;
import com.biz.book.service.BookReadServiceV1;
import com.biz.book.service.ExcelSaveServiceV1;

public class BookEx_05 {

	public static void main(String[] args) {

		BookReadServiceV1 bRead = new BookReadServiceV1();
		ExcelSaveServiceV1 bExcel = new ExcelSaveServiceV1();
		
		String bookFile = "src/com/biz/book/도서정보.txt";
		String bookSavePath = "src/com/biz/book/";
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			bExcel.setBookList(bookList);
			bExcel.excelSave(bookSavePath + "도서정보_01");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
