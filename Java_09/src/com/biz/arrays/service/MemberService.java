package com.biz.arrays.service;

import com.biz.arrays.model.MemberVO;

public class MemberService {

	private MemberVO[] mVO;

	// 클래스의 생성자 method
	// return type 키워드가 없는 method
	// method의 이름이 클래스 이름과 같다
	// 클래스를 객체로 생성할때 자동으로 호출되어 실행되는 method

	public MemberService() {
		mVO = new MemberVO[10];
		for (int i = 0; i < mVO.length; i++) {
			mVO[i] = new MemberVO();
			mVO[i].strName = String.format("KO%03d", i);
		}
	}

	public MemberService(int length) {
		mVO = new MemberVO[length];
		for (int i = 0; i < mVO.length; i++) {
			mVO[i] = new MemberVO();
			mVO[i].strName = String.format("k-%05d", i);
			mVO[i].strTel = String.format("010-%04d-%04d", i + 1, i + 1);
		}
	}

	public MemberVO[] getMemberVO() {
		return mVO;
	}

	public void memberListView() {
		System.out.println("==============================");
		System.out.println("이름 \t전화번호");
		System.out.println("------------------------------");
		for (int i = 0; i < mVO.length; i++) {
			System.out.printf("%s\t%s\n", mVO[i].strName, mVO[i].strTel);
		}
		System.out.println("==============================");

	}

	

}
