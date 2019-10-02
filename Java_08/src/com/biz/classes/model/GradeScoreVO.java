package com.biz.classes.model;

/*
 * 학생의 성적처리에 사용할 VO클래스 디자인
 * prototype (코드) 작성
 * 객체를 생성하는 근본 코드
 * 
 * 성적처리를 위한 필요 데이터
 * 학번, 국어점수, 영어점수, 수학점수 
 * 총점, 평균
 * 
 * 총점과 평균을 제외한 나머지는 입력해야하는 데이터들은 멤버변수 선언
 *  
 */
public class GradeScoreVO {

	public String strNum;
	public int intKor;
	public int intEng;
	public int intMath;
	public int total;
	public float average;
	
	/*
	 * 과목점수의 합계를 계산한 후 total 멤버변수에 값을 저장해두자 
	 */
	public void total() {
		total = intKor + intEng + intMath;
	}
	/*
	 * 과목점수의 평균을 계산한 후 
	 * average 멤버 변수에 값을 저장해두자  
	 */
	public void average() {
		int sum = intKor + intEng + intMath;
		average = sum / 3.0f;
	}
	
}
