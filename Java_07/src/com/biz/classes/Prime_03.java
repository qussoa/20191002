package com.biz.classes;


public class Prime_03 {

	public static void main(String[] args) {

		for(int i =2; i <= 100000000; i++) {
			int index;
			for(index =2; index<i ; index++) {
				if(i%index == 0) break;
			}
			if (index >= i)
				System.out.println("Prime : " + i);
		}
		
	}

}
