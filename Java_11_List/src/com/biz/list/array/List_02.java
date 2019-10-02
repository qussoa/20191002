package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_02 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();

		Random rnd = new Random();

		for (int i = 0; i < 55; i++) {

			// 임의 숫사
			int rNum = rnd.nextInt();
			// 리스트 추가
			nums.add(rNum);

		}
		// 30번요소의 값을 num 변수에 복사 
		int num = nums.get(30);
		System.out.println(num);
		
		for(int i = 0; i < 55; i++) {
			System.out.println(nums.get(i));
		}
		System.out.println(nums.get(55));
	}
}
