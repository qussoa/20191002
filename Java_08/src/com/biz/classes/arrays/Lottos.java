package com.biz.classes.arrays;

import java.util.Random;

public class Lottos {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] lottos = new int[6];

		int nLottoIndex = 0;

		while (true) {
			int lotNum = rnd.nextInt(45) + 1;
			int index;
			for (index = 0; index < lottos.length; index++) {

				// lottos 배열에 저장된 값이 새로 생성한 값과 같은 것이 있는가
				if (lottos[index] == lotNum)
					break;
			}
			// 같은 값이 없다
			if (index >= lottos.length)
				// nLottoIndex 위치에 새로운 값을 채워라
				lottos[nLottoIndex++] = lotNum;

			if (nLottoIndex >= lottos.length)
				break;
		}
		System.out.print("행운의 로또 번호 : ");
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " : ");
		}
	}
}
