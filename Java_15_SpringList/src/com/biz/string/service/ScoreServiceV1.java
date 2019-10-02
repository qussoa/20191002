package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.string.domain.ScoreVO;

public class ScoreServiceV1 implements StringService {

	// scList를 상속받은 class에서 접근할수 있도록 일부개방
	protected List<ScoreVO> scList;
	private Random rnd;
	
	public ScoreServiceV1() {
		scList = new ArrayList<ScoreVO>();
		rnd = new Random();
	}
	@Override
	public void input() {

		for(int i = 0; i<10; i++) {
			String strNum = String.format("%05d", (i+1));
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			ScoreVO scVO = new ScoreVO();
			scVO.setStrNum(strNum);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			this.total(scVO);
			
			scList.add(scVO);
			
		}
	}
	
	private void total(ScoreVO sVO) {
		int total = sVO.getIntKor();
		total += sVO.getIntEng();
		total += sVO.getIntMath();
		
		sVO.setIntTotal(total);
		sVO.setIntAvg(total/3);
	}

	@Override
	public void list() {

		System.out.println("===============================================");
		System.out.println("성적표");
		System.out.println("===============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		for(ScoreVO sVO : scList) {
			System.out.printf("%3s\t",sVO.getStrNum());
			System.out.printf("%3d\t",sVO.getIntKor());
			System.out.printf("%3d\t",sVO.getIntEng());
			System.out.printf("%3d\t",sVO.getIntMath());
			System.out.printf("%3d\t",sVO.getIntTotal());
			System.out.printf("%3d\n",sVO.getIntAvg());
		}
		System.out.println("===============================================");

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
