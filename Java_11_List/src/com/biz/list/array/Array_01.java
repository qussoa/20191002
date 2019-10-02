package com.biz.list.array;

public class Array_01 {
	public static void main(String[] args) {
		/*
		 * list 데이터의 묶음(숫자 리스트 ,문자리스트 등)
		 */

		// 숫자 리스트를 순서대로 표현하는 방법

		// 5~22까지 숫자를 console에 나열하고 싶다

		for (int i = 5; i <= 22; i++) {
			System.out.println(i);
		}
		
		// 배열을 이용
		
		// 1.배열 선언
		int[] nums = new int[100];
		// 2. 배열 요소 선언
		nums[0] = 5;
		nums[1] = 6;
		nums[2] = 7;
		nums[10] = 22;
		nums[77] = 1000;
		
		//배열 표시
		System.out.println(nums[99]);
		System.out.println(nums[77]);
		System.out.println(nums[2]);
		
		// 배열 덧셈
		int sum = nums[1] + nums[10] + nums[55] + nums[88];
		
		//다른값 저장 가능
		nums[1] = 99;
		nums[88] =91;
		
		// 배열 요소 랜덤값 연산 수행
		
		for(int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
		sum = sum + nums[i]; // sum += nums[i]
		}
	}
}
