package com.biz.grade.service;

import java.util.Scanner;

public class GradeService {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;

	private int[] sum;
	private Scanner scan;

	// 생성자 만들기
	// method 이름 class이름과 같게

	public GradeService(int length) {

		// 4개의 멤버변수를 사용할 수 있도록 생성하는 일 수행
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];

		sum = new int[length];

		scan = new Scanner(System.in);

	}// GradeService() End

	// 배열의 개수만큼 점수 입력
	public void input() {
		for (int i = 0; i < intKor.length; i++) {
			System.out.print((i + 1) + "번 국어 : ");
			// String strKor = scan.nextLine();
			// int intKor = Integer.valueof(strKor);
			// 1번
			this.intKor[i] = Integer.valueOf(scan.nextLine());
		    System.out.print((i + 1) + "번 영어 : ");
			// 2번		
		    int intEng = Integer.valueOf(scan.nextLine());
			this.intEng[i] = intEng;
			System.out.print((i + 1) + "번 수학 : ");
			
			//3번
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);
			this.intMath[i] = intMath;
			
		}

	}
	
	public void view() {
		System.out.println("============================");
		System.out.println("성적일람표");
		System.out.println("----------------------------");
		System.out.printf("국어\t 수학\t 영어\n");
		for(int i =0; i < intKor.length; i++) {
			
			System.out.printf("%d\t%d\t%d\n",
					intKor[i],intEng[i],intMath[i]);
		}
		System.out.println("============================");
	}
}
