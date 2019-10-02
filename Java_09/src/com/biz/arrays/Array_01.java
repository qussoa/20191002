package com.biz.arrays;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] nums = new int[100];
		Random rnd = new Random();
		int num = rnd.nextInt();
		for (int i = 0; i < nums.length; i++) {

			nums[i] = rnd.nextInt(10) + 1;

		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				sum += nums[i];
			}

		}
		System.out.println("짝수 값의 합 : " + sum);
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
