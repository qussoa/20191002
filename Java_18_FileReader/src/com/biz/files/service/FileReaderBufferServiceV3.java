package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV3 {

	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = "";
		// reader 값이 null이기 때문에 실행이 안된다
		/*
		while(reader != null) {
			reader = buffer.readLine();
			if(reader == null) break;
			System.out.println(reader);
		}
		*/
		do {
			reader = buffer.readLine();
			System.out.println(reader);
		}while(reader != null);
		// 먼저 do를 실행후 while 조건식을 검사
		// -> 마지막 값인 null값이 나올 수 있다
		
		buffer.close();
		fileReader.close();
	}
	
}
