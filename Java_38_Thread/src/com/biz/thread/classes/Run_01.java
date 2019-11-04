package com.biz.thread.classes;

public class Run_01 implements Runnable{

	@Override
	public void run() {
		
	     long start = 1;
	     long end = 100000000000L;
		 long sum = 0;
		 for(long i =1; i <= end; i++) {
			 sum += i;
		 }
		 System.out.printf("\n %d ~ %d 덧셈 수행 결과 : %d " + start,end,sum);
		
	}

}
