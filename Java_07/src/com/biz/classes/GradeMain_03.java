package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_03 {

	public static void main(String[] args) {

		//grade01 객체의 멤버 변수 값을 setting
		// 변수에 값을 저장
		// 학생 7명 성적처리 객체 선언 생성 초기화 
		//----------------------------------------
		GradeVO grade01 = new GradeVO();
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		GradeVO grade06 = new GradeVO();
		GradeVO grade07 = new GradeVO();
		
		// 성적입력 -------------------------------
		grade01.strNum = "001";
		grade01.strName = "홍길동";
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		grade02.strNum = "002";
		grade02.strName = "이몽룡";		
		grade02.intKor = 78;
		grade02.intEng = 88;
		grade02.intMath = 66;
				
		grade03.strNum = "003";
		grade03.strName = "성춘향";		
		grade03.intKor = 98;
		grade03.intEng = 78;
		grade03.intMath = 68;
		
		grade04.strNum = "004";
		grade04.strName = "변학도";		
		grade04.intKor = 32;
		grade04.intEng = 74;
		grade04.intMath = 78;
		
		grade05.strNum = "005";
		grade05.strName = "심학수";		
		grade05.intKor = 67;
		grade05.intEng = 99;
		grade05.intMath = 65;
		
		grade06.strNum = "006";
		grade06.strName = "심청";		
		grade06.intKor = 66;
		grade06.intEng = 78;
		grade06.intMath = 28;
		
		grade07.strNum = "007";
		grade07.strName = "김콩쥐";		
		grade07.intKor = 90;
		grade07.intEng = 98;
		grade07.intMath = 98;
		
		//결과를 리스트로 출력-----------------------
		System.out.println("===============================================");
		System.out.println("응용SW반 성적표");
		System.out.println("-----------------------------------------------");
		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 총점");
		System.out.println("-----------------------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		grade04.gradeList();
		grade05.gradeList();
		grade06.gradeList();
		grade07.gradeList();
	
		System.out.println("-----------------------------------------------");
		
		

	}

}
