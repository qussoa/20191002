package com.biz.method;

/*
 * 1.콘솔에 대한민국 만세 문자열을 10번 출력
 * 2. 가 - 콘솔에 대한민국만세를 5번 출력
 *    나 - 줄을 표시
 *    다 - 다시 콘솔에 대한민국만세 3번 출력
 * 3. Republic of Korea를 같은 방법으로 콘솔에 출력하기  
 */
public class MethodEx_02 {
	public static void main(String[] args) {

		String strNation = "Republic of Korea";

		for (int i = 0; i < 10; i++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
		for (int i = 0; i < 5; i++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
		System.out.println("=========================");

		for (int i = 0; i < 3; i++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
	}
}