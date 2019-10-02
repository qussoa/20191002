package com.biz.classes;

import java.util.Scanner;

public class PrimeService {

	public void checkPrime(int num) {

		int index;
		for (index = 2; index < num; index++) {
			if (num % index == 0)
				break;

		}

		if (index >= num) {
			System.out.println(num + "는 소수이다");
		}
		 else {
			System.out.println(num + "는 소수가 아니다");
		}

	}

}
