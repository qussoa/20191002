package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PayVO;
import com.biz.pay.service.PaperPrintServiceV1;
import com.biz.pay.service.PaperReadServiceV1;

public class PayEx_05 {
	public static void main(String[] args) {
		PaperReadServiceV1 pr = new PaperReadServiceV1();
		PaperPrintServiceV1 pw = new PaperPrintServiceV1();

		String fileNmae = "src/com/biz/pay/급여리스트.txt";

		try {
			pr.readFile(fileNmae);
			List<PayVO> fileList = pr.getFileList();
			pw.setFileList(fileList);
			pw.pay();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
