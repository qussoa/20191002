package com.biz.word.exec;

import java.util.List;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV1;
import com.biz.word.service.WordQuizServiceV2;

public class WordEx_02 {
	public static void main(String[] args) {
		
		WordListMakeService ws = new WordListMakeService();
		WordQuizService wq = new WordQuizServiceV1();
		wq = new WordQuizServiceV2();
		
		String wordFileName = "src/com/biz/word/필수어휘.txt";

		try {
			ws.MakeWordList(wordFileName);
			List<String> wordStrList = ws.getWordStrList();
			List<WordVO> wordVOList = ws.getWordvoList();
			//wq.setWordVOList(wordVOList);
			//wq.viewEngWord();
			
			wq.setWordVOList(wordVOList);
			wq.viewEngWord();
			wq.quizExec();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
