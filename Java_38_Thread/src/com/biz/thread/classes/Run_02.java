package com.biz.thread.classes;

public class Run_02 implements Runnable{

	@Override
	public void run() {
		
	     long start = 1;
	     long end = 100000000000L;
		 String sum = "";
		 for(long i =1; i<= end; i++) {
			 sum += (int)(Math.random()*100) +"\n";
		 
		}
		 System.out.println(sum);
	}

}
