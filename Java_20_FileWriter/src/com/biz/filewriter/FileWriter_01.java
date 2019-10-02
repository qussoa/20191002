package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_01 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/filewriter/data.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("대한민국만세");
			fileWriter.write(97);
			for(int i = 97; i<124;i++) {
				fileWriter.write(i);
			}
			fileWriter.write(13);
			for(int i ='A';i<='Z';i++) {
				fileWriter.write(i);
			}
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
