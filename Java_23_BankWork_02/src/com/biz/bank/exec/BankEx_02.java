package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImpV1;

public class BankEx_02 {

	public static void main(String[] args) {

		BankService bs = new BankServiceImpV1();
		Scanner scan = new Scanner(System.in);

		String bookFile = "src/com/biz/bank/활빈당은행잔고원장.txt";

		try {
			/*
			 * 파일에서 원장을 읽은 후 업무를 진행하는 과정에서
			 * 만약 어떤 원인으로 app이 중단되면 
			 * 수행할 동안 입,출금의 내용이 메모리에만 남기때문에 소실 
			 * app이 새로 시작하면 처음으로 다시 데이터가 초기화된다
			 * 
			 * 입출금이 발생하는 순간 원장정보를 저장하여 
			 * 언제든지 app을 새로 시작하면 이전 업무 수행 다음부터 
			 * 진행할 수 있도록 기록
			 * 
			 *  - 반복문 내에서의 업무 선택 전에 원장을 읽어 리스트를 생성하는
			 *    일을 수행한다 
			 */

			while (true) {

				bs.readBook(bookFile);
				System.out.println("==============================================");
				System.out.println("활빈당 종합 은행 v1");
				System.out.println("==============================================");
				System.out.println("1.원장리스트2.계좌조회3.입금4.출금5.종료");
				System.out.println("----------------------------------------------");
				System.out.print("선택 : ");
				String strMenu = scan.nextLine();
				int intMenu = Integer.valueOf(strMenu);
				if (intMenu == 0)
					break;
				else if (intMenu == 1) {
					// bs.bookList();
				} else if (intMenu == 2) {
					bs.viewAcc();
					
				} else if (intMenu == 3) {
					bs.input();
				} else if (intMenu == 4) {
					bs.output();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan.close();
	}

}
