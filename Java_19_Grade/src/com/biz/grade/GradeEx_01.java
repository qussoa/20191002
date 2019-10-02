package com.biz.grade;

import java.util.Map;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.GradeServiceV1;
import com.biz.grade.service.ScoreServiceV1;
import com.biz.grade.service.StudentServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		StudentServiceV1 stService = new StudentServiceV1();
		ScoreServiceV1 scService = new ScoreServiceV1();
		
		String stdFileName = "src/com/biz/grade/학생명부.txt";
		String scoreFileName = "src/com/biz/grade/score.txt";
		
		try {
			stService.read(stdFileName);
			scService.read(scoreFileName);
			scService.total();
			scService.rank();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String,StudentVO> stdList = stService.getStdList();
		Map<String,ScoreVO> scList = scService.getScList();		
		
		GradeServiceV1 gs = new GradeServiceV1(); 		// 기본생성자를 호출 gs객체를 생성
		gs = new GradeServiceV1(scList);				// scList->gs객체생성 -> 초기화
		gs = new GradeServiceV1(scList,stdList);		// scList,stdList-> gs객체생성 -> 초기화
		
		gs.list();
		
	}

}
