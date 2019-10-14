package com.biz.exam.service;

import java.util.List;

import com.biz.exam.domain.BBsVO;

public interface BBsviewServiceIMP {

	public void setBBsList(List<BBsVO> bbsList);
	public void viewBBS();
	public void viewBBS(String subject);
	public void viewBBS(int sDate, int eDate);
	public void viewBBs(boolean sort);
}
