package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx_01 {

	public static void main(String[] args) {

		String imgFile = "src/com/biz/stream/2019_1.png";
		/*
		 * 파일을 byte 단위로 읽을 수 있는 class 
		 * text file, img file, avi file, mp3 file 등의 모든 파일을 읽을 수 있다
		 */
		
		// 1. Stream 클래스를 객체 선언할 때 null 값으로 초기화


		FileInputStream fs = null;
		
		try {
			// 2. 실제 파일을 오픈하여 읽을 준비
			fs = new FileInputStream(imgFile);
			int input = 0;
			while(true) {
				// 3. 1byte씩 읽어서 변수에 저장
				input = fs.read();
				if(input == -1 ) break;
				
				// input 변수에 담긴 값을 16진수로 표현
				System.out.printf("%02x\n",input);
			}//end
			// 4. 사용후 닫기
			fs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println("Hello Korea");
	}

}
