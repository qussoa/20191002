package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PayVO;

public class PaperPrintServiceV1 {

	List<PayVO> fileList;

	public PaperPrintServiceV1() {

		fileList = new ArrayList<PayVO>();
	}
	
	public void setFileList(List<PayVO> fileList) {
		this.fileList = fileList;
	}	
	public void pay() {
		System.out.println("============================");
		System.out.print("사원번호  급여액\n");
		System.out.println("----------------------------");
		for(PayVO vo :fileList) {
			System.out.printf(vo.getNum()+"\t");
			System.out.println(vo.getPay()+"원");
			
			
		}
	}
}
