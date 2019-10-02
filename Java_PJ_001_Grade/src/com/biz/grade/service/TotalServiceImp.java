package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.grade.GradeVO;
import com.biz.grade.ScoreVO;

public class TotalServiceImp implements TotalService {

	List<GradeVO> gradeList;
	List<ScoreVO> scoreList;

	public TotalServiceImp() {
		gradeList = new ArrayList<GradeVO>();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void input(int size) {
		GradeVO gVO = new GradeVO();
		ScoreVO sVO = new ScoreVO();
		for (int i = 0; i < size; i++) {
			if (gradeList.get(i).getStrNum().equalsIgnoreCase(gVO.getStrNum()));
				
				break;
		}
	}
	@Override
	public void view() {
		
	}

}
