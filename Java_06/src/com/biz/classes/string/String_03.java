package com.biz.classes.string;

public class String_03 {

	public static void main(String[] args) {

		//문자열의 길이를 확인하여 변수 intLengh 저장
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		char cSearch = 'u';
		int index = 0;
		
		// i값이 0~ intLength -1 이라는것은
		// 0번째부터 intLength -1번째 까지라는 조건이
		// 만족할 동안 실행
		for(int i = 0; i < intLength; i ++) {
			char cA = strNation.charAt(i);
				if(cA == cSearch)
			System.out.println(i + "번 위치에 있음");
		
		}
	
		
	}

}
