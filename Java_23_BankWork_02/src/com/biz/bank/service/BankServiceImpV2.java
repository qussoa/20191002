package com.biz.bank.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankServiceImpV2 extends BankServiceImpV1 {

	@Override
	public void output() {
		// TODO 출금처리
		if (bookVO == null)
			return;

		System.out.print("출금액 : ");
		String strOutput = scan.nextLine();
		int intOutput = Integer.valueOf(strOutput);

		if (intOutput < 0) {
			System.out.println("출금액은 0원이상이어야함");
			return;
		}		
		if (bookVO.getBalance() < intOutput){
			System.out.println("잔액부족");
			return;
		}
		bookVO.setBalance(bookVO.getBalance()-intOutput);
			LocalDate localDate = LocalDate.now();
			DateTimeFormatter df = 
			DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String lastDate = localDate.format(df);
			bookVO.setLastDate(lastDate);
			bookVO.setRemark("출금");
		//System.out.printf("잔고 : %d\n", intBalance);

	}// output end

}
