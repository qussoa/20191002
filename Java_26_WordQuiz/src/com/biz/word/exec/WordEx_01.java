package com.biz.word.exec;

import java.util.List;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizServiceV1;

public class WordEx_01 {

	public static void main(String[] args) {

		WordListMakeService ws = new WordListMakeService();
		WordQuizServiceV1 wq = new WordQuizServiceV1();
		
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		
		try {
			ws.MakeWordList(wordFileName);
			List<String> wordStrList = ws.getWordStrList();
			List<WordVO> wordVOList= ws.getWordvoList();
			wq.viewEngWord();
			for(WordVO vo : wordVOList) {
				System.out.print(vo.getEndWord() + "\n");
			//	System.out.println(vo.getKorMeans());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
