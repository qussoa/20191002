package com.biz.loop;

public class Loop_07 {

	public static void main(String[] args) {

		int nCount = 0;
		for (; nCount < 10 ;) {
			nCount ++;
			System.out.println(nCount);
		}
		//nCount =0;
			for (nCount = 0; nCount < 100 ;) {
			nCount ++;
			System.out.println(nCount);
		}
		
			/*
			 *  for 반복문을 여러번 작성할 경우
			 *  nCount = 0 명령문을 생략하기가 쉽다
			 *  오류가 발생하지 않고, 오류를 발견하기가 어렵기 때문
			 *  만약 정말 nCount =0 를 생략해버리면 이후에 사용하는
			 *  for 반복문에서 원하지 않는 결과가 나올 수 있다
			 *  
			 *  그래서 for 반복문에서는 카운트리셋 (nCount=0)을
			 *  생략하지 않고 생략했다면 쉽게 발견할 수 있도록
			 *  안전장치를 마련해두었다
			 *  
			 *  안전장치가 for keyword ()안의 첫번째 명령문이다
			 *  for keyword 첫번째 명령문 = count를 reset하는 명령
			 */
		// nCount = 0;
		for (nCount = 0; nCount < 1000 ;nCount++) {
			//nCount ++;
			System.out.println(nCount);
			/*
			 * for반복문이 실행될때
			 * 만약 카운트를 증감하는 명령문이 없다면
			 * for반복문은 무한반복이 될것이다
			 * 따라서 카운트 증감 명령문도 매우 중요한 명령문이다
			 * 증감을 해야하는 명령문이 반드시 필요함으로 
			 * 누락하지 않도록 적절한 조치를 취할 필요가 있다
			 * 
			 *  for  keyword () 명령문 중 3번째 명렴누 위치에
			 *  카운트 증감 명려문을 넣을 수 있다
			 */
		}
		
	}

}
