package com.biz.thread.exec;

import java.util.Scanner;

import com.biz.thread.classes.Run_01;

public class ThreadEx_02 {
	public static void main(String[] args) {

	Runnable r1 = new Run_01();
	Thread t1 = new Thread(r1);

	Runnable r2 = new Run_01();
	Thread t2 = new Thread(r2);
	Scanner scan = new Scanner(System.in);
	
	t1.start();
	t2.start();
	
	System.out.println("문자열을 입력 : ");
	String str = scan.nextLine();
	}
}
