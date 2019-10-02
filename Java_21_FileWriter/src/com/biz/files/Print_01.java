package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_01 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/files/data3.txt";
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			out = new PrintWriter(buffer);
			
			out.println("대한민국\n");
			out.printf("%5d", 100);
			out.print("우리나라");
			
			out.flush();
			out.println("대한민국\n");
			out.printf("%5d", 100);
			out.print("우리나라");
			
			out.close();
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
