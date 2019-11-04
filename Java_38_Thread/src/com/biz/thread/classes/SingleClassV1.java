package com.biz.thread.classes;

public class SingleClassV1 {

	private static SingleClassV1 singleClassV1

	public static int sum;

	static {
		if (singleClassV1 == null) {
			singleClassV1 = new SingleClassV1();
		}
	}

	public static SingleClassV1 getInstance() {
		return singleClassV1;
	}
}
