package com.biz.bank.service;

public interface BankAccService {

	public boolean viewAcc() throws Exception;

	public void input() throws Exception;

	public void output() throws Exception;
	
	public void bankBookList();
	public void writeAccBook(String bookFileName);

}
