package com.biz.grade;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		int[] intKor = new int[5];
		int[] intEng = new int[5];
		
		Random rnd = new Random();
		
		int intKsum = 0;
		int intEsum = 0;
		System.out.println("========================");
		System.out.print("  Kor\t  Eng\n");
		System.out.println("-----------------------");
		for(int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(100)+1;
			intEng[i] = rnd.nextInt(100)+1;
		System.out.println(intKor[i]+"\t"+intEng[i]);
			intKsum += intKor[i];
			intEsum += intEng[i];
		}
		System.out.println("-----------------------");
		System.out.printf("%d\t", intKsum);
		System.out.printf("%d\n", intEsum);
		System.out.println("========================");
		
	}

	
}
