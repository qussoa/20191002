package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV2;

public class PayEx_02 {

	public static void main(String[] args) {

		PaperMakeServiceV2 ps = new PaperMakeServiceV2();
		ps.paper(4555555);
		
		List<PaperVO> paperList = ps.getPaperList();
	}

}
