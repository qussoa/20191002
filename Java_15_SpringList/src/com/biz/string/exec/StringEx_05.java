package com.biz.string.exec;

import java.util.Random;

public class StringEx_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

				
		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			int rNum = rnd.nextInt();
			if (rNum < 0) {
				rNum *= (-1);
			};
			String strNum = rNum + "";
			String[] strNums = strNum.split(""); 
			int intNum = Integer.valueOf(strNums[3]);
			intSum += intNum;
		}
		System.out.println(intSum);
		
	}

}
