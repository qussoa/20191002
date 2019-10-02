package com.biz.classes.search;

import java.util.Scanner;


public class SearchMain {

	public static void main(String[] args) {

		SearchSub ss = new SearchSub();
		Scanner scanner = new Scanner(System.in);
		
		// SearchSub클래스의 맴버변수인 strNation 필요한 문자열 세팅
		ss.strNation = "UNITED NATION";
		//for(;;) {
		while(3 == 3) {
			ss.main();
			System.out.println("계속하려면 아무키나 누르시오");
			System.out.println("종료하려면 END를 입력하시오");
			String anyKey = scanner.nextLine();
			if(anyKey.equals("END")) break;
		}
		System.out.println("Game Over");
		
		
		
			}

}
