package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV2 {

	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		// 1.buffer의 readLine()은 파일에서 한줄(\n)을 읽는다
		// 2.반복실행시 다음 줄의 문자열 읽는다 
		// 3.파일에 저장된 문장의 줄 수 만큼 반복 실행시 모든 파일의 내용을
		//   읽는다
		while(true) {
			String reader = buffer.readLine();
			if(reader == null) break;
			System.out.println(reader);
			
		}
		buffer.close();
		fileReader.close();
	}
	
}
