package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;
import com.biz.method.service.ViewListService;

public class MethodEx_06 {
	public static void main(String[] args) {
		
		MakeListService ms = new MakeListService();
	
		List<Integer> aList = ms.getListAll(25);
		
		ViewListService vs = new ViewListService();
		int aa = vs.setListAllAndView(aList);
		System.out.println("AA : "+aa);
	}
}
