package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;

public class MethodEx_04 {
	public static void main(String[] args) {

		MakeListService ms = new MakeListService();
		ms.getListAll();
		List<Integer> intList = ms.getListAll();
	}
}
