package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx_01 {

	public static void main(String[] args) {
		String fileName = "src/com/biz/files/data3.txt";
		FileWriter fileWriter;
		BufferedWriter buffer;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			buffer.write("우리나라만세\n");
			buffer.write("우리나라만세\n");
			
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
