package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader만으로 text 파일 읽기 시도시 OS와 JVM, App 사이의 
 * 데이터 이동이 과다되어 비효율적이며, 소실될 위험이 크다
 * 
 * -> 기존 방식 대신 중간 완충장치를 두어 안전하게 읽을 수 있도록 하고 있다
 * 
 * Java -> BufferedReader => FileReader와 BufferedReader를 연결하여 
 *                           안전을 유도
 * 
 */
public class FileReaderBufferServiceV1 {

	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		// FileReader 객체에 담긴 파일읽기 정보를 buffered에게 주입
		
		String reader = buffer.readLine();
		// buffer(~\n) 한줄씩 읽기 
	}
	
}
