package com.biz.classes.string;

public class String_04 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		String strSearch = "r";
		int intLength = strNation.length();
		
		strNation.substring(5); // 지정 위치부터 문자열 자르기
		
		strNation.substring(5, 8); //5~8까지 자르기
		
		String strAt = strNation.substring(0,1);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println("0번째 위치에서 찾음");
		strAt = strNation.substring(1,2);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println("1번째 위치에서 찾음");
		strAt = strNation.substring(2,3);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println("2번째 위치에서 찾음");
		strAt = strNation.substring(3,4);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println("3번째 위치에서 찾음");
				
	}

}
