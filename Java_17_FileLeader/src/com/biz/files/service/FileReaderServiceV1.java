package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {

	FileReader fileReader = null;
	
	/*
	 * 만약 read(String file Name) method가 실행되는 동안 exception이 발생하면
	 * read() method를 호출한 곳으로 exception으로 toss하라
	 */
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		while(true) {
			int al = fileReader.read();
			if(al < 0) break;
			System.out.printf("%05d : %c\n",al, al);
	
		}
			}
}
