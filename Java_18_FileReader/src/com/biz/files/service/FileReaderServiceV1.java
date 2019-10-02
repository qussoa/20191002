package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {

	FileReader fileReader;
	
	// read() method가 실행될 때 오류가 발생시 read()method가 호출한곳으로
	// 이동하라
	public void read(String fileName) throws IOException {

		fileReader = new FileReader(fileName);
		
		// 전체 파일을 읽기 위해 while() 반복문 사용
		while(true) {
			int intReadChar = fileReader.read();
			
			if(intReadChar < 0) break;   //if(intReaderChar == -1)사용해도 되나
										//if(intReaderChar < 0 )이 더 안전함
			
			System.out.print((char)intReadChar);
		}
		fileReader.close();  // 파일을 읽고 난후 resource를 절약하는 코딩
	}
}
