package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_03 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(fileName);
			while(true) {}//while end
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
