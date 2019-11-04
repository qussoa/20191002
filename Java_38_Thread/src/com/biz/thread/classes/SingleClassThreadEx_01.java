package com.biz.thread.classes;

public class SingleClassThreadEx_01 extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		SingleClassV1 sc = SingleClassV1.getInstance();
		sc.sum = 0;
		for(int i =1; i <100;i++) {
			sc.sum += i;
		}
		System.out.println("main에서 계산한결과" + sc.sum);

	}
}
