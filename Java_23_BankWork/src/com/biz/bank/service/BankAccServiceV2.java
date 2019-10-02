package com.biz.bank.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankAccVO;

public class BankAccServiceV2 implements BankAccService {

	Map<String, BankAccVO> bankList;
	BankAccVO bankAccVO;
	Scanner scan;
	FileWriter fileWriter;
	PrintWriter fileOut;

	public BankAccServiceV2() {
		bankList = new TreeMap<String, BankAccVO>();
		scan = new Scanner(System.in);

		// 계좌 생성
		for (int i = 0; i < 10; i++) {
			String strNum = String.format("%04d", (i + 1));

			// 계좌를 담을 vo 생성
			BankAccVO bVO = new BankAccVO();
			bVO.setNum(strNum);
			bVO.setBalance(1000000);
			bVO.setDate("2019-09-23");
			bVO.setRemark("신규");

			bankList.put(strNum, bVO);
		}
	}// 생성자 end

	@Override
	public boolean viewAcc() throws Exception {
		System.out.print("계좌번호 : ");
		String strNum = scan.nextLine();

		bankAccVO = bankList.get(strNum);// 필드변수
		// 만약 strNum 계좌가 bankList에 있으면 계좌정보가 bankAccVO에 담길것이고
		// 그렇지 않으면 null값이 담길 것이다
		if (bankAccVO != null) {
			System.out.println("=================================");
			System.out.println("계좌번호" + bankAccVO.getNum());
			System.out.println("최종잔액" + bankAccVO.getBalance());
			System.out.println("거래일자" + bankAccVO.getDate());
			System.out.println("구분" + bankAccVO.getRemark());
			System.out.println("=================================");
		} else {
			System.out.println("계좌정보없음");
		}
		return false;
	}// viewAcc end

	@Override
	public void input() throws Exception {
		/*
		 * 멤버변수 영역에 선언된 변수 -> field 라고도 부름 프로젝트가 실행되어 작동되는 동안 값을 유지하고 있음
		 */
		this.viewAcc();
		if (bankAccVO != null) {
			System.out.print("입금액 : ");
			String strInput = scan.nextLine();
			int intInput = Integer.valueOf(strInput);

			int intBalance = bankAccVO.getBalance();
			intBalance += intInput;
			bankAccVO.setBalance(intBalance);
			bankAccVO.setRemark("입금");

			Date date = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = sd.format(date);
			bankAccVO.setDate(strDate);
		} else {
			System.out.println("계좌정보 없음");
		}

	}// input end

	@Override
	public void output() throws Exception {
		this.viewAcc();
		if (bankAccVO != null) {
			System.out.print("출금액 : ");
			String strOutput = scan.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			int intBalance = bankAccVO.getBalance();

			if (intBalance >= intOutput) {
				intBalance -= intOutput;
				bankAccVO.setBalance(intBalance);
				bankAccVO.setRemark("출금");

				Date date = new Date();
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				String strDate = sd.format(date);
				bankAccVO.setDate(strDate);
			} else {
				System.out.println("잔액부족 출금불가");
			}

		}
	}// output end

	public void bankBookList() {
		Set<String> keySets = bankList.keySet();

		System.out.println("==============================");
		System.out.println("계좌\t잔액\t거래일자\t구분");
		System.out.println("------------------------------");
		for (String s : keySets) {
			System.out.print(bankList.get(s).getNum() + "\t");
			System.out.print(bankList.get(s).getBalance() + "\t");
			System.out.print(bankList.get(s).getDate() + "\t");
			System.out.print(bankList.get(s).getRemark() + "\n");

		}
		System.out.println("==============================");

	}

	public void writeAccBook(String strBookFile) {

		Set<String> keySets = bankList.keySet();
		try {

			fileWriter = new FileWriter(strBookFile);
			fileOut = new PrintWriter(fileWriter);
			for (String s : keySets) {
				fileOut.printf("%s:%d:%s:%s\n", bankList.get(s).getNum(), bankList.get(s).getBalance(),
						bankList.get(s).getDate(), bankList.get(s).getRemark());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileOut.close();

	}
}
