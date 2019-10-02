package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankBookVO;
import com.biz.bank.util.BankInfo;

public class BankServiceImpV1 implements BankService {

	Map<String, BankBookVO> bankBookList = null;
	BankBookVO bookVO = null;
	Scanner scan = null;

	String bookFile;

	PrintWriter fileOut = null;

	public BankServiceImpV1() {

		bankBookList = new TreeMap<String, BankBookVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void readBook(String bookFile) throws Exception {
		// TODO 잔고원장 파일을 읽어서 리스트로 생성

		this.bookFile = bookFile;
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);

		String reader = new String();

		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] books = reader.split(":");
			String strNum = books[BankInfo.BOOK.NUM];
			String strBalance = books[BankInfo.BOOK.BALANCE];
			String strLastDate = books[BankInfo.BOOK.LAST_DATE];
			String strRemark = books[BankInfo.BOOK.REMARK];

			int intBalance = Integer.valueOf(strBalance);

			BankBookVO bookVO = new BankBookVO();
			bookVO.setNum(strNum);
			bookVO.setBalance(intBalance);
			bookVO.setLastDate(strLastDate);
			bookVO.setRemark(strRemark);

			bankBookList.put(strNum, bookVO);

			// Debugging code
			// bookVO 값을 확인하는 코드
			//System.out.println(bookVO.toString());

		} // while end
		buffer.close();
		fileReader.close();
	}// readBook end

	// 키보드로 계좌번호를 입력받아
	// 계좌번호가 list에 있으면 계좌정보(VO)를 추출하여 임시보관하기
	@Override
	public void viewAcc() {
		// TODO 계좌정보조회

		System.out.print("계좌번호 : ");
		String strNum = scan.nextLine();
		// bankBookList에서 strNum 값을 조회하고
		// 결과를 bankBookVO에 담기
		// BankBookVO bookVO = bankBookList.get(strNum);
		// bankBookList에서 추출된 bookVO를 입,출금 처리 method에서
		// 사용할수 있도록 멤버변수 영역으로 이동

		bookVO = bankBookList.get(strNum);

		// 계좌정보가 담기는 경우 : strNum 계좌가 list에 있을떄
		// null이 담기는 경우 : strNum 계좌가 list에 없을때
		if (bookVO == null) {
			System.out.println("계좌정보가 없음");
		}

	}// viewAcc end

	@Override
	public void input() throws Exception {
		// TODO 입금처리

		this.viewAcc();// 계좌조회

		// 앞에서 조회한 계좌정보고 유효한지 검사
		if (bookVO == null)
			return;

		System.out.print("입금액 : ");
		String strInput = scan.nextLine();
		int intInput = Integer.valueOf(strInput);

		// this.bookWriter(strInput);

		if (intInput < 0) {
			System.out.println("입금액은 0원이상이어야함");
			return;
		}

		int intBalance = bookVO.getBalance();
		intBalance += intInput;
		bookVO.setBalance(intBalance);

		// 거래 일자 구분 값 추가
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String lastDate = sd.format(date);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark(BankInfo.REMARK.INPUT);
		
		this.accListWrite(BankInfo.REMARK.INPUT,intInput);

		this.bookWriter(bookFile);
	}// input end

	@Override
	public void output() throws Exception {
		// TODO 출금처리
		this.viewAcc();
		if (bookVO != null) {
			System.out.print("출금액 : ");
			String strOutput = scan.nextLine();
			int intOutput = Integer.valueOf(strOutput);

			// this.bookWriter(strOutput);

			if (intOutput > 0) {
				int intBalance = bookVO.getBalance();
				if (intBalance >= intOutput) {
					intBalance -= intOutput;
					bookVO.setBalance(intBalance);
					// System.out.printf("잔고 : %d\n", intBalance);
					LocalDate ld = LocalDate.now();
					DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					String lastDate = df.format(ld);
					bookVO.setLastDate(lastDate);
					bookVO.setRemark(BankInfo.REMARK.OUTPUT);
					
					this.accListWrite(BankInfo.REMARK.OUTPUT, intOutput);
				} else {
					System.out.println("잔액부족 출금거부");
				}
			} else {
				System.out.println("출금액은 0이상이어야함");
			}

		}
		this.bookWriter(bookFile);
	}// output end

	/*
	 * 입출금이 완료되는 순간 bookFile에 변동내역저장
	 */
	@Override
	public void bookWriter(String bookFile) throws Exception {
		// TODO 원장정보파일저장
		Set<String> keySet = bankBookList.keySet();

		fileOut = new PrintWriter(bookFile);
		for (String s : keySet) {
			fileOut.printf("%s:%d:%s:%s\n", bankBookList.get(s).getNum(), bankBookList.get(s).getBalance(),
					bankBookList.get(s).getLastDate(), bankBookList.get(s).getRemark()
					);
			fileOut.flush();
		}
		fileOut.close();
	}

	/*
	 * 어떤 계좌에서 입금이나 출금이 발생하면 내역을 계좌번호 파일에 저장
	 */
	@Override 
	public void accListWrite(String remark, int money) throws Exception {
		// TODO 거래내역파일 저장
		
		
		
		FileWriter fileWriter;
		PrintWriter accbook;
		String strAccPath = "src/com/biz/bank/books/";
		String accBookFile = String.format("BOOK%s", bookVO.getNum());
		
		fileWriter = new FileWriter(strAccPath + accBookFile,true);
		accbook = new PrintWriter(fileWriter);
		
		int intBalance = bookVO.getBalance();
		String lastDate = bookVO.getLastDate();
		
		int intInput = 0;
		int intOutput= 0;
		intInput = money;
		if(remark.equals(BankInfo.REMARK.OUTPUT)) {
			intInput = 0;
			intOutput = money;
		}
		String strWriter = String.format("%s:%s%d:%d:%d", lastDate,remark,intInput,intOutput,intBalance);
		accbook.println(strWriter);
		accbook.flush();
		accbook.close();
		fileWriter.close();
		}
	
}
