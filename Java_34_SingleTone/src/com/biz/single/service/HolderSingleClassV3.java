package com.biz.single.service;

public class HolderSingleClassV3 {

	private HolderSingleClassV3() {
		
	}
	private static class InnerHolder{
		public static final HolderSingleClassV3 INSTANCE
		= new HolderSingleClassV3();
	}
	public static HolderSingleClassV3 getInstance() {
		return InnerHolder.INSTANCE;
	}
	public void viewName() {
		System.out.println("나는 싱글톤이다");
	}
}
