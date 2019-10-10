package com.biz.book.exec;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;
import com.biz.book.service.BookFSaveServiceV1;
import com.biz.book.service.BookReadServiceV1;
import com.biz.book.service.BookViewServiceV1;

public class BookEx_04 {
	public static void main(String[] args) {

		String bookFile = "src/com/biz/book/도서정보.txt";
		String bookSavePath = "src/com/biz/book/";

		BookReadServiceV1 bRead = new BookReadServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		BookFSaveServiceV1 bSave = new BookFSaveServiceV1();

		Scanner scan = new Scanner(System.in);

		try {

			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();

			bView.setBookList(bookList);
			// bView.view();
			// bView.search("전부");
			bSave.setBookList(bookList);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			System.out.println("====================================");
			System.out.println("도서검색");
			System.out.println("====================================");
			System.out.println("1.제목 2.가격 0.종료");
			System.out.println("------------------------------------");
			System.out.print("선택 : ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if (intM == 0)
				break;
			if (intM == 1) {
				System.out.print("제목 : ");
				String strTitle = scan.nextLine();
				bView.search(strTitle);
				System.out.print("저장허쉴?(Y/N) : ");
				String sOK = scan.nextLine();
				if (sOK.equals("Y")) {
					try {
						bSave.print(bookSavePath + strTitle + ".txt", strTitle);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else if (intM == 2) {
				System.out.print("최저가 : ");
				String sPrice = scan.nextLine();
				System.out.print("최고가 : ");
				String ePrice = scan.nextLine();

				try {
					bView.search(Integer.valueOf(sPrice), Integer.valueOf(ePrice));

					System.out.print("저장허쉴?(Y/N) : ");
					String sOK = scan.nextLine();
					if (sOK.equals("Y")) {
						try {
							bSave.print(bookSavePath + sPrice + ".txt", Integer.valueOf(sPrice),
									Integer.valueOf(ePrice));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} catch (Exception e) {
					System.out.println("가격은 숫자만 기입");
				}

				System.out.println("업무종료 ");
			}
		}
	}
}
