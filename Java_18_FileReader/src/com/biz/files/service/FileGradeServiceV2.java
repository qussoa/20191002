package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.biz.files.domain.ScoreVO;

public class FileGradeServiceV2 extends FileGradeServiceV1 {

	@Override
	public void read(String fileName) throws IOException {
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;
			System.out.println(reader);
		} // while end
		buffer.close();
		fileReader.close();
	}// read end
	
	@Override
	public void total() {
		for(ScoreVO vo : scoreList) {
			
			int intTotal = vo.getIntKor();
			intTotal += vo.getIntEng();
			intTotal += vo.getIntMath();
			
			vo.setIntTotal(intTotal);
			vo.setIntAvg(intTotal/3);
			
	
		}//for end
	}// total end
	
	public void list() {

		System.out.println("=======================================");
		System.out.println("성적일람표");
		System.out.println("=======================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntEng()+"\t");
			System.out.print(vo.getIntMath()+"\t");
			System.out.print(vo.getIntTotal()+"\t");
			System.out.print(vo.getIntAvg()+"\n");
		}
		System.out.println("=======================================");
	}
	

}
