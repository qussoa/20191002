package com.biz.thread.exec;

import com.biz.thread.classes.LazyClassV1;

public class LazyEx_01 {
	
	public static LazyClassV1 lc = LazyClassV1.getInstance();
	
	public static void main(String[] args) {
		
		lc.sum = 0;
		for(int i = 0; i<=100 ; i++) {
			lc.sum += i;
		}
		System.out.println(lc.sum);
		
	}
}
