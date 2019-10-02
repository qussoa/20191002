package com.biz.files;

import java.io.FileNotFoundException;
/*
 * data.txt 파일을 읽어서 기억장치로 가져오려고 한다
 * 1. 운영체제 - data.txt 승인요청
 */
import java.io.FileReader;
import java.io.IOException;

public class FileEx_01 {

	public static void main(String[] args) {

		String file = "src/com/biz/files/data.txt";

		// FileReader 운영체제로부터 읽기 승인 요청하는 class
		// 읽고자하는 파일을 저장된 폴더의 경로까지
		// 문자열 형태로 전달하여 객체로 생성
		FileReader fileReader = null;

		// FileReader 클래스로 읽을 준비를 수행하는데
		/// 알수 없는 요인(삭제나 손상) 으로 읽기에 문제가 발생할 수 있다
		// -> FileNotFountceException이 발생할 확률이 높음
		// -> 반드시 try catch문을 사용 , 선언문과 생성문을 분리하는 이유; -> scope 해결
		try {
			fileReader = new FileReader(file);
			int alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
