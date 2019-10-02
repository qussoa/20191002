package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV3 {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;

	private int[] sum;
	private int[] avg;
	private Scanner scan;

	public GradeServiceV3(int length) {

		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];

		sum = new int[length];

		scan = new Scanner(System.in);

	}

	public void input() {
		for (int i = 0; i < intKor.length; i++) {
			this.inputKor(i);
			this.inputEng(i);
			this.inputMath(i);
			
			this.total(i);
		}

	}

	private void inputKor(int index) {
		System.out.print((index + 1) + "번 국어 : ");

		this.intKor[index] = Integer.valueOf(scan.nextLine());

	}

	private void inputEng(int index) {
		System.out.print((index + 1) + "번 영어 : ");

		int intEng = Integer.valueOf(scan.nextLine());
		this.intEng[index] = intEng;
	}

	private void inputMath(int index) {
		System.out.print((index + 1) + "번 수학 : ");

		String strMath = scan.nextLine();
		int intMath = Integer.valueOf(strMath);
		this.intMath[index] = intMath;

	}

	private void total(int index) {
		int intTotal = this.intKor[index];
		intTotal += this.intEng[index];
		intTotal += this.intMath[index];

		this.sum[index] = intTotal;
		this.avg[index] = intTotal/3;
	}
	

	public void view() {
		System.out.println("============================");
		System.out.println("성적일람표");
		System.out.println("----------------------------");
		System.out.printf("국어\t 수학\t 영어\t총점\n");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\t%d\n", intKor[i], intEng[i], intMath[i], sum[i]);
		}
		System.out.println("============================");
	}

	public void sort() {
		for (int i = 0; i < sum.length; i++) {
			for (int j = i + 1; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					
					int _temp = sum[i];
					sum[i] = sum[j];
					sum[j] = _temp;
					
					_temp = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _temp;
					
					_temp = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _temp;
					
					_temp = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _temp;
				}
			}
		}
	}
}
