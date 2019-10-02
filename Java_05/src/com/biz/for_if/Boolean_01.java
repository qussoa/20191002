package com.biz.for_if;

public class Boolean_01 {

	public static void main(String[] args) {

		//변수 type 
		// java에서 기본적으로 제공하는 변수형
		// primitive
		 int intNum1 = 0; //4byte크기의 값을 저장하는 정수
		 long longNum2 = 0L; //8byte 크기의 값을 저장하는 정수
		 
		 float floatNum = 0.0f; //정밀도가 일반형인 실수
		 double doubleNum = 0.0f; // 배 정밀도의 갖는 실수
				 
		 boolean bYes = true; // true, false만을 갖는 변수
		 boolean bNo = false; // 
		 
		 bYes = 3 == 3; // 우측에 있는 양식이 참인가
		 bNo = 3 == 3; // 우측에 있는 양식이 참인가
		 
		 char cA = 'A'; //한 개의 문자를 저장, 1byte, 한글 2byte
		 
		 // 변수의 기본형이 아닌 class의 형태의 특별한 type
		 // 일반 변수와 같이 사용
		 String strname = "대한민국"; // 문자열을 저장하는 변수
		 
		 bYes = 3 == 3; //true가 bYes에 저장
		 bYes = 3 > 3; // false가 bYes에 저장
		 
		 bYes = 3 != 3; // 3과 3이 다르냐 false가 bYes저장
		 bYes = !bYes; // bYes값을 역전 (Inverter, Not연산)
		 
		 int n = 1;
		 n *= -1; // n의 값을 -1로 변환
		 n *= -1; // n의 값을 다시 1로 변환
		 n = -n; // n의 값을 양수와 음수로 역전
		 n = -n; // n의 값을 양수와 음수로 역전
	}
	

}
