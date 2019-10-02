package com.biz.string.exec;

public class StringEx_03 {

	/*
	 * 역순으로 표기하라
	 */
	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		String strS = "";
		String[] strS1 = strNation.split("");
		for(int i = strS1.length -1 ; i>-1 ;i-- ) {
			strS += strS1[i];
			
		}System.out.println(strS);
		
	}

}
