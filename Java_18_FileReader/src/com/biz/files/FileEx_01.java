package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_01 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/files/data.txt";
		
		FileReader fileReader;
		
		try {
			fileReader = new FileReader(fileName);
			//file을 읽을 수 있도록 준비
			//fileReader 객체에는 파일을 읽는데 필요한 정보가 있음
			int intChar = fileReader.read();
			// fileReader 객체의 정보를 이용하여 한개의 문자를 읽어
			// ASCⅡ코드로 표시
			
			System.out.print(intChar);// 코드값을 십진수
			System.out.print(" : ");
			System.out.print((char)intChar);// 어떤 문자인가
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
