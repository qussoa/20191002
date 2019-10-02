package com.biz.list.exec;

import com.biz.list.service.BookService;
import com.biz.list.service.BookServiceImpV1;

/*
 * 도서 정보들을 키보드에서 입력받아 리스트를 작성하고
 * 콘솔에 보이는 코드
 */
public class List_02 {

	public static void main(String[] args) {

		BookService bs = new BookServiceImpV1();
		
		// bs.input();
		
		//interface 에 구현되지 않은 
		//input(int count) method를 호출해서 사용하려면
		// bs 객체를 BookServiceImpV1 class 형변환하여 사용해야한다
		// 
		// ((BookServiceImpV1)bs).input(3);
		bs.input(3);
		bs.list();
		bs.view(2);
	}

}
