package com.biz.jack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.utils.BlackJackUtills;

public class GameServiceV1 {
	DeckServiceV1 ds;
	List<DeckVO> deckList;
	Scanner scanner;

	public GameServiceV1() {
		ds = new DeckServiceV1();
		ds.makeDeck();
		deckList = ds.getDeck();
		scanner = new Scanner(System.in);
	}

	public boolean gameStart(String playerName) {

		System.out.println(BlackJackUtills.getStringLong("=", 100));
		System.out.println("Game Start");
		System.out.println(BlackJackUtills.getStringLong("=", 100));
		PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
		PlayerServiceV1 타짜 = new PlayerServiceV1(deckList, playerName);

		for (int i = 0; i < 2; i++) {
			딜러.hit();
			타짜.hit();
		}
		딜러.hit();

		while (true) {
			// if (타짜.sumValue() > 21) break;
			
			int 딜러점수 = 딜러.sumValue();
			int 타짜점수 = 타짜.sumValue();
			if (타짜점수 > 21) {
				System.out.println("딜러 승리");
				}
			if (딜러점수> 21) {
				System.out.println(playerName + "승리");
			
			}
			if(타짜점수>21 || 딜러점수>21) {
				System.out.println("아무키나 누르시오");
				scanner.nextLine();
				return false;
			}

			System.out.println("===========================");
			System.out.println("1.Hit 2.Stand 3.종료");
			System.out.println("---------------------------");
			System.out.print("선택 : ");
			String strM = scanner.nextLine();
			int intM = Integer.valueOf(strM);

			if (intM == 1) {
				딜러.hit();
				타짜.hit();
			} else {
				
				타짜점수 = 타짜.sumValue();
				딜러점수 = 딜러.sumValue();
				if (타짜.sumValue() == 딜러.sumValue()) {
					System.out.println("동점으로 딜러 승리");

				} else if (타짜.sumValue() > 딜러.sumValue()) {
					System.out.println(playerName + "승리");
				} else {
					System.out.println("딜러 승리");
				}
				System.out.println(BlackJackUtills.getStringLong("*", 100));
				System.out.println("딜러 점수 : " + 딜러.sumValue());
				System.out.println(playerName + " 점수 : " + 타짜.sumValue());
				System.out.println(BlackJackUtills.getStringLong("*", 100));
				if (intM == 2)
					return true;
				if (intM == 3)
					return false;

			}

		}
	}
}
