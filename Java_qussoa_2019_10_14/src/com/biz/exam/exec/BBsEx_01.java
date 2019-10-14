package com.biz.exam.exec;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.exam.domain.BBsVO;
import com.biz.exam.service.BBsReadService;
import com.biz.exam.service.BBsViewServiceV1;

public class BBsEx_01 {
	public static void main(String[] args) {

		BBsReadService bs = new BBsReadService();
		BBsViewServiceV1 bv = new BBsViewServiceV1();

		Scanner scan = new Scanner(System.in);
		String bbsFile = "src/com/biz/exam/bbs.txt";

		try {
			bs.readBBs(bbsFile);
			List<BBsVO> bbsList = bs.getBBsList();
			bv.setBBsList(bbsList);
			bv.viewBBS();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			System.out.println("==========================================");
			System.out.println("게시판 관리 리스트 v1");
			System.out.println("==========================================");
			System.out.println("1.전체 2.제목 3.날짜 4.정렬 0.종료");
			System.out.print("검색 : ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if (intM == 0)
				break;
			if (intM == 1) {
				bv.viewBBS();
			} else if (intM == 2) {
				System.out.print("제목 검색 : ");
				String strSub = scan.nextLine();
				bv.viewBBS(strSub);
			} else if (intM == 3) {
				System.out.println("20191001~20191005");
				System.out.print("처음 날짜 : ");
				String stDate = scan.nextLine();
				System.out.print("마지막 날짜 : ");
				String eDate = scan.nextLine();
				try {
					bv.viewBBS(Integer.valueOf(stDate), Integer.valueOf(eDate));
				} catch (Exception e) {
					System.out.println("숫자로만 기입바랍니다");
				}
			} else if (intM == 4) {
				System.out.print("오름 차순 : ㄱ");
				String upSort = scan.nextLine();
				bv.viewBBs(true);
				System.out.println("내림 차순");
				String downSort = scan.nextLine();
				bv.viewBBs(false);
				
			}
		}
	}
}
