package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Getter;
@Getter

public class StudentReadServiceV1 {

	private List<StudentVO> stdList;
	
	public void readStudent(String fileName) throws IOException {
		
		stdList = new ArrayList<StudentVO>();	
		FileReader fileReader = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			String[] std = reader.split(":");
			stdList.add(StudentVO.builder()
					.s_num(std[0])
					.s_name(std[1])
					.s_tel(std[2])
					.s_grade(Integer.valueOf(std[3]))
					.s_addr(std[4]).build());
			
		}
		buffer.close();
		fileReader.close();
		
	}
}
