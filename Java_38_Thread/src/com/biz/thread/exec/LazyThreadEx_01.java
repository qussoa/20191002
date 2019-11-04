package com.biz.thread.exec;

import com.biz.thread.classes.LazyClassV1;

public class LazyThreadEx_01 extends Thread{

	
	@Override
	public void run() {
		
		LazyThreadEx_01 lt = new LazyThreadEx_01();
		lt.start();
		
		LazyClassV1 lc = LazyClassV1.getInstance();
		lc.sum = 0;
		for(int i = 0; i<=100 ; i++) {
			lc.sum += i;
		}
		System.out.println(lc.sum);
		}
}
