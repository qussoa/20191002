package com.biz.stream.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.biz.stream.domain.BookVO;

public class ListEx_01 {
	public static void main(String[] args) {
		
		String objSaveFile = "src/com/biz/stream/bookList.dat";
		List<BookVO> bookList = new ArrayList<BookVO>();
		
		BookVO bookVO = new BookVO();
		bookVO.title = "Java 만세";
		bookVO.comp = "영진출판사";
		bookVO.price = 5000;
		bookList.add(bookVO);
		

		bookVO = new BookVO();
		bookVO.title = "오라클";
		bookVO.comp = "생능출판사";
		bookVO.price = 30000;
		bookList.add(bookVO);
		

		bookVO = new BookVO();
		bookVO.title = " Do it Java";
		bookVO.comp = "이지퍼블";
		bookVO.price = 25000;
		bookList.add(bookVO);
		
		OutputStream os = null;
		ObjectOutput obj = null;
		
		
		try {
			os = new FileOutputStream(objSaveFile);
			obj = new ObjectOutputStream(os);
			obj.writeObject(bookList);
			obj.flush();
			obj.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
