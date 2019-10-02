package com.biz.files.exec;

import com.biz.files.service.GradeService;
import com.biz.files.service.GradeServiceV2;

public class GradeEx_04 {
	public static void main(String[] args) {
		
		String nameFile = "src/com/biz/files/이름파일.txt";
		String studentFile = "src/com/biz/files/학생명부.txt";
		String scoreFile = "src/com/biz/files/성적일람표.txt";
		
		int intMens = 30;
		
		GradeService gs = new GradeServiceV2();
		
		try {
			gs.makeScoreFile(scoreFile, intMens);
			gs.readNameFile(nameFile);
			gs.makeStudentFile(studentFile, intMens);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("생성완료");
	}
}
