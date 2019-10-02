package com.biz.files;

import com.biz.files.service.NameService;
import com.biz.files.service.NameServiceV1;

/*
 * 이름리스트.txt와 성씨리스트.txt를 읽어서 리스트를 만들고
 * 두 리스트의 값들을 임의 조합하여 
 * 3글자의 한국사람 이름을 생성하고 
 * 한국인 이름.txt파일로 저장하시오
 * 1. 한문제외 
 * 2. 한국인이름 리스트 100
 * 3. 랜덤배열
 * 4. service 클래스 사용
 */
public class NameEx_01 {
	public static void main(String[] args) {
		
		NameService ns = new NameServiceV1();
		
		String nameFile = "src/com/biz/files/이름리스트.txt";
		String famFile = "src/com/biz/files/성씨리스트.txt";
		String korNameFile = "src/com/biz/files/한국이름리스트.txt";
		
		try {
			ns.readNameList(nameFile);
			ns.readFamList(famFile);
			ns.writeNameFile(korNameFile);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
