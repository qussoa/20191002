package com.biz.for_if;

public class If_06 {

	public static void main(String[] args) {
		
		int num =47;
		/*
		 * 다양한 조건에 따라 명령문을 여러번의 조건을 수행하는 방법 
		 */
		// 1번
		if(num %3 == 0)
			System.out.println(num+ "는 3의 배수");
		else if (num %4 == 0)
			System.out.println(num+ "는 4의 배수");
		else if (num %2 == 0)
			System.out.println(num+"는 2의 배수");
		else 
			System.out.println(num+"는 2,3,4의 배수가 아니다");
	
		//2번
		if(num %3 == 0)
			System.out.println(num + "는 3의 배수");
		if (num %4 == 0)
			System.out.println(num+ "는 4의 배수");
		if (num %2 == 0)
			System.out.println(num+"는 2의 배수");
		
		/*
		 * 1번 코드와 2번코드는 변수에 담긴 값이
		 * 2,3,4의 배수를 알아보는 같은 코드이다
		 * 1번코드는 만약 변수에 담긴 값이 3의 변수이면 3의 배수라는 표시를 하고
		 *  나머지는 건너뜀
		 *  2번코드는 변수에 담긴 값이 3의 배수임을 찾았음에도 불구하고
		 *  4의 배수, 2의 배수인가를 검사하는 코드가 실행된다
		 *  
		 *   조건이 복잡해질 수록 1번 코드가 낫다
		 *  
		 */
	
	
		/*
		 * 두 코드를 효율적인 면에서만 비교하지 말고
		 * 문제풀이적 관점에서 비교해보면
		 * 만약 어떤 값이 2의 배수이면서 4의 배수인 경우
		 * 1번 코드는 4의 배수인 경우만 표시를 하고 
		 * 2번 코드는 4의 배수인 경우와 2의 배수인 경우 모두를
		 * 표시함으로 제시된 문제에 따라 적절한 코드를 선택해야한다
		 */
		
	}
	
}
