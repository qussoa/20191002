package com.biz.classes.string;

import java.util.Scanner;

public class String_08 {


	/*
	 * strNation에 저장된 문자열을 보여주고 한개의 문자를 키보드로 
	 * 입력받고 입력한 문자가 몇번째 위치에 있는 찾아보기
	 */
	public static void main(String[] args) {

		// 키보드에서 입력한 문자열을 가져오기 위한도구
		Scanner scanner = new Scanner(System.in);
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		System.out.println("전체 문자열 : " +strNation);
		System.out.println("찾는 문자를 입력하세요");
	    System.out.print("문자 : ");
	    String strSearch = scanner.nextLine();
	    System.out.println("입력한 문자 : " + strSearch);
		
	    //문자열의 개수만큼 찾기를 반복한다
	   for (int i = 0; i<intLength; i++) {
		   String strAt = strNation.substring(i, i+1);
		   //1. strNation 문자열에서 1번부터 intLength-1까지 
		   //   한글자씩 추출
			if(strAt.equalsIgnoreCase(strSearch))
				//2. 추출된 1개의 문자열과 키보드에서 입력한 문자열을 비교a
				System.out.println( i +"번째 위치에서 찾음");	
	   }
	}

}
