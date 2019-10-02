package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PayVO;

public class PaperReadServiceV1 {

	FileReader fileReader;
	BufferedReader buffer;

	List<PayVO> fileList;

	public PaperReadServiceV1() {
		fileList = new ArrayList<PayVO>();
	}
	
	public List<PayVO> getFileList(){
		return fileList;
	}
	
	public void readFile(String fileName) throws Exception {
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		String reader = "";
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] file = reader.split(":");

			String files = String.format("%s:%s", file[0], file[1]);
			PayVO pVO = new PayVO();
			pVO.setNum(file[0]);
			pVO.setPay(Integer.valueOf(file[1]));
			fileList.add(pVO);
		}
		buffer.close();
		fileReader.close();

	}
}
