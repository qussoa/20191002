package com.biz.grade;

import com.biz.grade.service.GradeVoService;

public class GradeVO_Ex_01 {

	public static void main(String[] args) {

		GradeVoService gs = new GradeVoService(20);
		gs.input();
		gs.total();
		gs.view();
		gs.rank();
		gs.view();
		gs.sort();
		gs.view();
		
		
		// test 임의의 숫자 저장
		int[] test = new int[10];
		
		//배열의 합계
		
		int intSum = 0;
		int intAvg = 0;
		for(int i = 0; i <test.length; i++) {
			intSum += test[i];
			
		}
		intAvg = intSum/test.length;
	}

}
