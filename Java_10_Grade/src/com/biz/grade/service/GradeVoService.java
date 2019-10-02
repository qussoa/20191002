package com.biz.grade.service;

import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeVoService {

	private GradeVO[] gradeVO;

	Random rnd = new Random();

	public GradeVoService(int length) {

		gradeVO = new GradeVO[length];

		for (int i = 0; i < gradeVO.length; i++) {
			gradeVO[i] = new GradeVO();
		}
		rnd = new Random();
	}// GradeVoService end

	// Random 이용
	public void input() {

		// gradeVO 객체 배열 수 만큼 반복
		for (int i = 0; i < gradeVO.length; i++) {

			String strNum = String.format(("%02d"), (i + 1));
			gradeVO[i].strNum = strNum;

			int intKor = rnd.nextInt(50) + 51;
			gradeVO[i].intKor = intKor;

			gradeVO[i].intEng = rnd.nextInt(50) + 51;
			gradeVO[i].intMath = rnd.nextInt(50) + 51;
		}
	}// input end

	public void total() {
		for (int i = 0; i < gradeVO.length; i++) {
			int intSum = gradeVO[i].intKor;
			intSum += gradeVO[i].intEng;
			intSum += gradeVO[i].intMath;
			gradeVO[i].intSum = intSum;
			gradeVO[i].intAvg = intSum / 3;

		}

	}// total end
	


	
	public void view() {
		
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal = 0;
		int intSumTotal = 0;
		int intAvgTotal = 0;
		
		System.out.println("=================================================");
		System.out.println("성적일람표");
		System.out.println("-------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < gradeVO.length; i++) {
			System.out.printf("%s\t", gradeVO[i].strNum);
			System.out.printf("%3d\t", gradeVO[i].intKor);
			System.out.printf("%3d\t", gradeVO[i].intEng);
			System.out.printf("%3d\t", gradeVO[i].intMath);
			System.out.printf("%5d\t", gradeVO[i].intSum);
			System.out.printf("%3d\t", gradeVO[i].intAvg);
			System.out.printf("%3s\n", gradeVO[i].intRank);
			
			intKorTotal += gradeVO[i].intKor;
			intEngTotal += gradeVO[i].intEng;
			intMathTotal += gradeVO[i].intMath;
			intSumTotal += gradeVO[i].intSum;
			intAvgTotal += gradeVO[i].intAvg;
			
		}
		System.out.println("=================================================");
	System.out.print("\t");
	System.out.printf("%3d\t",intKorTotal);
	System.out.printf("%3d\t",intEngTotal);
	System.out.printf("%3d\t",intMathTotal);
	System.out.printf("%5d\t",intSumTotal);
	System.out.printf("%3d\n",intAvgTotal/gradeVO.length);
	
	

		
	} // view end

	// 총점 기준 내림차순 정렬
	public void rank() {
		for (int i = 0; i < gradeVO.length; i++) {
			for (int j = i + 1; j < gradeVO.length; j++) {
				if (gradeVO[i].intSum < gradeVO[j].intSum) {

					// GradeVO 클래스 이용
					// _temp 임시객체 선언
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
				}
			}
		}//for end
		
		for(int i=0; i<gradeVO.length; i++) {
			gradeVO[i].intRank = i+1;
		}
	}// rank end
	
	public void sort() {
		for(int i = 0; i < gradeVO.length; i++) {
			for(int j = i+1; j<gradeVO.length; j++) {
				if(Integer.valueOf(gradeVO[i].strNum)
					>Integer.valueOf(gradeVO[j].strNum)) {
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
				}
			}
		}
	}//sort end
}
