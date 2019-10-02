package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

public class BookServiceImpV1 implements BookService {

	Scanner scan;	
	List<BookVO> bookList;	
	
	public BookServiceImpV1() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	
	public void input(int count) {
		for(int i = 0; i< count ; i++) {
			this.input();			
		}
		
	} // input(count) end
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
		
		/*
		 * 이 앱에서 사용자가 데이터를 입력하는 값에
		 * 가격이나 출판연도를 숫자가 아닌 문자열을
		 * 입력하게 되면 문자열을 숫자로 바꾸는 과정에서
		 * NumberFormatException이 발생할 것이다
		 * 
		 * 이럴 경우 사용자가 입력하는 과정에서 약간의 실수만 
		 * 하게 되어도 앞에서 입력했던 모든 데이터를 잃게 된다
		 * 
		 * 사용자 입장에서는 매우 불편한 코드가 된다 
		 *  = exception handling
		 * 
		 * 1. 사용자가 가격이나 출판연도를 문자열을 포함하여 입력할 경우
		 * 안내 메시지를 보여주고, 다음 값을 입력하도록 유도하는 코드 작성
		 */
		System.out.print("가격 : ");
		String strPrice = scan.nextLine();
		int intPrice = Integer.valueOf(strPrice);	
		/*
		 * 예외처리 사용자가 app을 사용 중에 
		 * 데이터를 입력하거나 어떤 연산을 수행할 때
		 * Run Time error가 발생할 확률이 1/1000000라도 생긴다면
		 * 그 app은 사용자에게 불편할 수 있다 
		 * 개발자는 이런 상황을 만들지 않기 위해 예측할 수 있는
		 * 예외가 발생할 수 있는 코드에서 예외처리를 해주야한다 
		 * 예외처리는 개발자의 필수항목으로 인식하자
		 * 
		 */
		
		/*
		 * 예외가 발생할 가능성이 있는 코드는 try{ }에 작성한다
		 * 만약 예외가 발생할 경우 처리할 코드는 catch(){ } 작성한다
		 */
	
	
		
		System.out.print("출판연도 : ");
		String strPubYear = scan.nextLine();
		int intPubYear = 0;
		try {
			intPubYear = Integer.valueOf(strPubYear);
			/*
			 * 만약 도서가격을 입력하는 도중 NumberFormat 예외가
			 * 발생하면 현재 입력하던 도서정보를 다시 입력하도록 코드를 작성
			 * 
			 * continue
			 */

			// throw input method를 호출한 곳으로 예외를 돌린다
			// 현재 발생한 예외를 대신 처리 요청
		} catch (Exception e) {
			System.out.println("출판연도에 문자열이 포함됨");
			System.out.println("현재 도서 정보는 추가되지 않음");
			return;
		}
		
		BookVO bookVO = new BookVO();
		bookVO.setStrNum(strNum);
		bookVO.setStrName(strName);
		bookVO.setStrComp(strComp);
		bookVO.setStrWriter(strWriter);
		bookVO.setIntPrice(intPrice);
		bookVO.setIntPubYear(intPubYear);
		
		bookList.add(bookVO);
	}

	@Override
	public void list() {

		System.out.println("=====================================================");
		System.out.println("도서 정보 일람표");
		System.out.println("=====================================================");
		System.out.println("ISBM\t도서명\t저자\t출판사\t가격\t출판연도");
		System.out.println("-----------------------------------------------------");
		int nSize = bookList.size();
		for(int i =0 ; i<nSize;i++) {
			BookVO vo = bookList.get(i);
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getStrName()+"\t");			
			System.out.print(vo.getStrWriter()+"\t");
			System.out.print(vo.getStrComp()+"\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
		}
	}

	@Override
	public void view(int index) {

		System.out.println("=====================================================");
		System.out.println("ISBM : " + bookList.get(index).getStrNum());
		System.out.println("도서명 : " + bookList.get(index).getStrName());
		System.out.println("저자 : " + bookList.get(index).getStrWriter());
		System.out.println("출판사 : " + bookList.get(index).getStrComp());
		System.out.println("가격 : " + bookList.get(index).getIntPrice());
		System.out.println("출판연도 : " + bookList.get(index).getIntPubYear());
		System.out.println("=====================================================");

	}

	
	@Override
	public void view(String strName) {
	
		int nSize = bookList.size();
		for(int i =0; i < nSize; i++) {
			if (bookList.get(i).getStrNum().equalsIgnoreCase(strName)) {
				this.view(i);
				break;
			}
				
		}

	}

}
