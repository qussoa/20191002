package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrServiceImpV2 implements AddrService {

	private List<AddrVO> addrList;

	@Override
	public void input() {
		
		addrList = new ArrayList<AddrVO>();
		
		AddrVO aVO = new AddrVO();
		aVO.setStrName("홍길동");
		aVO.setStrTel("010-1111-1111");
		aVO.setStrAddr("광주");
		aVO.setStrEmail("qussoa@naver.com");
		aVO.setStrHP("010-0111-1100");
		addrList.add(aVO);

		aVO = new AddrVO();
		aVO.setStrName("이몽룡");
		aVO.setStrTel("010-2222-2222");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("qussoa@naver.com");
		aVO.setStrHP("010-0111-1100");
		addrList.add(aVO);

		aVO.setStrName("성춘향");
		aVO.setStrTel("010-3333-3333");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("qussoa@naver.com");
		aVO.setStrHP("010-4444-1100");
		addrList.add(aVO);

	}

	@Override
	public void list() {
		System.out.println("================================================================");
		System.out.println(" 주  소  록  ");
		System.out.println("================================================================");
		System.out.println("이름\t전화\t        주소\tEmail\t                핸드폰");
		System.out.println("----------------------------------------------------------------");
		int nSize = addrList.size();
		for(int i = 0; i < nSize; i++) {
			System.out.printf("%s\t",addrList.get(i).getStrName());
			System.out.printf("%s\t",addrList.get(i).getStrTel());
			System.out.printf("%s\t",addrList.get(i).getStrAddr());
			System.out.printf("%s\t",addrList.get(i).getStrEmail());
			System.out.printf("%s\n",addrList.get(i).getStrHP());
		}
		System.out.println("================================================================");
	
	}

	@Override
	public void view(int num) {
		if(num > addrList.size()-1) {
			System.out.println("데이터가 없음");
			return;
		}
		
		AddrVO aVO = addrList.get(num);
		System.out.println("이름 : " + aVO.getStrName());
		System.out.println("전화 : " + aVO.getStrTel());
		System.out.println("주소 : " + aVO.getStrAddr());
		System.out.println("Email : " + aVO.getStrEmail());
		System.out.println("핸드폰 : " + aVO.getStrHP());

	}

}
