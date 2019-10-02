package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV2 extends PayServiceV1 {
	
	protected int nMoney = 50000;
	protected DecimalFormat paperForme = new DecimalFormat("###,###");
	/*
	 * while 반복문으로 구현
	 */
	public void whilePay(int nPay) {
		
		int intSw = 0;
		
		this.headerView(nPay);
		while (true) {
			if (nPay < 5)
				break;
			int nCount = nPay / nMoney; // 매수 계산
			nPay -= nCount * nMoney; // nPay = nPay - nCount*nMoney
			System.out.printf("%8s 원권 %4d매\n", paperForme.format(nMoney), nCount);
			if (intSw == 0) {
				nMoney /= 5;
				intSw = 1;
			} else {
				nMoney /= 2;
				intSw = 0;
			}
		}
		System.out.println("======================================");


	}

	protected void headerView(int nPay) {

		DecimalFormat payform = new DecimalFormat("###,###,###,###");
		String strPay = payform.format(nPay);

		System.out.println("======================================");
		System.out.printf("급여수령액 : %s 원\n", strPay);
		System.out.println("======================================");

	}
}
