package com.biz.pay.domain;

public class PaperVO {

	private String paper;
	private int count;

	public PaperVO(String paper, int count) {
		super();
		this.paper = paper;
		this.count = count;
	}

	/*
	 * 기본생성자
	 */
	public PaperVO() {
	}

	/*
	 * 필드 생성자
	 * 필드 변수를 주입받아서 값을 설정한다
	 */
	@Override
	public String toString() {
		return "PaperVO [paper=" + paper + ", count=" + count + "]";
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
