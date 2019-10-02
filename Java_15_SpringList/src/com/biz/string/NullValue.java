package com.biz.string;
/*
 * null  값, null value
 * type형 변수(선언키워드가 첫글자가 대문자인 모든 경우)
 * 
 */
import com.biz.string.domain.StudentVO;

public class NullValue {

	public static void main(String[] args) {

		// 변수 선언 키워드가 소문자로 시작되는 선언문 -> primitive 기본형변수
		// 기본형 변수를 clear 할때는 고유한 값으로 clear를 해야한다
		// 변수를 선언하고 초기화하기
		int num = 0;
		float fnum = 0;
		boolean b = true;
		
		// 기본형 변수를 배열로 선언을 하면 참조형으로 바뀐다 
		
		int[] nums = null;
		
		// 변수 선언 키워드가 첫글자가 대문자로 시작되는 선언문
		// type형 (참조형 reference)
		//type형 변수를 clear -> null키워드로 clear가능
		//type형 변수는 clear하지 않고 직접 초기화, 생성을 하기도 한다 
		String s = "";
		s = new String();
		
		StudentVO studentVO = null;
		studentVO = new StudentVO();
		String sNull = null;
		
		Integer num1 = 0; 	 // -> 숫자 0을 값으로 갖는 변수
		Integer num2 = null; // -> 아무런 값도 없는 변수
		
		Float fnum1 = null;
		Double dNum1 = null;
		Boolean bNum1 = null;
	}

}
