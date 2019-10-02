package com.biz.list.array;

import java.util.Random;

public class Prime_01 {

	/*
	 * 50개의 정수형 배열을 생성하고 각 요소 1~100까지 랜덤 수를 저장하고 그 수가 소수인지 확인하라
	 */
	public static void main(String[] args) {

		int[] nums = new int[50];
		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
			System.out.printf("%4d", nums[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}
			// 소수 찾기
	
			for(int i = 0; i<nums.length;i++)
				int r = nums[i];
			if(r < 2) {
				continue;
			}
			int j;
				for(int j = 2; j < r; j++) {
					if (r % j == 0)
						break;
					}	
	if(j>=r){
		System.out.println(i + ": 번째 소수" + r);
	}else{

	}
}
}