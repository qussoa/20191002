package com.biz.list.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List interface의 활용
 * ArrayList, LinkedList는
 */
public class List_06 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		List<Integer> nums = new LinkedList<Integer>();
		
		// ---------------------------------------------------------
		// ArrayList의 기능 활용하여 연산을 수행하는 기능
		// 유용한 코드이고 어떤 오류나 문제가 없는 코드라고 가정할 떄 
		nums.add(100);
		nums.add(100);
		nums.add(100);
		
		int total = nums.get(0)+ nums.get(1)+nums.get(2);
		
	}
}
