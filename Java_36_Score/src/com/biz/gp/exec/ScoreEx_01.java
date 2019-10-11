package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.ScoreVO;

public class ScoreEx_01 {
	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();	
		
		ScoreVO scoreVO = new ScoreVO();

		ScoreVO scoreBVO = new ScoreVO.Builder()
				.s_num("001")
				.s_kor(90)
				.s_eng(80)
				.s_math(10).build();
		scList.add(scoreVO);
		
		scList.add(new ScoreVO.Builder()
				.s_num("002")
				.s_kor(90)
				.s_eng(80)
				.s_math(10).build());
		scList.add(new ScoreVO.Builder().s_num("003").s_kor(85).build());
		scList.add(new ScoreVO.Builder().s_num("004").s_kor(85).build());
		scList.add(new ScoreVO.Builder().s_num("005").s_kor(85).build());

	}
}
