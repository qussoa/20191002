package com.biz.bank.service;

import java.util.Scanner;

import com.biz.bank.domain.BankAccVO;

/*
 * 1개의 계좌에 대한 처리를 수행할 클래스
 */
public class BankAccServiceV1 implements BankAccService {

	BankAccVO bankAccVO;
	Scanner scan;

	public BankAccServiceV1(String strNum, int intBalance) {

		bankAccVO = new BankAccVO();
		scan = new Scanner(System.in);
		bankAccVO.setNum(strNum);
		bankAccVO.setBalance(intBalance);
	}

	@Override
	public boolean viewAcc() {
		System.out.print("계좌번호 : ");
		// 키보드에서 입력
		String strAccNum = scan.nextLine();
		if (!strAccNum.equals(bankAccVO.getNum())) {
			System.out.println("계좌번호 오류");
			return false;
		}
		System.out.println("=========================");
		System.out.println("계좌번호 : " + bankAccVO.getNum());
		System.out.println("최종잔액 : " + bankAccVO.getBalance());
		System.out.println("최종거래 : " + bankAccVO.getDate());
		System.out.println("비고 : " + bankAccVO.getRemark());
		System.out.println("=========================");
		return true;
	}// viewAcc end

	@Override
	public void input() {
		if (this.viewAcc()) {
			System.out.println("입금액"); // 키보드에서 입금액 입력받기
			String strInput = scan.nextLine();
			int intInput = Integer.valueOf(strInput);

			bankAccVO.setBalance(bankAccVO.getBalance() + intInput);
		}

		// 입력받은 입금액의 총장액 합
	}// input end

	@Override
	public void output() {
		if (this.viewAcc()) {
			System.out.println("출금액");
			String strOutput = scan.nextLine();
			int intOutput = Integer.valueOf(strOutput);

			int intBalance = bankAccVO.getBalance();
			if (intBalance >= intOutput) {
				intBalance -= intOutput;
				bankAccVO.setBalance(intBalance);
			}
		}
		// 키보드에서 출금액 받기
		// 총잔액과 출금액 비교 총잔액>= 총금액이면
		// 입력받은 출금액을 총잔액에서 감산
	}// output end

	@Override
	public void bankBookList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeAccBook(String bookFileName) {
		// TODO Auto-generated method stub
		
	}
}
