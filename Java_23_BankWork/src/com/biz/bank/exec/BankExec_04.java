package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankServiceV2;

public class BankExec_04 {

	public static void main(String[] args) {

		BankServiceV2 bs = null;

		Scanner scan = new Scanner(System.in);

		String strAccNum = "0001";
		int intBalance = 100000;

		bs = new BankServiceV2(strAccNum, intBalance);

		while (true) {
			System.out.println("==============================");
			System.out.println("광한루 은행");
			System.out.println("==============================");
			System.out.println("1.조회2.입금3.출금0.종료");
			System.out.println("------------------------------");
			System.out.print("선택>>");
			String strMenu = scan.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			if(intMenu == 0) {
				System.out.println("업무종료");
				break;
			}
			/*
			 * switch(문자열, 숫자, 문자등) 가능
			 * 문자열일 경우 문제 가능성이 있음
			 */
			switch (intMenu ) {
			case 1:
				System.out.println("계좌조회");
				break;
			case 2:
				System.out.println("입금처리");
				break;
			case 3:
				System.out.println("출금처리");
				break;
			case 0:
				System.out.println("업무종료");
				break;

			}
		//	System.out.println(" 업무종료");
		}
		
	}
}
