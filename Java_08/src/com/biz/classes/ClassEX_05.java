package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEX_05 {

	public static void main(String[] args) {

		/*
		 * 기본형 변수, String형 변수 등은 배열을 선언만 해도 자체적으로 초기화하는 
		 * 코드가 실행되도록 만들어져 있다
		 * 
		 *  사용자가 만든 클래스는 배열을 선언한 후에 반드시 각 요소모두를 초기화해야만
		 *  사용 접근이 가능하다
		 */
		
		StudentVO[] stVO = new StudentVO[100];
				
		stVO[0] = new StudentVO();
		
		// stVO 배열 모두 초기화 시키는 코드
		for(int i = 0; i < 100; i ++) {
			stVO[i] = new StudentVO();
		}
		
		
	}

}
