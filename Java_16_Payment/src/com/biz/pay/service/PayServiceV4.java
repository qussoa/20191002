package com.biz.pay.service;

public class PayServiceV4 extends PayServiceV2 {

	

	@Override
	public void whilePay(int nPay) {
		
		this.headerView(nPay);
		int intSw =1;
		
			while (nPay > 1) {
				//if (nPay < 5)	break;
				int nCount = nPay / nMoney; // 매수 계산
				nPay -= nCount * nMoney; // nPay = nPay - nCount*nMoney
				System.out.printf("%8s 원권 %4d매\n", paperForme.format(nMoney), nCount);
				if (intSw == 1) {
					nMoney /= 5;
				} else {
					nMoney /= 2;
				}
				intSw = intSw * (-1);
			}
			System.out.println("======================================");


		}
}
