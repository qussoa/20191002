package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV2 {

	FileReader fileReader = null;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		while(true) {
			int al = fileReader.read();
			if(al < 0) break;
			System.out.print((char)al);
	
		}
			}
}
