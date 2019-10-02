package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankServiceV1;

public class BankExec_02 {

	public static void main(String[] args) {

		BankServiceV1 bs = null;
		
		Scanner scan = new Scanner(System.in);

		String strAccNum = "0001";
		int intBalance = 100000;
		
		bs = new BankServiceV1(strAccNum,intBalance);
		
		while(true) {
			System.out.println("==============================");
			System.out.println("광한루 은행");
			System.out.println("==============================");
			System.out.println("1.조회2.입금3.출금0.종료");
			System.out.println("------------------------------");
			System.out.print("선택>>");
			String strMenu = scan.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			if(intMenu == 0) break;
			else if(intMenu == 1) {
				bs.viewAcc();
			}else if(intMenu == 2) {
			if(bs.viewAcc()) {
				bs.input();
				System.out.println("계좌없음");
				return;			                                                                                         
			}
			}else if(intMenu == 3) {
				bs.viewAcc();
				bs.output();
			}
		}
		System.out.println("업무종료");
		
	}

}
