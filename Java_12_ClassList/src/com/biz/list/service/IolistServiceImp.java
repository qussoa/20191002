package com.biz.list.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.IolistVO;

public class IolistServiceImp {

	List<IolistVO> iolist;

	public IolistServiceImp() {
		iolist = new ArrayList<IolistVO>();
	}

	public void input() {
		IolistVO iolistVO;
		iolistVO = new IolistVO("2019-09-05", "14:00:55", "CJ햇반", 1500);
		iolist.add(iolistVO);
		iolistVO = new IolistVO("2019-09-05", "14:02:55", "CJ햇반", 1500);
		iolist.add(iolistVO);
		iolistVO = new IolistVO("2019-09-05", "14:03:55", "CJ햇반", 1500);
		iolist.add(iolistVO);
		iolistVO = new IolistVO("2019-09-05", "14:04:55", "CJ햇반", 1500);
		iolist.add(iolistVO);
		iolistVO = new IolistVO("2019-09-05", "14:00:55", "CJ햇반", 1500);
		iolist.add(iolistVO);

	}
public void total() {
	
	for(IolistVO vo : iolist) {
		int total = vo.getIntPrice() * vo.getIntQty();
		vo.setTotal(total);
	}
	int nSize = iolist.size();
	for(int i = 0; i < nSize; i++) {
		IolistVO vo = iolist.get(i);
		int total = vo.getIntPrice() * vo.getIntQty();
		vo.setTotal(total);
	}

}
	public void list() {
		System.out.println("==========================================");
		System.out.println("거래내역");
		System.out.println("==========================================");
		System.out.println("일자\t시각\t상품명\t단가\t수량\t합계");
		for (IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrTime() + "\t");
			System.out.print(vo.getStrPname() + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.print(vo.getIntQty() + "\t");
			System.out.print(vo.getTotal() + "\n");
		}
	}

	public void input(int count){
		
		IolistVO iolistVO;
		Random rnd = new Random();
		
		for(int i =0; i <count; i++) {
			
			String strTime = String.format("14:00:%02d", i);
			int intH = rnd.nextInt(5)+1;
			String strPname = String.format("일만빈 %d 호", intH);
			int intQty = rnd.nextInt(30)+10;
			iolistVO = new IolistVO("2019-09-05", strTime,
					strPname, 1000*intH, intQty);
				iolist.add(iolistVO);
		}
		
		
	}
	

	}


