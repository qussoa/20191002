package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_01 {
	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data1.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
