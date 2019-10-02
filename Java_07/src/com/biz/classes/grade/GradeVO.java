package com.biz.classes.grade;
/*
 * dynamic class 다라고 정의를 하는데 dynamic 이라는 의미로 해석하면 어려움이 있다
 * 
 * static이 아닌 class라고 이해하자
 */
public class GradeVO {

	/*
	 * 객체의 정의
	 * 1. 연산의 통해서 얻을 수 없는 데이터 (학번, 이름, 과목, 점수 등) 변수로 정의 -> 멤버변수
	 * 2. 멤버 변수를 기초로 하여 연산을 통해서 얻을 수 있는 항목들을 위해 method를 정의
	 *     -> 멤버 method라고도 부름
	 * 3. 처리하고자 하는 대상을 객체로 정의하는 단계를 추상화라고 한다 
	 *    -> 추상화는 객체지향 언어를 이용한 프로그래밍에서 매우 중요한 개념이다   
	 */
	public String strNum;
	public String strName;
	public int intKor;
	public int intEng;
	public int intMath;
	

	public void gradeList() {
		// %d 정수(int long)
		// %f 실수 (float double)
		// %c 문자 (char)
		// %s 문자열 (string)
		System.out.printf(" %s\t %s\t %d\t %d\t %d\t %d\n"
				, strNum, strName, intKor, intEng, intMath,
				intKor + intEng + intMath);
	}
	public void sum() {
		int sum = intKor + intEng + intMath;
	System.out.println("총점 :" + sum);
	System.out.println("총점 : " + sum/3);
}

}
