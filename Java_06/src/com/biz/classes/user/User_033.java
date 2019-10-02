package com.biz.classes.user;

public class User_033 {
	/*
	 * class의 변수 영역(scope)
	 * class 멤버변수 영역
	 * 
	 * class변수 영역에 선언된 변수는 최초의 한번 count 호출 될때
	 * 선언, 생성 초기화된 후 코드가 실행이 되지 않는다
	 * 
	 * 이 코드에서 count()가 호출되면 nCount는 1씩 증가되도록 되어 있다
	 * 프로젝트가 실행되는 동안 count()를 호출하면 nCount가 1씩 증가되고 
	 * 결과 값이 console에 표시된다
	 */
	public static int nCount = 0;
	public static void count() {
 
		// count() 호출될 때마다 nCount 새로 생성 0으로 clear
		//int nCount = 0;
		nCount++;
		System.out.println(nCount + "번째 호출");
	}

}
