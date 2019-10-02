package com.biz.pay.exec;

public class PayEx_01 {

	public static void main(String[] args) {

		int money = 3758750;
		int num = 50000;
		int sw = 1;
		
		while(true) {
			
			if(money < 5) break;
			int Count = (int)(money / num);
			money = money - num * Count;
			System.out.printf("%8s 원권 %4d매\n", num,Count);
			if(sw > 0) {
				num /= 5;
			}else {
				num /= 2;
			}
			sw *= (-1);
		}
		

	}

}
