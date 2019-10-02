package com.biz.var;

public class Var_10 {

	public static void main(String[] args) {

		int num = 10;
		
		num = num + 20;
		num += 20; //복합 대입 연산자
		
		num += 20; // num = num + 20;
		num -= 30; // num = num - 20;
		num *= 55; // num = num * 20;
		num /= 15; // num = num / 20;
		num %= 22; // num = num % 20;
		
		System.out.println(num);
		
		
	}

}
