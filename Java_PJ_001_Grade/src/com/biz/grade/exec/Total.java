package com.biz.grade.exec;

import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceImp;
import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp;

public class Total {

	public static void main(String[] args) {

		GradeService gs = new GradeServiceImp();
		ScoreService ss = new ScoreServiceImp();
		
		ss.input(3);
	}

}
