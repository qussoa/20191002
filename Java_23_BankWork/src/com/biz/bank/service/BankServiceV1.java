package com.biz.bank.service;

import java.util.Scanner;

public class BankServiceV1 {

	int intBalance = 0;
	String strAccNum = null;

	Scanner scan = null;

	public BankServiceV1() {
		scan = new Scanner(System.in);
	}

	public BankServiceV1(String strAccNum, int intBalance) {
		this.strAccNum = strAccNum;
		this.intBalance = intBalance;
		scan = new Scanner(System.in);
	}

	public Boolean viewAcc() {
		System.out.println("계좌조회");
		System.out.print("계좌번호>>");
		String strAccKeyIn = scan.nextLine();
		if (strAccKeyIn.equals(strAccNum)) {
			System.out.println("==============================");
			System.out.printf("계좌번호 : %s\n", strAccNum);
			System.out.printf("잔고 : %d\n", intBalance);
			System.out.println("==============================");

		} else {
			System.out.println("계좌번호 없음");
			return false;
		}
		return true;

	}// view end

	public void input() throws NumberFormatException {
		System.out.println("입금처리");
		System.out.print("입금액>>");
		String strInput = scan.nextLine();
		int intInput = Integer.valueOf(strInput);
		intBalance += intInput;
		System.out.printf("잔고 : %s\n", intBalance);
	}

	public void output() throws NumberFormatException {
		System.out.println("출금처리");
		System.out.println("==============================");
		System.out.print("출금액 >>");
		String strOutput = scan.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		if (intBalance >= intOutput) {
			intBalance -= intOutput;
		} else {
			System.out.println("잔액부족 출금거부");
		}
		System.out.printf("잔고 : %s\n", intBalance);
	}
}
