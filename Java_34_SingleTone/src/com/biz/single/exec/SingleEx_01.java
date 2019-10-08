package com.biz.single.exec;

import com.biz.single.service.SingleClassV1;

public class SingleEx_01 {
	public static void main(String[] args) {
		
		//SingleClassV1 sc = new SingleEx_01();
		SingleClassV1 sc1 = SingleClassV1.getInstance();
		SingleClassV1 sc2 = SingleClassV1.getInstance();
		SingleClassV1 sc3 = SingleClassV1.getInstance();
		
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
	}
}
