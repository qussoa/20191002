package com.biz.classes.grade;

import java.util.Scanner;

/*
 * 한 학생의 성적정보를 입력받은 후 GradeVO 클래스 객체에 저장하고
 * 입력된 정보를 콘솔에 확인해보자
 */
public class GradeEx_01 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("=============================");
	System.out.println("성적 정보 입력");
	System.out.println("-----------------------------");
	System.out.print("학번 : ");
	String strNum = scanner.nextLine();
	System.out.print("이름 : ");
	String strName = scanner.nextLine();
	System.out.print("국어 : ");
	String strKor = scanner.nextLine();
	System.out.print("영어 : ");
	String strEng = scanner.nextLine();
	System.out.print("수학 : ");
	String strMath = scanner.nextLine();
	
	GradeVO grade = new GradeVO();
	
	grade.strNum = strNum;
	grade.strName = strName;
	//strKor에는 문자열형 숫자가 담겨있다. -> scanner.nextLine() 키보드로 입련한 모든 것을
	                                       // 문자열로 변환하여 입력받기 떄문
	grade.intKor = Integer.valueOf(strKor);
	grade.intEng = Integer.valueOf(strEng);
	grade.intMath = Integer.valueOf(strMath);
	
	grade.sum();
	}

}
