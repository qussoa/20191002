package com.biz.loop;

public class Loop_02 {

	public static void main(String[] args) {

		int nCount = 2;
		
		
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		System.out.printf("%d x %d = %d\n",6, nCount, nCount++ * 6);
		
		int nDan = 6;
		System.out.printf("%d x %d = %d\n", 
				nDan, nCount, nCount++ * nDan);
		System.out.printf("%d x %d = %d\n", 
				nDan, nCount, nCount++ * nDan);
	}
}
