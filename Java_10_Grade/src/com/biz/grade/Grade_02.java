package com.biz.grade;

import java.util.Scanner;

public class Grade_02 {

	/*
	 * 멤버 변수 영역에 선언된 변수들은 종류, type에 관계없이 현재 클래스에 선언된 모든 method에서 접근 가능하다 어떤 method에서
	 * 멤버변수의 값을 저장하면 다른 method 에서 값을 읽어 연산 가능
	 * 
	 * 멤버변수 접근제한자 public 아무런 제한없이 멤버변수에 접근가능 private 현재 클래스에 있는 method만 접근 가능
	 * 
	 * main() method가 있으면 모든 멤버변수에 static을 붙이면 main() method에 접근 가능
	 * 
	 */

// static 선언	
	private static int[] intKor;
	private static Scanner scan;

	public static void main(String[] args) {

// 배열 생성
		int[] intKor = new int[5];
		scan = new Scanner(System.in);
		for (int i = 0; i < intKor.length; i++) {
			input(i);
		}

	}

	public static void input(int index) {
		System.out.println("국어점수 : ");
		String strKor = scan.nextLine();
		intKor[index] = Integer.valueOf(strKor);
	}

}
