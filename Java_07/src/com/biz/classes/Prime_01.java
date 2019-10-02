package com.biz.classes;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		/*
		 * 어떤 수(num) 중 소수의 리스트를 구하라
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 : ");
		String strNum = scanner.nextLine();

		int num = Integer.valueOf(strNum);

		int index;
		for (index = 2; index < num; index++) {
			if (num % index == 0)
				break;

		}
		// index의 값은
		// System.out.println(index); //13

		if (index >= num) {
			System.out.println(num + "는 소수이다");

		} else {
			System.out.println(num + "는 소수가 아니다");
		}

	}

}
