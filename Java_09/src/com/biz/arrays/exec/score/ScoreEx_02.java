package com.biz.arrays.exec.score;

import com.biz.arrays.model.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {

		ScoreVO sVO = new ScoreVO();
		
	// method단순호출 수행결과는 확인하지 않는다
  
		sVO.add();
		sVO.add_ret();
		
    // return 문이 있는 method의 호출하고 결과를 확인
	// add_ret() 가 return 한 num 변수의 값을 console에 보이는 코드
		
		System.out.println( sVO.add_ret() );
		
		int result = sVO.add_ret();	}

}
