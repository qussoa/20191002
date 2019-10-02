package com.biz.classes;
/*
 * 나는 Class_01 이름을 가진 클래스입니다
 * 클래스는 첫글자를 대문자로 시작하는 이름을 가져야합니다
 * 중간에 숫자 _를 포함할 수 있습니다
 * 빈칸이나 기타 특수 문자는 포함할 수 없습니다
 * 
 * 나는 3개의 method를 가지고 있으며,  첫글자는 소문자로 시작하는 이름을 가져야합니다
 * 변수명을 짓는 규칙과 같습니다
 * 
 * 더 많은 것을 가질 수 있고
 * 더욱 다양한 명령들을 묶어 포함할 수 있습니다
 * 내가 포함 method는 static이 없으므로 method를 실행하려면
 * 반드시 객체로 선언하고 생성해야합니다
 */
public class Class_01 {
	
	public String strMember = "나는 멤버 변수";

	public void method_01() {
		System.out.println("나는 method_01입니다");
		System.out.println(strMember);
	}
	public void method_01() {
		System.out.println("나는 method_02입니다");
		System.out.println("Class 01의 두번째 메서드입니다");
	}
	public void method_01() {
		System.out.println("나는 method_03입니다");
		System.out.println("우리나라만세");
		System.out.println("대한민국만세");
	}
}
