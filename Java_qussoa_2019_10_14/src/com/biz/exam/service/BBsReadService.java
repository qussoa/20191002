package com.biz.exam.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;

import com.biz.exam.domain.BBsVO;

public class BBsReadService {

	List<BBsVO> bbsList;
	
	public BBsReadService() {
		bbsList = new ArrayList<BBsVO>();
	}
	
	public List<BBsVO> getBBsList(){
		return this.bbsList= bbsList;
	}
	public void readBBs(String bbsFile) throws IOException {
		FileReader fileReader = new FileReader(bbsFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		String reader = new String();
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			String[] bbs = reader.split(":");
			BBsVO bVO = new BBsVO();
			bVO.setSeq(Integer.valueOf(bbs[0]));
			bVO.setAuth(bbs[1]);
			bVO.setDate(Integer.valueOf(bbs[2]));
			bVO.setSubjeck(bbs[3]);
			bVO.setText(bbs[4]);
			bVO.setCount(Integer.valueOf(bbs[5]));
			bbsList.add(bVO);
		}
		buffer.close();
		fileReader.close();				
	}
	
}
