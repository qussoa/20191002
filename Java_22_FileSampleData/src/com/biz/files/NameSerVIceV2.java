package com.biz.files;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.biz.files.service.NameServiceV1;

public class NameSerVIceV2 extends NameServiceV1{

	List<String> korNameList;
	
	public NameSerVIceV2() {
		korNameList = new ArrayList<String>();
		korNameList = new LinkedList<String>();
		
	}
	@Override
	public void writeNameFile(String korNameFile) throws Exception {
		
		Random rnd = new Random();
		int nameSize = nList.size();
		int famSize = fList.size();
		System.out.println("=================================");
		System.out.printf("이름표 작성 시작: %d\n",System.currentTimeMillis());
		for(int i = 0; i <1000; i++) {
			String strName = fList.get(rnd.nextInt(famSize));
			strName += nList.get(rnd.nextInt(nameSize));
			korNameList.add(strName);
		}
		System.out.println("---------------------------");
		System.out.printf("list작성완료 : %d\n", System.currentTimeMillis());
			Collections.sort(korNameList);
		System.out.println("---------------------------");
		System.out.printf("정렬완료 : %d\n",System.currentTimeMillis());
		
		PrintWriter fileOut = new PrintWriter(korNameFile);
		for(String s : korNameList) {
			fileOut.println(s);
		}
		fileOut.close();
		System.out.println("---------------------------");
		System.out.printf("모두완료 : %d\n",System.currentTimeMillis());
	}

}
