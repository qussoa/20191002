package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_04 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/files/data4.txt";
		FileWriter fileWriter = null;
		PrintWriter fileOut = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			fileOut = new PrintWriter(fileWriter,true);
			
			fileOut.println("우리나라만세");
			fileOut.println(30*40);
			fileOut.println(200 % 2);
			
			fileOut.printf("%5d\n",30+40);
			fileOut.print("Republic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
