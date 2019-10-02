package com.biz.classes.search;

import java.util.Scanner;

public class SearchSub {
	/*
	 * 임의의 문자열 중에 포함된 1개의 문자열을 찾는 클래스 1.임의의 문자열을 제시하고 2. 키보드에서 1개의 문자열을 입력받고 3. 해당하는
	 * 문자열이 몇번째 위치에 있나?
	 */

	// 멤버 변수 영역에 선언된 변수는 현재 클래스가 아닌곳에서
	// 값을 참조할수 있다. 단, public키워드가 포함되어 있어야한다
	
	public String strNation ;
	public void main() {

		//String strNation = "Republic of Korea";
		Scanner scanner = new Scanner(System.in);
		int intLength = strNation.length();
		// 문자열 제시
		System.out.println(strNation);
		System.out.println("1개의 문자열을 입력하세요");
		System.out.print("문자 : ");

		String strS = scanner.nextLine();

		int index = 0;
		for (index = 0; index < intLength; index++) {
			String strAt = strNation.substring(index, index + 1);
			if (strAt.equalsIgnoreCase(strS)) 
				 break;	
		 		}
		/*
		 * 만약 문자열에 포함된 문자가 있으면 index는 < 17
		 * 만약 문자열에 포함된 문자가 없으면 
		 * index == 17
		 */
		//System.out.println(index + "번째");
		
		if(index < intLength)
			System.out.println(index + "번째에서 찾음");
		else
			System.out.println("없는 문자열");
		if(index >= intLength)
			System.out.println("없는 문자열");
		else
			System.out.println(index + "번째 찾음");

	}

}
