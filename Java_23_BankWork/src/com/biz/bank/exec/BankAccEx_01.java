package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankAccServiceV1;

public class BankAccEx_01 {

	public static void main(String[] args) {

		BankAccServiceV1 bs = new BankAccServiceV1("0001",100000);
		Scanner scan = new Scanner(System.in);
	
		while(true) {
		System.out.println("=========================================");
		System.out.println("대한은행 계정계 v1.0");
		System.out.println("=========================================");
		System.out.println("1.조회2.입금3.출금0.종료");
		System.out.println("-----------------------------------------");
		System.out.print("업무선택 >>");
		String strMenu = scan.nextLine();
		int intMenu = Integer.valueOf(strMenu);
		if(intMenu == 0)break;
		else if(intMenu == 1) {
			bs.viewAcc();
		}else if(intMenu == 2) {
			bs.input();
			
		}else if(intMenu == 3) {
			bs.output();
		}
		}//while end
		System.out.println("수고하셨습니다");
		
	}

}
