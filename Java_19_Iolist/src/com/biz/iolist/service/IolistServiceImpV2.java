package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV2 implements IolistService {
	protected List<IolistVO> iolist;

	public IolistServiceImpV2() {
		iolist = new ArrayList<IolistVO>();
	}

	@Override
	public void read(String fileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		String reader = new String();

		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] ios = reader.split(":");
			IolistVO iosVO = new IolistVO();
			iosVO.setStrDate(ios[0]);
			iosVO.setStrPName(ios[1]);
			iosVO.setStrIO(ios[2]);
			iosVO.setIntPrice(Integer.valueOf(ios[3]));
			iosVO.setIntQty(Integer.valueOf(ios[4]));
			
		
			iolist.add(iosVO);
		} // while end
		buffer.close();
		fileReader.close();
	}// read end

	@Override
	public void list() {
		
		System.out.println("-----------------------------------------------------------");
		this.list_header();
		for (IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrPName() + "\t\t");
			// System.out.print(vo.getStrIO()+"\t");
			int intIO = Integer.valueOf(vo.getStrIO());
			String strIoTitle = "매출";
			int intIPrice = 0;
			int intOPrice = 0;
			if (intIO == 1) {
				intIPrice = vo.getIntPrice();
				strIoTitle = "매입";
			} else {
				intOPrice = vo.getIntPrice();
			}
			System.out.print(strIoTitle + "\t");
			System.out.printf("%8\t", intIPrice);
			System.out.printf("%8\t", intOPrice);
			System.out.printf("%8\n", vo.getIntQty());
		} // for end
		System.out.println("===========================================================");

	}

	protected void list_header() {
		System.out.println("===========================================================");
		System.out.println("매입매출정보");
		System.out.println("===========================================================");
		System.out.println("거래일자\t상품명\t구분\t단가\t매출단가\t수량");
	}

	@Override
	public void summany() {
		// TODO Auto-generated method stub

	}

}
