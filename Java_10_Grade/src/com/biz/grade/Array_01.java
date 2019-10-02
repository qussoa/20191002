package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		Random rnd = new Random();

		int intSum = 0;
		int intAvg = 0;

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			System.out.println(intNum[i]);

			intSum += intNum[i];
			intAvg = intSum / intNum.length;
		}

		System.out.printf("%d\t", intSum);
		System.out.printf("%d\n", intAvg);

	}

}
