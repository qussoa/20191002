package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

public abstract class StudentViewServiceABS {

	private List<StudentVO> stdList;
	public abstract void view();
	public abstract void search(String strName);
	public abstract void search(int grGrade, int lessGrade);
	
	
}
