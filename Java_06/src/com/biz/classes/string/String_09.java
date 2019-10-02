package com.biz.classes.string;

import java.util.Scanner;

public class String_09 {


	/*
	 * strNation에 저장된 문자열을 보여주고 한개의 문자를 키보드로 
	 * 입력받고 입력한 문자가 몇번째 위치에 있는 찾아보기
	 * 단, 최초에 나타난 위치만 알고 싶다
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		System.out.println("전체 문자열 : " +strNation);
		System.out.println("찾는 문자를 입력하세요");
	    System.out.print("문자 : ");
	    String strSearch = scanner.nextLine();
	    System.out.println("입력한 문자 : " + strSearch);
		
	   
	   for (int i = 0; i<intLength; i++) {
		   String strAt = strNation.substring(i, i+1);
		   	if(strAt.equalsIgnoreCase(strSearch)) {
			System.out.println( i +"번째 위치에서 찾음"); //<- 순차검색 
			break; // for 반복문 중단
	   
			
		   	}}
	}

}
