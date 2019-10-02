package com.biz.for_if;

public class If_04 {

	/*
	 * 1~ 100까지 숫자중에서 짝수의 합을 구하시오
	 */
	
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <=100 ; i++) {
			if (i %2 == 0) 
				sum += i; 		}
		
		System.out.println(sum);
			
		
	}

}
