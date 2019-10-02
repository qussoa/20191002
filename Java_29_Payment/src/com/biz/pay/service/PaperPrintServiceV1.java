package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperPrintServiceV1 {

	PayReadServiceV1 pr;
	PaperMakeServiceV1 pm;
	List<List<PaperVO>> paperAllList;

	String payFile;

	public PaperPrintServiceV1() {

		pr = new PayReadServiceV1();
		pm = new PaperMakeServiceV1();

	}

	public PaperPrintServiceV1(String payFile) {
		this();
		this.payFile = payFile;

	}

	public void setPayFile(String payFile) {
		this.payFile = payFile;
	}

	public void printPaper() throws Exception {
		// pr.readPay(this.payFile);
		// List<String> payStrList = pr.getPayStrList();

		String payPath = "src/com/biz/pay/";
		for (List<PaperVO> paperList : this.paperAllList) {

			PrintWriter fileOut = new PrintWriter(payPath + paperList.get(0).getMember());

			fileOut.println("=======================================");
			fileOut.print("사원번호 : " + paperList.get(0).getMember());
			fileOut.println(", 급여액 : " + paperList.get(1).getMember());
			fileOut.println("---------------------------------------");

			for (PaperVO pVO : paperList) {

				fileOut.printf("%s\t%d\n", pVO.getPaper(), pVO.getCount());
			}
			fileOut.close();
		}
	}

	public void viewPaper() throws Exception {

		for (List<PaperVO> paperList : this.paperAllList) {

			System.out.println("=======================================");
			System.out.print("사원번호 : " + paperList.get(0).getMember());
			System.out.println(", 급여액 : " + paperList.get(1).getMember());
			System.out.println("---------------------------------------");

			for (PaperVO pVO : paperList) {

				System.out.printf("%s\t%d\n", pVO.getPaper(), pVO.getCount());
			}
		}

	}

	public void makePaperList() throws Exception {
		pr.readPay(this.payFile);
		List<String> payStrList = pr.getPayStrList();
		paperAllList = new ArrayList<List<PaperVO>>();

		for (String pay : payStrList) {
			String[] pays = pay.split(":");
			int intPay = Integer.valueOf(pays[1]);
			pm.make(intPay);
			List<PaperVO> paperList = pm.getPaperList();
			paperList.get(0).setMember(pays[0]);
			paperList.get(1).setMember(pays[1]);
			paperAllList.add(paperList);

		}
	}
}
