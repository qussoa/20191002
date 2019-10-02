package com.biz.loop;

public class Boolen_01 {

	public static void main(String[] args) {

		boolean bYes = 3 == 3;
		System.out.println(bYes);
		
		bYes = 4 == 4; // true
		bYes = 4> 4;   // false
		bYes = 4 >= 3; // true
		bYes = 5 == 5 || 4 == 4; //true || = OR
		System.out.println(bYes); 
		
		bYes = 5 > 5 || 4 == 4; //true
		bYes = 5 >= 5 || 4 > 4;  // true
		
		bYes = 5 == 5 && 4 == 4; // true
		bYes = 5 > 5 && 4 == 4;  // false
		bYes = 5 >= 5 && 4 > 4; // false
		bYes = 5 <= 4; // false
		bYes = 3 < 4; // true
		
		bYes = 3 != 4; // true <>
		System.out.println(bYes);
		
		int n = 1;
		n = n * -1;
		n = n * -1;
		// bYse가 true 상태
		// Not 연산, 원래 값을 반전
		// 한번 실행 될때마다 true와 false가 반복됨
		bYes = !bYes; // false
		bYes = !bYes; // true
		
		
		
		
		
		
		
		
	}

}
