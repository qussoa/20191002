package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_01 {

	public static void main(String[] args) {

		//grade01 객체의 멤버 변수 값을 setting
		// 변수에 값을 저장
		GradeVO grade01 = new GradeVO();
		grade01.strNum = "001";
		grade01.strName = "홍길동";

		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		System.out.println("001 학생의 성적");
		System.out.println("국어 : " +grade01.intKor);
		System.out.println("수학 : "+grade01.intMath);
		System.out.println("영어 : " +grade01.intEng);
		
		int intSum = grade01.intKor+grade01.intEng+grade01.intMath;
		System.out.println("총점 : " + intSum);
		
		GradeVO grade02 = new GradeVO();
		grade02.strNum = "002";
		grade02.strName = "이몽룡";
		
		grade02.intKor = 78;
		grade02.intEng = 88;
		grade02.intMath = 66;
		
		System.out.println("002 학생의 성적");
		System.out.println("국어 : " +grade02.intKor);
		System.out.println("수학 : "+grade02.intMath);
		System.out.println("영어 : " +grade02.intEng);
		
		int intSum02 = grade02.intKor+grade02.intEng+grade02.intMath;
		System.out.println("총점 : " + intSum02);
		
		GradeVO grade03 = new GradeVO();
		grade03.strNum = "003";
		grade03.strName = "이몽룡";
		
		grade03.intKor = 98;
		grade03.intEng = 78;
		grade03.intMath = 68;
		
		System.out.println("003 학생의 성적");
		System.out.println("국어 : " +grade03.intKor);
		System.out.println("수학 : "+grade03.intMath);
		System.out.println("영어 : " +grade03.intEng);

		
		int intSum03 = grade03.intKor+grade03.intEng+grade03.intMath;
				System.out.println("총점 : " + intSum03);
	}

}
