package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {

	private static int[] intKor;
	private static Scanner scan;

	public static void main(String[] args) {

		intKor = new int[5];
		scan = new Scanner(System.in);
		for (int i = 0; i < intKor.length; i++) {
			input(i);
		}
		//
		for (int i = 0; i < intKor.length; i++) {
			view(i);
		}
		view(intKor);
	}

	// index번째 배열 국어
	public static void input(int index) {
		System.out.print((index + 1) + "번의 국어 : ");
		String strKor = scan.nextLine();
		intKor[index] = Integer.valueOf(strKor);
	}

	// intKor 배열전체 표시
	public static void view(int index) {
		System.out.println((index + 1) + "번 국어 : " + intKor[index]);

	}

	public static void view (int[] intKor) {
		for (int i = 0; i < intKor.length; i++) {
			System.out.println((i+1)+"번 국어 :"+ intKor[i]); 
	}
	}}
