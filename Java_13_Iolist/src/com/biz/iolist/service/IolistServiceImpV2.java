package com.biz.iolist.service;

import com.biz.iolist.model.IolistVO;

public class IolistServiceImpV2 extends IolistServiceImpV1 {

	@Override
	public void list() {
		System.out.println("=================================================================");
		System.out.println("판매리스트");
		System.out.println("=================================================================");
		System.out.println("상품이름\t단가\t수량\t공급가액\t부가세\t공급대가");
		System.out.println("-----------------------------------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrPName() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%5d\t",vo.getIntQty());
			
			// 부가세별 금액 : 일반금액을 1.1로 나눈값
			int amt = (int)(vo.getIntTotal() / 1.1);
			// 부가가치세 = 일반금액 - 부가세별도 금액
			int vat =vo.getIntTotal()-amt;
			System.out.printf("%8d\t",amt);
			System.out.printf("%5d\t",vat);
			System.out.printf("%5d\n",vo.getIntTotal());
		}
		System.out.println("=================================================================");

	}

}
