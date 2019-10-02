package com.biz.sevice;

import com.biz.rev.GradeVO;

public class GradeService {

	public static void main(String[] args) {
		GradeVO[] gradeVO = new GradeVO[5];
		
	//gradeVO[1].setIntKor(92);
	//gradeVO[1].setIntEng(87);
	//gradeVO[1].setIntMath(65);
		
		int intKor = 92;
				gradeVO[1].setIntKor(intKor);
		int intEng = 87;
				gradeVO[1].setIntEng(intEng);
		int intMath = 65;
				gradeVO[1].setIntMath(intMath);
		
		int sum = gradeVO[1].getIntKor();
		sum += gradeVO[1].getIntEng();
		sum += gradeVO[1].getIntMath();
		
		System.out.println(sum);
	}

	
	
}
