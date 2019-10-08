package com.biz.classes.service.parents;

public abstract class RemoconABSV1 {

	protected String name;
	public RemoconABSV1() {
		this.name = "나는 리모콘입니다";
	}
	public void power() {
		System.out.println(name);
	}
	public abstract void volUp();
	public abstract void volDown();
	public abstract void ChUp();
	public abstract void ChDown();
}
