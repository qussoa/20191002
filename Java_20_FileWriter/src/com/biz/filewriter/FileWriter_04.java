package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_04 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName,true);
			String str = String.format("%s\n", "대한민국");
			fileWriter.write(str);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
