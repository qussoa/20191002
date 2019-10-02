package com.biz.string;

public class String_05 {

	public static void main(String[] args) {

		int num = 30;
		boolean bYes = num == 30;
		
		if(bYes) 
			System.out.println("num에는 30이 담겨있다");
		else 
			System.out.println("num에는 30이 담겨있지 않다");
		
		num = 50;
		int num1 = 30;
		bYes = num == num1;
		
		String strNation ="Korea";
		String strKorea = "Korea";
		
		bYes = strNation == strKorea;
		if(bYes)
			System.out.println("두문자열 일치");
		else
			System.out.println("두문자열 다름");
		
		if(strNation == strKorea)
			System.out.println("두문자열 일치");
		else
			System.out.println("두문자열 다름");
		
		/*
		 * 문자열 변수는
		 * 일반 (Primitive)와 달리 클래스형 변수이다
		 * 클래스형 변수는 내부 시스템적으로 약간의
		 * 작동되는 방식이 차이가 있다
		 * 따라서 같음을 비교할 때에는 EQ(==)를 사용해서는 안됨
		 * EQ를 사용하여 비교를 할 때 값이 같음에도 다른 해석이 나타날 경우가 있다
		 * 문자열 비교는 EQ(==)를 사용하지 않고 별도의 method를 사용한다
		 * 
		 * 
		 * 두 문자열 변수에 담긴 값이 일치한가
		 */
		bYes = strNation.equals(strKorea);
		bYes = strKorea.equals(strNation);
		
		bYes = strNation.equalsIgnoreCase(strKorea);
		bYes = strKorea.equalsIgnoreCase(strNation);
		
	}

}
