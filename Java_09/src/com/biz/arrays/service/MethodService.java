package com.biz.arrays.service;

import java.util.Random;
import java.util.Scanner;

public class MethodService {

	private int intSum;
	
	/*
	 * method 정의할때 
	 * 1. 키워드 void가 있을 때 return을 생략해도 된다
	 * 2. 변수 선언 method에서는 (int, String, float, boolean, long, double, char, ScoreVO 등등) 
	 * 3. 변수를 선언하는 키워드 변수형(Variable type)
	 * 4. return type이라고 하며 return 문에 포함된 값과 밀접한 관계가 있다    
	 * 5. return문에서 데이터 타입을 method 정의 문과 일치해야한다   
	 */
	public void consoleView() {
		System.out.println("나는 콘솔에 표시하는 method()");
		return; 
	}
	
	
	public int numRet() {
		int num = 100  + 200 + 300;
		return 0;
	}
	
	public String strRet() {
		return "우리나라 만세"; //null;
	}
	
	public int getIntSum() {
		return intSum;
	}



	public int getsun() {
		int num = 30*40;
		System.out.println(num);
		return 0;	}
	
	public void add() {
		System.out.println("매개 변수가 없는 method");
	}

	public void add(int num) {
		System.out.printf("매개변수 1개 : %d\n", num);
	}

	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("두개의 매개변수 합 :  " + sum);
	}

	public void add(float f1, float f2) {
		float sum = f1 + f2;
		System.out.printf("두 실수의 합 : " , sum);
	}
	public void ex() {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
	}
	
}

