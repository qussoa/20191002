package com.biz.files.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.files.domain.ScoreVO;

public class GradeServiceV1 implements GradeService {

	protected List<ScoreVO> scList = null;
	
	public GradeServiceV1() {
			
		scList = new ArrayList<ScoreVO>();		
	}
	
	public void makeScoreFile(String fileName,int length) throws Exception {
		
		Random rnd = new Random();
		
		for(int i = 0; i<length;i++) {
		String strNum = String.format("A%03d", i+1);
		int intKor = rnd.nextInt(50)+51;
		int intEng = rnd.nextInt(50)+51;
		int intMath = rnd.nextInt(50)+51;
		
		ScoreVO scVO = new ScoreVO();
		scVO.setNum(strNum);
		scVO.setKor(intKor);
		scVO.setEng(intEng);
		scVO.setMath(intMath);
		scList.add(scVO);
		}//for end
		
		PrintWriter fileOut = null;		
		fileOut = new PrintWriter(fileName);
		
		for(ScoreVO vo : scList) {
			fileOut.printf("%s:%d:%d:%d\n", 
					vo.getNum(),vo.getKor(),vo.getEng(),vo.getMath());
			fileOut.flush(); 
		}//for end
		fileOut.close();
		
	}//make end

	@Override
	public void readNameFile(String nameFile) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
