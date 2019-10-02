package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

/*
 * 키보드에서 도서정보를 입력받아서
 * List에 추가하고
 * 목록보기, 정보보기
 * 기능이 업그레이드 된 확장코드
 */
public class BookServiceImpV2 implements BookService {

	Scanner scan;
	List<BookVO> bookList;

	public BookServiceImpV2() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();

	}

	@Override
	public void input(int count) {

		for (int i = 0; i < count; i++) {
			System.out.println("===================================");
			System.out.println((i+1) + "번째 도서정보");
			System.out.println("-----------------------------------");
			try {
				this.input();
			} catch (Exception e) {
				System.out.println("데이터 재입력 요망");
				i--;
				continue;
			}
		}
	}

	@Override
	public void input() {

		System.out.print("도서번호 : ");
		String strNum = scan.nextLine();
		System.out.print("도서명 : ");
		String strName = scan.nextLine();
		System.out.print("저자 : ");
		String strWriter = scan.nextLine();
		System.out.print("출판사 : ");
		String strComp = scan.nextLine();
		System.out.print("가격 : ");
		String strPrice = scan.nextLine();
		int intPrice = 0;
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			System.out.println("숫자만 입력바랍니다");
			throw new NumberFormatException();
		}

		System.out.print("출판연도 : ");
		String strPubYear = scan.nextLine();
		int intPubYear = 0;
		try {
			intPubYear = Integer.valueOf(strPubYear);
		} catch (Exception e) {
			System.out.println("숫자만 입력바랍니다");
			//throw new NumberFormatException();
			while(true) {
				System.out.println(" 연도 재입력");
				String s = scan.nextLine();
				try {
					intPubYear = Integer.valueOf(s);
					if(intPubYear == -1) break;
					break;
				} catch (Exception e2) {
					// TODO: handle exception
				}}
		}

		BookVO bVO = new BookVO();
		bVO.setStrNum(strNum);
		bVO.setStrName(strName);
		bVO.setStrWriter(strWriter);
		bVO.setStrComp(strComp);
		bVO.setIntPrice(intPrice);
		bVO.setIntPubYear(intPubYear);

		bookList.add(bVO);

	}

	@Override
	public void list() {
		System.out.println("=====================================================");
		System.out.println("도서 정보 일람표");
		System.out.println("=====================================================");
		System.out.println("ISBM\t도서명\t저자\t출판사\t가격\t출판연도");
		System.out.println("-----------------------------------------------------");
		/*
		int nSize = bookList.size();
		for (int i = 0; i < nSize; i++) {
			BookVO vo = bookList.get(i);
			
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%4d\n", vo.getIntPubYear());
		}
*/
		for(BookVO vo : bookList) {
			System.out.println(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%4d\n", vo.getIntPubYear());
		}
	}

	@Override
	public void view(int index) {
		BookVO vo = bookList.get(index);
		System.out.println("=====================================================");
		System.out.println("IBSM : " +vo.getStrNum());
		System.out.println("도서명 : " + vo.getStrName());
		System.out.println("저자 : " + vo.getStrWriter());
		System.out.println("출판사 : " + vo.getStrComp());
		System.out.println("가격 : " + vo.getIntPrice());
		System.out.println("출판연도 : " + vo.getIntPubYear());
		System.out.println("=====================================================");

	}

	@Override
	public void view(String strName) {

		int nSize = bookList.size();
		for(int i =0; i < nSize; i++) {
			BookVO vo = bookList.get(i);
			String voStrName = vo.getStrName();
			// 도서명 검색어가 반드시 일치하는 경우만 
			if (bookList.get(i).getStrNum().equalsIgnoreCase(strName)) {
				this.view(i);
				//break;
			}
			if(voStrName.toUpperCase().contains(strName.toUpperCase())) {
				this.view(i);
			}
		}
	}

}
