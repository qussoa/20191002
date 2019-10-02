package com.biz.for_if;

public class If_03 {

	public static void main(String[] args) {

		int num = 37;
		
		if(num % 2 == 0) { 
			System.out.println(num + "는 짝수"); }
		if(num %2 != 0) { 
			System.out.println(num + "는 홀수"); }
	
		/*
		 * 변수 i 0~ 100까지 숫자를 1개씩 내부로 전달
		 */
	
	for(int i = 0; i <= 100; i++) {
		if (i %2 == 0) System.out.println(i+"는 짝수 ");
		/*
		 * 변수 i에 담긴 숫자가 짝수이면
		 */
	}

	}}
