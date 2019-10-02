package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV2 extends WordQuizServiceV1 {

	WordVO wordVO;
	
	int nCount;
	public WordQuizServiceV2() {
		
		nCount = 0;
		
	}

	public void viewEngWord() {

		if(nCount > 0) {
			System.out.println();
			this.viewEngWord(wordVO);
			return;
		}
		Random rnd = new Random();
		int nSize = wordVOList.size();
		int index = rnd.nextInt(nSize);

		wordVO = wordVOList.get(index);
		
		//임시코드 
		System.out.println(wordVO.getEndWord());
		this.viewEngWord(wordVO);
		
	}//view end
	
	private void viewEngWord(WordVO wordVO) {
		String word = wordVO.getEndWord();
		List<String> words = Arrays.asList(word.split(""));

		Collections.shuffle(words);

		wordVO.setRndWord(words);

		// wordVOList.add(wordVO);

		System.out.println(words);

	}

	@Override
	public void quizExec() {
		Scanner scan = new Scanner(System.in);
System.out.println("-----------------------");
		System.out.print("단어 : ");
		
		String strScanword = scan.nextLine();
		if (wordVO.getEndWord().equals(strScanword)) {
			System.out.println("-----------------------");
			System.out.println("정답");
			System.out.println("시도횟수 : " + (nCount +1));
			nCount = 0;
		} else {
			System.out.println("-----------------------");
			System.out.println((nCount+1)+"번 땡");
			System.out.println("계속(Enter), 힌트보기(H)>>>>");
			String strH = scan.nextLine();
			if(strH.equals("H")) {
				System.out.println("-----------------------");
				System.out.println(wordVO.getKorMeans());
				System.out.println("-----------------------");
			}
			nCount++;
		}
		System.out.println(wordVO.getKorMeans());

	}
}
