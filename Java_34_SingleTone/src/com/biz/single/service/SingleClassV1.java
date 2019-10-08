package com.biz.single.service;

public class SingleClassV1 {

	private static SingleClassV1 myObject = new SingleClassV1();
	
	private SingleClassV1() {
		 
	}
	public static SingleClassV1 getInstance() {
		return myObject;
	}
}
