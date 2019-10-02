package com.biz.string.service;

import java.util.List;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudentVO;

/*
 * ScoreServiceV1은 성적정보만 출력
 * 성적정보를 출력하면서 학번정보를 기준으로 학생이름을 같이 보여주는
 * list() method를 재정의하자
 */
public class ScoreServiceV2 extends ScoreServiceV1 {

	// List<StudentVO> stdList protected 상태로 상속받아 존재

	private List<StudentVO> stdList = null;

	@Override
	public void list() {

		System.out.println("====================================================================");
		System.out.println("성적일람표");
		System.out.println("====================================================================");
		System.out.println("학번\t이름\t주소\t전화\t국어\t영어\t수학\t총점\t평균");
		System.out.println("====================================================================");
		for (ScoreVO scVO : scList) {
			String strNum = scVO.getStrNum();
			StudentVO stVO = this.searchStd(strNum);
			String strName;
			String strAddr;
			String strTel;
			if (stVO == null) {
				strName = "(없음)";
				strAddr = "(없음)";
				strTel = "(없음)";
			} else {
				strName = stVO.getStrName();
				strAddr = stVO.getStrAddr();
				strTel = stVO.getStrTel();
			}
			System.out.print(scVO.getStrNum() + "\t");
			System.out.print(strName + "\t");
			System.out.print(strAddr + "\t");
			System.out.print(strTel + "\t");
			System.out.printf("%3d\t", scVO.getIntKor());
			System.out.printf("%3d\t", scVO.getIntEng());
			System.out.printf("%3d\t", scVO.getIntMath());
			System.out.printf("%3d\t", scVO.getIntTotal());
			System.out.printf("%3d\n", scVO.getIntAvg());

		}
		System.out.println("====================================================================");
	}

	// ScoreServiceV2 멤버변수로 선언된 stdList는
	// StudentService..에서 값이 세팅된 list이다
	// StudentService에서 세팅된 list를 ScoreService에서 사용하기위해
	// main() method에서 StudentService로부터 stdList를 getter하여
	// setstdList() method를 통해 ScoreService에 주입한다
	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}

	// 학번을 매개변수로 받고
	// stdList에 해당 학번의 학생정보 있는지 찾아서
	// StudentVO를 리턴해주는 method
	private StudentVO searchStd(String strNum) {

		for (StudentVO stVO : stdList) {
			if (stVO.getStrNum().equals(strNum))
				return stVO;
		}
		return null;

	}

}
