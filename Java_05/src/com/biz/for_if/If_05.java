package com.biz.for_if;

public class If_05 {

	public static void main(String[] args) {

		int num = 33;
		/* 
		 * if 와 else를 같이 사용하는 명령문
		 * if true 조건 명령실행
		 * else true가 아닌 조건 명령실행
		 * 
		 * if 키워드에 조건은 많은 조건 중
		 * true인 경우가 단 1번 있는 조건
	     * else 나머지 모든 조건
		 */
		
		if (num % 3 == 0) System.out.println(num + "는 3의 배수");
		// 아니면
		else System.out.println(num + "는 3의 배수가 아니다");
		
		if(num %2 ==0)
			System.out.println(num+"는 짝수");
		else
			//num % 2가 0이 아닌 경우
			// 홀수이지만 홀수라고 단언 ㄴㄴ
			System.out.println(num+"는 짝수가 아니다");
	
	
	     if(num %2 == 1)
	    	 System.out.println(num+"는 홀수이다");
	    	 else 
	    		 System.out.println(num+"는 홀수가 아니다");
	    		

 		
}}
