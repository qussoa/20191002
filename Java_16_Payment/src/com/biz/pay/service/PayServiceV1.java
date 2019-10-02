package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV1 {

	// 1. 화폐 권종을 배열로 선언 -> 화폐권종이 불규칙할 경우 사용
	private int[] money = new int[] {
			50000, 10000,5000,1000,500,100,50,10
	};
	
	public void array(int nPay) {
		DecimalFormat payform = new DecimalFormat("###,###,###,###");
		String strPay = payform.format(nPay);
		DecimalFormat paperForme = new DecimalFormat("###,###");
		System.out.println("======================================");
		System.out.printf("급여수령액 : %s 원\n",strPay);
		System.out.println("======================================");

		for(int i = 0; i< money.length; i++) {
			int nCount = nPay/money[i]; // 매수계산
			nPay = nPay - money[i]*nCount; // 권종 * 개수 -빼기
			System.out.printf("%8s 원권 %4d매\n", 
				paperForme.format(money[i]),nCount);
			}
		System.out.println("======================================");

	}
}
