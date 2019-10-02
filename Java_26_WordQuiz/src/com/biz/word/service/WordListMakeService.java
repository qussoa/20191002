package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.word.domain.WordVO;

public class WordListMakeService {

	protected List<String> wordStrList;
	protected List<WordVO> wordVOList;

	/*
	 * wordFileName 파일을 열어서 문자열을 읽어 들인 다음 
	 * 단어 : 의미 형식의 문자열을 생성한 다음 wordStrList에 담자
	 */
	
	public List<String> getWordStrList() {
		return wordStrList;
	}

	public List<WordVO> getWordvoList() {
		return wordVOList;
	}

	public void MakeWordList(String wordFileName) throws Exception {

		wordStrList = new ArrayList<String>();
		wordVOList = new ArrayList<WordVO>();
		
		FileReader fileReader = new FileReader(wordFileName);
		BufferedReader buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();

			if (reader == null)
				break;

			String[] word = reader.split(":");

			String words = String.format("%s:%s", word[1], word[2]);
			wordStrList.add(words);

			WordVO wordVO = new WordVO();
			wordVO.setEndWord(word[1]);
			wordVO.setKorMeans(word[2]);
			wordVOList.add(wordVO);
		}
		buffer.close();
		fileReader.close();
	}

}
