package com.biz.files.grade;

import java.io.IOException;

import com.biz.files.service.FileGradeService;
import com.biz.files.service.FileGradeServiceV2;

public class GradeEx_02 {

	public static void main(String[] args) {

		FileGradeService fg = new FileGradeServiceV2();
		String scoreFile = "src/com/biz/files/Score.txt";
		try {
			fg.read(scoreFile);
			fg.total();
			fg.list();
		}catch(NumberFormatException e){
			System.out.println("데이터파일을 확인하시오");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
