package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 *  상품매입정보
 *  1. 날짜 : 2019-09-26
 *  2. 단가 : 상품단가에서 부가세를 제외한 금액
 *  3. 부가세 : (상품정보의 상품단가 ) - ( 2번에서 계산한 값) 단가
 *  4. 수량 : 10개부터 100개의 임의 수
 *  5. 합계 : 단가 * 수량
 *  
 *  생성된 매입정보를 20개 생성하여 
 *  buy리스트에 추가하기
 */
public class IolistService {

	protected List<BuyVO> buyList;
	protected List<String> proList;

	public void buyMake() {

		buyList = new ArrayList<BuyVO>();

		BuyVO buyVO = new BuyVO();

		LocalDate localDate = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String proDate = localDate.format(df);
		buyVO.setDate(proDate);

		Random rnd = new Random();
		int nSize = proList.size();
		
		for(int i = 0; i <20; i++) {
			
			int index = rnd.nextInt(nSize);
			String strProduct = proList.get(index);
			
			String[] pros = strProduct.split(":");

			buyVO.setProName(pros[0]);
			buyVO.setPrice(Integer.valueOf(pros[1]));

			int intPrice = Integer.valueOf(pros[1]);
			intPrice = (int)(intPrice/1.1);
			
			int intVat = buyVO.getPrice() - intPrice;
			int intQty = rnd.nextInt(90)+10;
			int intTotal = intPrice * intQty;

			buyVO.setPrice(intPrice);
			buyVO.setVat(intVat);
			buyVO.setTotal(intTotal);
			
			buyList.add(buyVO);
		}

		// buyVO.setPrice(price);

	}

	public void readProduct(String proWriteFile) throws Exception {

		proList = new ArrayList<String>();
		FileReader fileReader = new FileReader(proWriteFile);
		BufferedReader buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			if (reader.length() < 1)
				continue;

		}
		buffer.close();
		fileReader.close();

	}
}
