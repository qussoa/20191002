package com.biz.grade;

import java.util.Random;

public class Array_03 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0)
				System.out.printf("%d번째 %d\n", i, intNum[i]);

		}
		int intSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}
		System.out.println("짝수들의 합 :" + intSum);

	}
}
