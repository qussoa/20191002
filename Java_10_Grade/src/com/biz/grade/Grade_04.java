package com.biz.grade;

import com.biz.grade.service.GradeServiceV3;

public class Grade_04 {

	public static void main(String[] args) {
		
		GradeServiceV3 gs = new GradeServiceV3(3);
		
		gs.input(); // 과목점수 입력
		gs.view();  // 점수 확인
		
		gs.sort();  // 내림차순 정렬
		gs.view();  // 정렬 후 점수 확인
		

		// gs.inputKor(); <- private 제한되어 있음
	}
}
