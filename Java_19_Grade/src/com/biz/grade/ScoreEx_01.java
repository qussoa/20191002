package com.biz.grade;

import com.biz.grade.service.ScoreServiceV1;

public class ScoreEx_01 {
public static void main(String[] args) {
	ScoreServiceV1 sc = new ScoreServiceV1();
	String scoreFileName = "src/com/biz/grade/score.txt";
	
	try {
		sc.read(scoreFileName);
		sc.listTotal();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
