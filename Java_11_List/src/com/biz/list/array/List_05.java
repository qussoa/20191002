package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for( int i = 0; i < 67; i++) {
			nums.add(rnd.nextInt());
		}
		int nSize = nums.size();
		for(int i =0; i < nSize; i++) {
			System.out.println(nums.get(i));
		}
		// nums개수만큼 반복문을 실행하면서 getter하여  n변수에 담아둔다
		// 확장 for , for Each
		// 이 코드는 nums가 Collection일때 사용할수 있음
		// 전체 리스트를 읽어서 연산을 수행할때 사용가능
		for(int n : nums) {
			System.out.println(n);
		}
		int sum = 0;
		for(int n : nums) {
			sum+= n;
		}
		System.out.println("합계 : " + sum);
		for(int n: nums) {
			int index;
			for(index = 2; index< n ; index++) {
				if(n%index == 0)break;
				}
			if(index>=n) {
				System.out.println(n+ " 소수이다");
			}
		}
	}

}
