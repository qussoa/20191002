package com.biz.single.service;

public class SafeSingleClassV1 {

	private static SafeSingleClassV1 myObject;
	
	private String name;
	private String nation;
	
	private SafeSingleClassV1() {
	}

	public static synchronized SafeSingleClassV1 getInstance() {
		if (myObject == null)
			myObject = new SafeSingleClassV1();
		return myObject;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setNation(String nation) {
		this.nation= nation;
	}
	public String getNation() {
		return this.nation;
	}
}
