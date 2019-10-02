package com.biz.pay;
/*
 * 화폐매수계산
 */
		
public class Payment {

	public static void main(String[] args) {

		int pay = 3785870;
		int mo = 50000;
		
		int count  = (int)(pay/mo); //5만원 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;     // 5만원 매수 제외
		//만원권 매수 제외
		
		mo = mo/5;
		count = (int)(pay/mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;
		
		mo = mo/2;
		count = (int)(pay/mo);
		pay = pay - count * mo;
		System.out.println(mo + "원권 : " + count); // 만원권 제외
	
		mo = mo/5;
		count = (int)(pay/mo);
		pay = pay - count * mo;
		System.out.println(mo + "원권 : " + count); // 오천원권 제외
		
		mo = mo/2;
		count = (int)(pay/mo);
		pay = pay - count * mo;
		System.out.println(mo + "원권 : " + count); // 천원권 제외 
	
		mo = mo/5;
		count = (int)(pay/mo);
		pay = pay - count * mo;
		System.out.println(mo + "원권 : " + count); // 오백원 제외
	
		mo = mo/2;
		count = (int)(pay/mo);
		pay = pay - count * mo;
		System.out.println(mo + "원권 : " + count); // 백원 제외
		System.out.println(pay);
		
		mo = mo/5;
		count = (int)(pay/mo);
		pay = pay - count * mo;
		System.out.println(mo + "원권 : " + count); //오십원 제외
		System.out.println(pay);
		
		mo = mo/2;
		count = (int)(pay/mo);
		pay = pay - count * mo;
		System.out.println(mo + "원권 : " + count); //십원 제외
		System.out.println(pay);
		
		mo = mo/5;
		count = (int)(pay/mo);
		pay = pay - count * mo;
		System.out.println(mo + "원권 : " + count); //오원제외
		System.out.println(pay);
	}

}
