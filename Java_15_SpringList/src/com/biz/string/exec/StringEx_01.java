package com.biz.string.exec;

public class StringEx_01 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		//strNation 담긴 문자열을 알파벳단위로 잘라서
		// strS1 배열에 담아라
		String[] strS1 = strNation.split("");
		
		for(String s : strS1) {
			System.out.println(s);
		}
		// strNation에 담긴 문자열을 
		// space 기준으로 잘라서 strS2에 담아라
		String[] strS2 = strNation.split(" ");
		System.out.println("0 : "+strS2[0]);
		System.out.println("1 : "+strS2[1]);
		System.out.println("2 : "+strS2[2]);
		
		//오류 발생시 무시
		try {
			System.out.println("3 : "+strS2[3]);	
		} catch (Exception e) {
				//코드없음
				// exception 발생시 무시
		}
		
		try {
			System.out.println("3 : "+strS2[3]);
		} catch (Exception e) {
		// try{} 내의 실행되는 과정에서 exception 발생시 JVM에서 catch(e){}으로
		// 	exception정보를 전달하며 변수 e의 정보를 가지고 있다
		// e 변수의 printStackTrace() 는 단순히 console에 오류를 발생하는지 보여준다
			e.printStackTrace();
		}
	}

}
