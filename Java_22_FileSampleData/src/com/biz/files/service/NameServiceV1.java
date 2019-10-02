package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NameServiceV1 implements NameService {

	FileReader fileReader;
	BufferedReader buffer;
	PrintWriter fileOut;

	protected List<String> fList;
	protected List<String> nList;

	public NameServiceV1() {
		fList = new ArrayList<String>();
		nList = new ArrayList<String>();
	}

	@Override
	public void readNameList(String nameFile) throws Exception {

		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;
			nList.add(reader);
			System.out.println(reader);
		}
		buffer.close();
		fileReader.close();

	}

	@Override
	public void readFamList(String famFile) throws Exception {

		fileReader = new FileReader(famFile);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] fam = reader.split(":");
			String s0 = fam[0];
			String s1 = fam[1];
			String s2 = fam[2];

			String[] first = fam[1].split("");
			fList.add(first[0]);
			System.out.println(first[0]);

		}
		buffer.close();
		fileReader.close();

	}

	@Override
	public void writeNameFile(String korNameFile) throws Exception {

		Collections.shuffle(nList);
		Collections.shuffle(fList);

		int nameSize = nList.size();
		int famSize = fList.size();

		PrintWriter fileOut = new PrintWriter(korNameFile);

		String strName = "";

		for (int i = 0; i < 100; i++) {
			strName = fList.get(i) + nList.get(i);
			System.out.println(strName);
			fileOut.println(strName);
		}

		System.out.println("===============================");
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			strName = fList.get(rnd.nextInt(famSize));
			strName += nList.get(rnd.nextInt(nameSize));
			System.out.println(strName);
			fileOut.println(strName);
		}
		fileOut.close();

	}

}
