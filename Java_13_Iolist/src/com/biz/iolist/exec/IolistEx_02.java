package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV2;

public class IolistEx_02 {

	public static void main(String[] args) {

		IolistService ioService = new IolistServiceImpV2();
		
		ioService.input(5);
		ioService.total();
		ioService.list();
		
	}

}
