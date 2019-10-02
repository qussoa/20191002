package com.biz.arrays;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		int[] nums = new int[100];
		Random rnd = new Random();
		int num = rnd.nextInt();
		for (int i = 0; i < nums.length; i++) {

			nums[i] = rnd.nextInt(10) + 1;

		}
		// 짝수와 홀수를 저장할 2개의 변수 선언, 초기화
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenSum += nums[i];
			} else {
				oddSum += nums[i];
			}

		}
		System.out.printf("짝수 값의 합 : %d, 홀수 값의 합 : %d\n " 
		                  + evenSum, oddSum);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);

			// 한줄에 원하는 개수 만큼 표시하고자 할때 응용가능한 코드
			// i 값이 1 이상이며 5의 배수이면 enter 줄바꿈, 그렇지 않으면 ", "
			if ((i + 1) % 20 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}

	}
}
