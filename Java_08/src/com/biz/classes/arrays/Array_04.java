package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
		}
		System.out.print("숫자 : ");
		String strNum = scanner.nextLine();
		int sNum = Integer.valueOf(strNum);
		int index;
		for (index = 0; index < nums.length; index++) {
			if (nums[index] == sNum)
				break;

		}
		if (index >= nums.length)
			System.out.printf("배열에 %d 값이 없음\n", sNum);
		else
			System.out.printf("찾음 \n" + "배열의 %d 번째에 값이 있음\n", (index+1));

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] +", ");
		}

	}
}
