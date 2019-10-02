package com.biz.pay.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperWriterServiceV1 {

	List<PaperVO> paperList;
	PrintWriter fileOut;
	
	public PaperWriterServiceV1() {

		paperList = new ArrayList<PaperVO>();
		}
	
	public void setpaperList(List<PaperVO> paperList) {
		this.paperList = paperList;
	}
	public List<PaperVO> paperList(){
		return paperList;
	}
	public void paper(String fileName) throws Exception {
		fileOut = new PrintWriter(fileName);
		for(PaperVO pVO : paperList) {
			fileOut.print(pVO.getPaper());
			fileOut.println(pVO.getCount());
		}
		fileOut.flush();
		fileOut.close();
	}
	
}
