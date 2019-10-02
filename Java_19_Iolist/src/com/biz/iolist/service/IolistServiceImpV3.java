package com.biz.iolist.service;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV3 extends IolistServiceImpV2{

	public void list() {
		this.list_header();
		int intITotalSum = 0;
		int intOTotalSum = 0;
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrPName()+"\t");
			
			int intIO = Integer.valueOf(vo.getStrIO());
			int intIPrice = 0;
			int intOPrice = 0;
			String strIoTitle = "매출";
			
			if(intIO == 1) {
				intIPrice = vo.getIntPrice();
				strIoTitle = "매입";
				}else {
					intOPrice = vo.getIntPrice();
				}
			

			System.out.print(strIoTitle+"\t");
			System.out.print(vo.getIntPrice()+"\t");
			System.out.print(vo.getIntQty()+"\t");
			
			int intITotal = intIPrice * vo.getIntPrice();
			int intOTotal = intOPrice * vo.getIntPrice();
			//System.out.printf("%8d\t",intIPrice*vo.getIntQty());
			//System.out.printf("%8d\t",intOPrice*vo.getIntQty());
			System.out.printf("%8d\t",intITotal);
			System.out.printf("%8d\n",intOTotal);
			
			intITotalSum += intITotal;
			intOTotalSum += intOTotal;
		
			
		}
		
		System.out.println("===========================================================");
		System.out.printf("합계\t\t\t\t\t\t%15d\t%15d",intITotalSum,intOTotalSum);
	}
	
protected void list_header() {
	System.out.println("===========================================================");
	System.out.println("매입매출정보");
	System.out.println("===========================================================");
	System.out.println("거래일자\t상품명\t\t구분\t단가\t수량\t매입금액\t매출단가");
	System.out.println("-----------------------------------------------------------");
}
}
