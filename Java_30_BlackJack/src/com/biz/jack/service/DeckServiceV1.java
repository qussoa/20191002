package com.biz.jack.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class DeckServiceV1 {

	List<DeckVO> deckList;
	String suit = "◆:♥:♠:♣";
	String[] arrSuit = new String[] { "◆", "♥", "♠", "♣" };
	String denomination = "A234567890KQJ";

	public DeckServiceV1() {
		this.deckList = new LinkedList<DeckVO>();
	}

	public List<DeckVO> getDeck() {
		int nSize = deckList.size();
		for (int i = 0; i < nSize; i++) {
			Collections.shuffle(deckList);
		}

		for (DeckVO vo : deckList) {
			Collections.shuffle(deckList);
		}
		return this.deckList;
	}

	public void makeDeck() {
		String[] denoms = denomination.split("");
		for (String suit : arrSuit) {
			for (String denom : denoms) {

				int intValue = 0;
				try {
					intValue = Integer.valueOf(denom);
					if (intValue == 0)
						intValue = 10;
				} catch (Exception e) {
					if (denom.equals("A"))
						intValue = 1;
					else
						intValue = 10;
				}
				DeckVO dVO = new DeckVO();
				dVO.setSuit(suit);
				dVO.setDenomination(denom);
				dVO.setValue(intValue);
				deckList.add(dVO);

			}
		}
	}

}
