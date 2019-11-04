package com.biz.thread.classes;
/*
 * main() method의 흐름과 별도로 background에서 작동하도록 구성할 class
 * 
 * 1. background 별도의 thread로 작동하기 위해 thread class 상속받아
 *    class를 작성한다
 */
public class RunThreadV1 extends Thread {

	@Override
	public void run() {
	 long sum = 0;
	 for(long i =1; i<= 100000000000L; i++) {
		 sum += i;
	 }
	 System.out.println("\n덧셈 수행 결과 : " + sum);
	}

	
}
