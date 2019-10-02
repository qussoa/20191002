package com.biz.bank.service;

/*
 * 1.잔고원장(파일)으로부터 계좌정보리스트를 가져와서 
 * 2. 각 계좌별로 입,출금 수행하고
 * 3. 다시 잔고원장에 입,출금 반영
 */
public interface BankService {

	//잔고원장으로부터 계좌들의 잔고 리스트를 가져와
	//리스트 생성
	public void readBook(String bookFile) throws Exception;
	
	//계좌번호를 입력받아 정보(잔액,최종거래일자 등등)를 보여주는 method
	public void viewAcc();
	
	// 조회된 계좌번호에 해당하는 계좌에 키보드로부터 입금액을 입력받아
	// 입금처리 수행
	public void input()throws Exception;
	
	// 출금처리
	public void output()throws Exception;
	
	//입출금완료되었을때 원장정보를 업데이트하는 method
	public void bookWriter(String bookFile) throws Exception;
	
	//각 계좌별 입출금 내역을 파일에 저장하자
	public void accListWrite(String remark, int money) throws Exception;
}
