package com.biz.grade;

import com.biz.grade.service.GradeService;

public class Grade_03 {

	public static void main(String[] args) {

		// 생성자에게 임의의 수를 멤버 배열변수로 생성할 수 있게 준비단계
		GradeService gs = new GradeService(5);
		
		gs.input();
		gs.view();
		
	}

}
