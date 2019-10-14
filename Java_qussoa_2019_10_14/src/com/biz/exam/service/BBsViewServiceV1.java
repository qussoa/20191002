package com.biz.exam.service;

import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsViewServiceV1 implements BBsviewServiceIMP {

	List<BBsVO> bbsList;

	@Override
	public void setBBsList(List<BBsVO> bbsList) {
		this.bbsList = bbsList;
	}

	public void title() {
		System.out.println("====================================================================================");
		System.out.println("게시판 관리 리스트");
		System.out.println("====================================================================================");
		System.out.println("순번\t작성자\t작성일자\t제목\t   내용\t                              조회수");
		System.out.println("------------------------------------------------------------------------------------");
	}

	public void body(BBsVO vo) {
		System.out.print(vo.getSeq() + "\t");
		System.out.print(vo.getAuth() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getSubjeck() + "\t");
		System.out.printf("%5s\t", vo.getText());
		System.out.printf("%8s\n", vo.getCount());
	}

	@Override
	public void viewBBS() {
		this.title();
		for (BBsVO vo : bbsList) {
			this.body(vo);
		}
		System.out.println("====================================================================================");

	}

	@Override
	public void viewBBS(String subject) {
		this.title();
		for (BBsVO vo : bbsList) {
			if (vo.getSubjeck().contains(subject)) {
				this.body(vo);
			}
		}

	}

	@Override
	public void viewBBS(int sDate, int eDate) {
		this.title();
		for (BBsVO vo : bbsList) {
			int grade = 0;
			if (grade >= sDate && grade <= eDate) {
				this.body(vo);
			}
		}
	}

	@Override
	public void viewBBs(boolean sort) {

		int temp = 0;
		// 옮겨줄 변수
		int count = 0;
		// vo.getCount를 넣을 변수
		int counts = count + 1;
		// 카운트에 +1한 변수
		for (BBsVO vo : bbsList) {
			// 확장 for를 이용해서 count를 불러온다
			count = Integer.valueOf(vo.getCount());
			// 문자열로 되어있는 count를 정수형으로 변환
			for (int i = 0; i > vo.getCount()+1; i++) {
				if (count > count+1) {
					// vo.getCount와 카운트에 +1을 한 변수를 비교한다
					temp = count;
					count = counts;
					counts = temp;
					// 비교를 위해 옮겨준다
					sort = false;
					// 이것이 거짓이면 내림차순
				}
			}
			if (!sort) {
				this.body(vo);
				// 아니면 오름차순
			}
		}

	}
}
