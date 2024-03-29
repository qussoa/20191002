package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEX_03 {

	/*
	 * StudentVO 클래스를 사용하여 학생 10명의 신상정보를 메모리에 저장하고
	 * 학생 정보와 학생 리스트를 확인하고 싶다
	 *  == 가. StudentVO를 객체로 10개 선언 
	 * 1. 학생클래스를 객체로 선언하는 명령문을 10개 복제
	 * 2. 배열을 이용하는 방법
	 */
	public static void main(String[] args) {
		
		// ***********************
		// 배열의 선언
		// -----------------------
		//StudentVO[] : 지금부터 배열을 선언하겠다
		// new StudentVO[10] :  StudentVO 클래스를 10개 복제해 사용할 수 있도록 메모리를
		//                      준비하라
		// new StudentVO() 생성자 메서드와 다른 명령형식
	      StudentVO[] stVO = new StudentVO[10];
	      
	      // 선언된 객체를 사용할 수 있도록 초기화작업을 수행
	      /*
	       * 선언된 요소에 접근을 하려면 요소의 index를 기준으로 참조해야한다
	       * 
	       * stVO[0] : stVO 배열의 0번 위치에 있는 요소에 접근하겠다라는 시작
	       */
	      
	      /*
	       * 현시점에서 stVO 배열은 10개의 메모리 장소를 사용하겠다 라고 선언만 된 상태
	       * stVO의 각 멤버 변수에 접근을 시도하면 아직 stVO 요소들이 초기화가 되지 ㅏㅇㄶ아
	       * exception(실행오류 ; run time error) 발생한다
	       */
	      stVO[0].strNum = "001";
	      stVO[0].strName = "홍길동";
	      
	      System.out.println(stVO[0].strName);
	     // stVO[1] = new StudentVO();
	      
	     // stVO
	      
	      

	      
	      
	      
	}

}
