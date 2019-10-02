package com.biz.keyinput;

import java.util.Scanner;

/*
 * 키보드로 무언인가 입력하면 변수에 저장하고 저장된 내용을 console 표시
 * 
 * 컴퓨터와 사용자간의 상호 주고받기
 * Interactive, 대화형 프로젝트
 */
public class KeyInput_01 {

	public static void main(String[] args) {

		/*
		 * Scanner 키보드에서 무엇인가를 입력하면
		 *         내용을 수신하여 문자열로 변환시켜주는 class
		 * Scanner class 직접 어떤 일을 수행할 수 없고 반드시 변수 선언해줘야 한다
		 */
		//Scanner 클래스를 scanner 변수로 선언
	Scanner scanner;
	
	/*
	 * 기본형 변수, Primitive type 변수
	 * 첫글자가 소문자인 키워드로 선언한 변수
	 */
	     int iNum;
	     long lNum;
	     float fNum;
	     double dNum;
	     boolean bYes;
	     char cA;
	     
	     /*
	      * 참조형 변수, type 변수 class 키워드를 이용해서 선언한 변수
	      * (첫글자가 대문자인 형태)
	      * 
	      *  객체 (object)라고 한다
	      *  st와 sc 
	      *  
	      *  객체의 특징 
	      *  1. 객체. method() 형태의 다양한 기능들이 class로부터 물려받아 사용가능
	      *    st.length(), st.toUpperCase()
	      *    
	      *    객체를 명명할 때 변수의 규칙과 같은 문법 적용
	      *    객체 이름은 class이름의 첫글자를 소문자로 하여 작성한다
	      */
	     String st;
	     Scanner sc;
	

	
	}

}
