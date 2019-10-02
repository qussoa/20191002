package com.biz.string;

import com.biz.string.service.StringService;
import com.biz.string.service.StringServiceImpV1;

public class String_01 {

	public static void main(String[] args) {

		StringService strService = new StringServiceImpV1();
		strService.input();
		strService.view();
		strService.list();	
		
		
	}

}
