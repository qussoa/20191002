package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV2 {

	List<PaperVO> paperList;

	public PaperMakeServiceV2() {
		paperList = new ArrayList<PaperVO>();
	}

	public List<PaperVO> getPaperList() {
		return paperList;
	}

	public void paper(int pay) {

		PaperVO pVO = new PaperVO();
		int paper = 50000;
		int sw = 1;
		
		String s = paper + "";
		int count = (int) (pay / paper);
		while (true) {
			if (pay < 5)
				break;
			System.out.printf("%8s 원권 %4d매\n", paper, count);
			if (sw > 0) {
				count /= 5;
			} else {
				count /= 2;
			}
			sw *= (-1);
			
		}
		pVO.setPaper(s);
		pVO.setCount(count);
		paperList.add(pVO);

	}
}
