package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_03 {
	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data2.txt";
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(fileName,false);
			fileWriter.write("우리나라\n");
			fileWriter.write("대한민국\n");
			fileWriter.write("Republic of Korea\n");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
