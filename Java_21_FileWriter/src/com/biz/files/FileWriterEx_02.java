package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_02 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/files/data1.txt";
		
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("Korea\n");
			fileWriter.write("대한민국\n");
			fileWriter.write("우리나라\n");
			fileWriter.write(String.format("%05d\n", 1));
			fileWriter.write(String.format("합계 : %05d\n", 30+40));
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
