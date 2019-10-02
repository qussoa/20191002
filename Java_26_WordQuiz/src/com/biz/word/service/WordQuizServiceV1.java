package com.biz.word.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV1 implements WordQuizService {

	List<WordVO> wordVOList;
	Random rnd;

	public WordQuizServiceV1() {
		wordVOList = new ArrayList<WordVO>();
		
	}
	public WordQuizServiceV1(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}
	public void setWordVOList(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}
	public void viewEngWord() {
		Random rnd = new Random();
		int nSize = wordVOList.size();
		
		int index = rnd.nextInt(nSize);
		
		WordVO wordVO = wordVOList.get(index);
		System.out.println(wordVO.getEndWord());
		
	
		
	}
	@Override
	public void quizExec() {
		
	}
}

