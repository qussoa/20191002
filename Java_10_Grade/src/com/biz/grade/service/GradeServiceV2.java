package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV2 {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;

	private int[] sum;
	private Scanner scan;

	public GradeServiceV2(int length) {

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

	// 총점 점수 기준 내림차순 정렬
	public void sort() {
		for (int i = 0; i < sum.length; i++) {
			for (int j = i + 1; j < sum.length; j++) {
				// 내림차순 정렬
				if (sum[i] < sum[j]) {
					int _temp = sum[i];
					sum[i] = sum[j];
					sum[j] = _temp;
				}
			}
		}
	}
}
