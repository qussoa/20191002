package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.grade.ScoreVO;

public class ScoreServiceImp implements ScoreService {

	protected Random rnd;
	protected List<ScoreVO> scoreList;

	public ScoreServiceImp() {
		rnd = new Random();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void input(int size) {
		for (int i = 0; i < size; i++) {
			ScoreVO sVO = new ScoreVO();
			String strNum = String.format("%04d", (i + 1));
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;

			sVO.setStrNum(strNum);
			sVO.setIntKor(intKor);
			sVO.setIntEng(intEng);
			sVO.setIntMath(intMath);

			scoreList.add(sVO);

		}

	}

	@Override
	public void total() {

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			int intTotal = scoreList.get(i).getIntKor();
			intTotal += scoreList.get(i).getIntEng();
			intTotal += scoreList.get(i).getIntMath();

			scoreList.get(i).setIntTotal(intTotal);
			scoreList.get(i).setIntAvg(intTotal / 3);

		}
	}

	public void rank() {
		for (int i = 0; i < scoreList.size(); i++) {
			for (int j = i + 1; j < scoreList.size(); j++) {

				int total_I = scoreList.get(i).getIntTotal();
				int total_J = scoreList.get(j).getIntTotal();

				if (total_I < total_J) {
					ScoreVO _vo = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, _vo);
				}
			}
		}
		int intRank = 1;
		for (ScoreVO vo : scoreList) {
			vo.setIntRank(intRank++);
		}
	}

	@Override
	public void list() {

		System.out.println("===========================================");
		System.out.println("점수표");
		System.out.println("===========================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("-------------------------------------------");
		for (ScoreVO vo : scoreList) {
			System.out.printf("%5s\t", vo.getStrNum());
			System.out.printf("%5d\t", vo.getIntKor());
			System.out.printf("%5d\t", vo.getIntEng());
			System.out.printf("%5d\t", vo.getIntMath());
			System.out.printf("%5d\t", vo.getIntTotal());
			System.out.printf("%5d\t", vo.getIntAvg());
			System.out.printf("%5d\n", vo.getIntRank());
		}
		System.out.println("===========================================");
	}

}
