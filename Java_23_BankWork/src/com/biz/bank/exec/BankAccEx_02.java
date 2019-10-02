package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankAccService;
import com.biz.bank.service.BankAccServiceV2;

public class BankAccEx_02 {

	public static void main(String[] args) {

		BankAccService bs = new BankAccServiceV2();
		Scanner scan = new Scanner(System.in);
		String strBookFile = "src/com/biz/bank/계좌원장.txt";

		while (true) {
			System.out.println("=================================");
			System.out.println("한국은행 계정계 v2.0");
			System.out.println("=================================");
			System.out.println("1.조회2.입금3.출금4.전체조회0.종료");
			System.out.println("---------------------------------");
			System.out.print("업무선택 : ");
			String strMenu = scan.nextLine();
			int intMenu = Integer.valueOf(strMenu);

			try {
				if (intMenu == 0) {
					//BankAccServiceV2 bs2 = (BankAccServiceV2) bs;
					//bs2.writeAccBook(strBookFile);
					bs.writeAccBook(strBookFile);
					break;
				}

				else if (intMenu == 1)
					bs.viewAcc();
				else if (intMenu == 2)
					bs.input();
				else if (intMenu == 3)
					bs.output();
				else if (intMenu == 4) {
					//((BankAccServiceV2)bs).bankBookList();
				bs.bankBookList();
				}					
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		scan.close();
		System.out.println("업무종료");
	}

}
