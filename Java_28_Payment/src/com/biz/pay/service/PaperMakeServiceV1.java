package com.biz.pay.service;

import java.awt.print.Paper;
import java.io.PrintWriter;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV1 {

	PrintWriter fileOut;
	
	
	public void paper(int pay, int paper) {

		
		
		int sw = 1;

		while (true) {

			if (pay < 5)
				break;
			int count = (int) (pay / paper);
			pay = pay - count * paper;
			System.out.printf("%8s 원권 %4d매\n", count, paper);
			if (sw > 0) {
				count /= 5;
			} else {
				count /= 2;
			}
			sw *= (-1);
		}
	}
}
