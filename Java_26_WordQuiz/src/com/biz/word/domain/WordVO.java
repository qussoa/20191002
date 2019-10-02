package com.biz.word.domain;

import java.util.List;

public class WordVO {

	private String endWord;
	private String korMeans;
	
	private List<String> rndWord;

	public String getEndWord() {
		return endWord;
	}

	public void setEndWord(String endWord) {
		this.endWord = endWord;
	}

	public String getKorMeans() {
		return korMeans;
	}

	public void setKorMeans(String korMeans) {
		this.korMeans = korMeans;
	}

	public List<String> getRndWord() {
		return rndWord;
	}

	public void setRndWord(List<String> rndWord) {
		this.rndWord = rndWord;
	}

	
	
	
	
}
