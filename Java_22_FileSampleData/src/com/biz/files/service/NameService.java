package com.biz.files.service;

public interface NameService {

	public void readNameList(String nameFile) throws Exception;
	
	public void readFamList(String famFile) throws Exception;
	
	public void writeNameFile(String korNameFile) throws Exception;
}
