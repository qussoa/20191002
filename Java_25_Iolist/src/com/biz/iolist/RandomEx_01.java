package com.biz.iolist;

public class RandomEx_01 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			double rnd1 = Math.random();
			System.out.println(rnd1);
		}
		
		int start = 10;
		int end = 55;
		for(int i = 0; i < 10; i++) {
			double rnd1 = Math.random();
			
			//start~end 까지 범위의 임의의 수를 맹글어라
			int num = (int)(rnd1 * (end- start+1)+start);
			System.out.println(rnd1);
		}

	}
}
