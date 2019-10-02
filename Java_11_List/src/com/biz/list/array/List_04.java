package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {
			nums.add(rnd.nextInt());
		}
		// list.size()
		// 추가된 리스트의 개수 알려주는 method
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		int numsSize = nums.size();
		for (int i = 0; i < numsSize; i++) {
			System.out.println(nums.get(i));
		}
		/*
		 *  list 개수만큼 반복문을 실행시킬때 1번 코드는  for 반복문이 실행된 횟수만 큼
		 *  list.size() 메서드 호출 반복 수행
		 *  
		 *  2번 코드는 for 반복문을 미리 개수를 계산 후 변수 값을 읽어 반복문을 수행
		 *  리스트의 개수가 많아지만 많아질수록 좀 더 효율적인 코드
		 */
	}

}
