package com.biz.iolist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.iolist.model.IolistVO;

public class IolistServiceImpV1 implements IolistService {

	/*
	 * 접근제한자
	 * public : 제한없음
	 * private : 클래에서만 접근가능
	 * protected : private 특성을 가지면서 
	 *             현재 클래스를 상속한 곳에서만 접근가능
	 */
	// 리스트 저장소 선언
	protected List<IolistVO> iolist;

	// 생성자 method

	public IolistServiceImpV1() {

		iolist = new ArrayList<IolistVO>();

	}

	@Override
	public void input() {

		IolistVO iolistVO = new IolistVO();
		Random rnd = new Random();
		int intH = rnd.nextInt(5)+1;
		// 상품이름 "일반미 1호" 형식 생성

		String strPName = String.format("청정미 %d 호", intH);

		// 임의의 시간문자열 생성
		int intHour = rnd.nextInt(24);
		int intMin = rnd.nextInt(60);
		int intSec = rnd.nextInt(60);
		String strTime = String.format("%02d:%02d:%02d", intHour, intMin, intSec);

		// 임의의 수량생성
		int intQty = rnd.nextInt(30) + 10;
		
		iolistVO.setStrDate("2019-09-06");
		iolistVO.setStrTime(strTime);
		iolistVO.setStrPName(strPName);
		iolistVO.setIntPrice(intH * 1000);
		iolistVO.setIntQty(intQty);

		iolist.add(iolistVO);

	}

	@Override
	public void input(int count) {

		for (int i = 0; i < count; i++) {
			this.input();
		}
	}

	@Override
	public void total() {
		int nSize = iolist.size();
		for (int i = 0; i < nSize; i++) {
			IolistVO vo = iolist.get(i);
			int total = vo.getIntPrice()* vo.getIntQty();
			vo.setIntTotal(total);
		}
		for(IolistVO vo : iolist) {
			int total = vo.getIntPrice() * vo.getIntQty();
			vo.setIntTotal(total);
		}
	}

	@Override
	public void list() {

		System.out.println("====================================================================");
		System.out.println("판매 리스트");
		System.out.println("====================================================================");
		System.out.println("거래일자\t거래시각\t상품이름\t단가\t수량\t금액");
		System.out.println("--------------------------------------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrTime() + "\t");
			System.out.print(vo.getStrPName() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%d\t",vo.getIntQty());
			System.out.printf("%d\n",vo.getIntTotal());
		
		}
		System.out.println("====================================================================");

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
