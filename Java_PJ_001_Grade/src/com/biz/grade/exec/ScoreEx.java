
package com.biz.grade.exec;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImpV2;

public class ScoreEx {

	public static void main(String[] args) {
		
		ScoreService ss = new ScoreServiceImpV2();
			
		ss.input(10);
		ss.total();
		ss.rank();
		ss.list();
	}
}
