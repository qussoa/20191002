package com.biz.pay.service;

public class PayServiceV5 extends PayServiceV4 {

	public void forPay(int nPay) {

		this.headerView(nPay);
		for (int i = 0; nPay>1 ; i++) {
			int nCount = nPay / nMoney;
			nPay -= nCount * nMoney;
			System.out.printf("%8s 원권 %4d매\n", paperForme.format(nMoney), nCount);
			if (i % 2 == 0) {
				nMoney /= 5;
			} else {
				nMoney /= 2;
			}//if
		}//for
		System.out.println("======================================");

	}
}
