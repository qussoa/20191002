package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV2;
import com.biz.pay.service.PaperWriterServiceV1;

public class PayEx_04 {
	public static void main(String[] args) {

		PaperWriterServiceV1 pw = new PaperWriterServiceV1();
		PaperMakeServiceV2 ps = new PaperMakeServiceV2();
		String fileName = "src/com/biz/pay/화폐매수.txt";
		
		try {
			pw.paper(fileName);
			List<PaperVO> paperList = pw.paperList();
			
			pw.setpaperList(paperList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
