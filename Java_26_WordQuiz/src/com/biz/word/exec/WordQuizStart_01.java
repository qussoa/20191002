package com.biz.word.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV2;

public class WordQuizStart_01 {

	public static void main(String[] args) {
		
		WordListMakeService wk = new WordListMakeService();
		WordQuizService wq = new WordQuizServiceV2();
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		
		Scanner scan = new Scanner(System.in);
		
		try {
			wk.MakeWordList(wordFileName);
			List<WordVO> wordVOList = wk.getWordvoList();
			wq.setWordVOList(wordVOList);
			while(true) {
				System.out.println("======================");
				System.out.println("행복나라 영어정복 v1");
				System.out.println("======================");
				
				wq.viewEngWord();
				wq.quizExec();
				
				System.out.println("아무키나 누르세요....종료(-0)");
				String strKey = scan.nextLine();
				if(strKey.equals("-0"))break;
				
				
				
				
			}
			System.out.println("Game Over");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
