package com.biz.thread.classes;

public class LazyClassV1 {

	public int sum;
	
	public LazyClassV1() {
		
	}
	public static LazyClassV1 getInstance() {
		return LazyHolder.INSTANCE;
	}
	private static class LazyHolder{
		private static final LazyClassV1 INSTANCE = new LazyClassV1();
	}
}
