package com.biz.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fileWriter;
		BufferedWriter buffer;
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			String str = String.format("%20s\n", "Republic of Korea");
			
			buffer.write(str);
			buffer.flush();
			buffer.write("1234☆");
			
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
