package com.biz.single;

import java.util.Scanner;

public class ScannerEx_01 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		String str1 = scan1.nextLine();
		scan1.close();
		
		
		System.out.print("문자 입력 : ");
		String str2 = scan1.nextLine();
		
		System.out.print("문자 입력 : ");
		String str3 = scan1.nextLine();
	}
}
