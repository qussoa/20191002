package com.biz.pay;

import com.biz.pay.service.PayServiceV5;

public class PaymentEx_03 {

	public static void main(String[] args) {

		PayServiceV5 ps = new PayServiceV5();
		int nPay = 415468148;
		
		//ps.array(nPay);
		//ps.whilePay(nPay);
		ps.forPay(nPay);
	}

}
