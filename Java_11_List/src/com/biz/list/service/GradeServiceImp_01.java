package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.GradeVO;

public class GradeServiceImp_01 implements GradeService {

	private List<GradeVO> gradeList;
	
	Random rnd;
	
	public GradeServiceImp_01() {
		gradeList = new ArrayList<GradeVO>();
		
		rnd = new Random();
		
	}// GS end
	
	// GradeVO gradeList 추가 코드
	// input() method 호출시 설정값을 받고 값만큼 생성 gradeList 추가
	public void input(int size) {
		
		for(int i = 0; i < size; i++) {
			
			String strNum = String.format("%05d", (i+1));
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			GradeVO gVO = new GradeVO();
			gVO.strNum = strNum;
			gVO.intKor = intKor;
			gVO.intEng = intEng;
			gVO.intMath = intMath;
			
			gradeList.add(gVO);
		}
		
	}//input end
	
	public void total() {
		
		int nSize = gradeList.size();
		for(int i = 0; i < nSize; i++) {
			
			int total = gradeList.get(i).intKor;
			total += gradeList.get(i).intEng;
			total += gradeList.get(i).intMath;
			
			gradeList.get(i).intTotal = total;
			gradeList.get(i).intAvg = total / 3;
		}
		
	}//total end
	
	public void view() {
		System.out.println("=====================================================");
		System.out.println("성적일람표");
		System.out.println("=====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("-----------------------------------------------------");
		for( GradeVO  vo : gradeList) {
			System.out.printf("%5s\t",vo.strNum);
			System.out.printf("%3d\t",vo.intKor);
			System.out.printf("%3d\t",vo.intEng);
			System.out.printf("%3d\t",vo.intMath);
			System.out.printf("%3d\t",vo.intTotal);
			System.out.printf("%3d\t",vo.intAvg);
			System.out.printf("%3d\n",vo.intRank);
		}
		System.out.println("=====================================================");
	}// view end
	
}
