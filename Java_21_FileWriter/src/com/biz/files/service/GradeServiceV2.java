package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeServiceV2 extends GradeServiceV1 {

	protected List<String> nameList = null;

	public GradeServiceV2() {
		nameList = new ArrayList<String>();
	}

	@Override
	public void readNameFile(String nameFile) throws Exception {

		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;
			nameList.add(reader);
		} // while end
		buffer.close();
		fileReader.close();
		this.nameList();

	}

	private void nameList() {
		for (String s : nameList) {
		//	System.out.println(s);
		}
	}

	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {
		
		Random rnd = new Random();
		
		PrintWriter fileOut;
		
		fileOut = new PrintWriter(studentFile);
		
		int num = 0;
		for (num = 0; num < length; num++) {
			String strNum = String.format("A%03d", num + 1);
			int tel1st = rnd.nextInt(9999)+1;
			int tel2nd = rnd.nextInt(9999)+1;
			
			String strTel = String.format("010-%04d-%04d", tel1st,tel2nd);
			
			int intYear= rnd.nextInt(100)+1980;
			int intMonth = rnd.nextInt(12)+1;
			int intDay = rnd.nextInt(28)+1;
			
			String strBirth = String.format("1993-%02d-%02d",
					intMonth,intDay);
			
			System.out.printf("%s\t%s\t%s\t%s\n", strNum, nameList.get(num),strTel,strBirth);
			fileOut.printf("%s:%s:%s:%s\n", strNum, nameList.get(num),strTel,strBirth);
			fileOut.flush();
		}
		fileOut.close();
	}

}
