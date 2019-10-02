package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductServiceV2 {

	protected List<String> proNameList;
	protected List<String> productList;


	/*
	 * 1.과자이름.txt 파일이름을 proFileName 변수로 받기 2.proFileName 파일을 읽어서 과자이름 List 추가 3.임의의
	 * 숫자를 발생시켜 과자 가격을 부착하여
	 */
	public List<String> getProductList(String proFileName) throws Exception {

		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		proNameList = new ArrayList<String>();
		productList = new ArrayList<String>();
		
		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			if (reader.length() < 1)
				continue;

			proNameList.add(reader);
		
		}
		buffer.close();
		fileReader.close();
		
		
		for (String pro : proNameList) {
			int price = (int) (Math.random() * (5000 - 800)+800);
			price = (int) (Math.round((price/10)*10));
			String product = String.format("%s:%d", pro, price);
			
			productList.add(product);
		}
		return productList;
		
	}// end
}
