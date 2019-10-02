package com.biz.string.exec;

import java.util.Random;

public class StringEx_04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		String strS = "";
		
		int intS = 0;
		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			int rNum = rnd.nextInt();
			if (rNum < 0) {
				rNum *= (-1);
			};
			String strNum = rNum + "";
			int intNum = Integer.valueOf(strNum.substring(3,4));
			intSum += intNum;
		}
		System.out.println(intSum);
		
	}

}
