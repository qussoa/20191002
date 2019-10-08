package com.biz.classes.exec;

public class ClassEx_01 {
	
	static String strName = "홍길동";
	
	public static void main(String[] args) {
		strName = "이몽룡";
		getName(strName);
		System.out.println(strName);
	}
	public static void getName(String strName) {
		strName = "성춘향";
	}
}
