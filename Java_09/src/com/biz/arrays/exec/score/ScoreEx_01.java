package com.biz.arrays.exec.score;
/*
 * ScoreEx_01 클래스에서는 ScoreVO  클래스를 객체로 선언한 후 멤버 변수의 값을 저장하는 코드가 
 * 만들어져 있다 
 * 
 * 이때 ScoreVO 클래스 입장에서 ScoreEx_01 class를 외부 class라 취급한다
 * ScoreVO를 이용해서 무언가 코드를 수행하는 곳들(클래스 메서드) ScoreVO의 외부라고 한다 
 */
import java.util.Random;

import com.biz.arrays.model.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {

	// 1. 선언된 sVO 각 요소 초기화 임의 값  setting
		ScoreVO[] sVO = new ScoreVO[20];
		Random rnd = new Random();
		
   // 2. 각 과목별 점수를 생성		
		for(int i = 0; i <sVO.length; i++) {
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			String strNum = String.format("%03d",i+1);
		
  //  			
			sVO[i] = new ScoreVO();
			sVO[i].strNum = strNum;
			sVO[i].intKor = intKor;
			sVO[i].intEng = intEng;
			sVO[i].intMath = intMath;
			
			// int intSum = intKor + intEng + intMath;
			//int intSum = intKor;
			//intSum += intEng;
			//intSum += intMath;
			
			// ScoreVO.intSum 멤버변수는 접근제한자를 private를 선언했기에 외부에서 접근할 수 없다
			//sVO[i].intSum = intSum;
		}
		
		System.out.println("=======================");
		System.out.println("학번\t총점");
		for(int i = 0; i <sVO.length; i++)
		{System.out.printf("%s\t%d\n",
				sVO[i].strNum,sVO[i].sum());
	}
		System.out.println("-----------------------");
	}
}
