package com.biz.classes.grade;

/*
 * 어떤 클래스를 만들고 멤버 변수 메서드에 static이라는 키워드를 붙이면
 * 한개라도 static이라는 키워드를 붙이면 class가 static class가 된다
 * 
 * static class가 된다는 것  - 프로젝트를 RUN(컴파일 후 실행) JVM 자동으로
 * 클래스를 선언, 생성, 초기화하여 사용할 수 있도록 미리 준비시켜준다
 */
public class StaticGrade {

	//멤버변수
	public static String strNum;
	public static String strName;
	public static int intKor;
	public static int intEng;
	public static int intMath;
	
	// StaticGrade 클래스의 sum() 메서드의 몸체부분이다
	public static void sum() {
		
		int sum = intKor + intEng + intMath;
		System.out.println("총점 : " + sum);
	}
}
