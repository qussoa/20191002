package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV1 {

	List<PaperVO> paperList;

	public List<PaperVO> getPaperList(){
		return this.paperList;
	}
	
	public void make(int pay) {
		paperList = new ArrayList<PaperVO>();
		int paper = 50000;
		int sw = 1;
		while (true) {
			if(pay<5) break;
			int paperCount = (int) (pay / paper);
			pay -= (paper*paperCount);
			PaperVO pVO = new PaperVO();
			pVO.setPaper(paper + "");
			pVO.setCount(paperCount);

			paperList.add(pVO);
			if (sw > 0) {
				paper /= 5;
			} else {
				paper /= 2;
			}
			sw *= (-1);
			
			
		}
	}
}
