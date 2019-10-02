package com.biz.classes.user;

public class Exec_New_01 {

	public static void main(String[] args) {

		//add() static method이다
		User_01.add();
		//1. User_New_01 class를 un객체로 선언
		//2. new User_New_01() : 생성자 메서드를
		//   un 객체로 사용할 수 있도록 초기화  
 		User_New_01 un = new User_New_01();
 		
 		un.add();
 		/*
 		 * 어떤 class에 있는 method에 static 키워드가 붙어 있으면
 		 * 클래스.method()형식으로 호출하여 사용가능하지만
 		 * 
 		 * static키워드가 없는 method는 객체를 생성하여 객체.method() 형식으로
 		 * 호출해야한다
 		 * 
 		 * 이때 객체는 클래스의 대리자 역할을 한다
 		 */
 		
		
	}

}
