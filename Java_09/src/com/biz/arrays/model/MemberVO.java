package com.biz.arrays.model;

public class MemberVO {

	
	public String strName;
	public String strTel;
	
	/*
	 * MemberVO의 멤버 변수 중 intAge는 나이를 보관하는 변수
	 * -> 데이터의 값이 초과하게 되면 연산 수행에 문제 발생이 생길 수 있다
	 *   -> private로 선언 값을 method를 통해 저장하는 방법
	 */
	private int intAge;
	
	public int getIntAge() {
		return intAge;
				
	}
	// 외부에서 intAge 변수에 값을 할당할 때 
	public void setIntAge(int intAge) {
		
		if(intAge < 0) {
			System.out.println("나이는 0세 이상이어야 한다");
			return;
		}
		if(intAge > 120) {
			System.out.println("나이는 120세 이하이어야 한다");
			return;  
		}
		this.intAge = intAge;
		
	}
}
