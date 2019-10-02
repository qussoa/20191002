package com.biz.iolist.service;

public interface IolistService {

	//판매정보입력
	public void input();
	
	//여러데이터를 연속 입력하고자 할 때 
	//지정 처리하는 method
	public void input(int count);
	
	// 금액계산
	public void total();
	
	//리스트보기
	public void list();
	
	//1개정보
	public void view();
	
}
