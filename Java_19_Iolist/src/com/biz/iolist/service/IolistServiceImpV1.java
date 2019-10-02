package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV1 implements IolistService {



	@Override
	public void read(String fileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		String reader = new String();

		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] name = reader.split(":");
			
			
		System.out.println(reader);
		} // while end
		buffer.close();
		fileReader.close();
	}// read end

	@Override
	public void list() {
	
	}

	@Override
	public void summany() {
		// TODO Auto-generated method stub

	}

}
