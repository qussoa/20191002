package com.biz.files;

import java.io.IOException;

import com.biz.files.service.FileReaderServiceV2;
/*
 * FileReader 클래스
 * text 파일을 직접읽어 문자단위를 CPU로 전송 연산 수행할시 사용
 * 
 * direct로 읽어 처리를 할때 파일 클시 처리속도가 느려짐
 */
public class FlieEx_04 {
	
public static void main(String[] args) {
	FileReaderServiceV2 fs = new FileReaderServiceV2();
	
	String fileName = "src/com/biz/files/data.txt";
	try {
		fs.read(fileName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} 

}
