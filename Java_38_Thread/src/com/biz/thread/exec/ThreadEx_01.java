package com.biz.thread.exec;

import java.util.Scanner;

import com.biz.thread.classes.RunThreadV1;
/*
 * 프로세스
 * 한 개의 컴퓨터에서 작동되는 프로그램들
 * (ex: hwp, excel, 음악 등)
 * 
 * multiprocess, tasking
 * 프로세스가 동시에 작동되는 환경
 * 
 * multithread
 * 한개의 process  내부에서 작은 단위의 일들을 분할하고
 * 이들을 동시에 작동하도록 하는 환경
 * 
 * 키보드에서 무언가 입력을 하도록 기다리면서
 * 또다른 한편으로 1부터 100까지 덧셈을 수행하여 콘솔에 보이도록 하고 싶다
 */
public class ThreadEx_01 {
	public static void main(String[] args) {

		RunThreadV1 rt = new RunThreadV1();
		rt.start();

		Scanner scan = new Scanner(System.in);
		System.out.print("아무키나 입력 : ");
		
		// blocking 
		// 코드가 실행되는 동안 어떤 부분에서 더이상 진행하지 못하고
		// 멈추어서 사용자의 입력을 기다리는 상태
		String strAny = scan.nextLine();
		
		System.out.println("입력한 글자" + strAny);
		Integer.valueOf(strAny);
	}
}
