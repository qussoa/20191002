package com.biz.classes.arrays;

public class Array_01 {
	
	public static void main(String[] args) {
		
	      
	      // 문자열 저장할 메모리 10개를 준비하라
		
	      String[] str = new String[10];
	      
	      // 배열의 요소를 지정하는 방법
	      // 배열[Index] 형식으로 지정
	      // index"(배열)첨자"라고 부른다
	      // array index라고 부른다
	      // 배열의 요수 (0,1,2)에 값을 저장
	      str[0] = "대한민국";
	      str[1] = "우리나라";
	      str[2] = "Republic of Korea";
	      
	      // 배열의 요수 1번째 위치의 값을 읽어서 console보이기
	      System.out.println(str[1]);
	      /*
	       * str 배열을 10개 선언하였으므로
	       * index 0~9까지만 사용할 수 있다
	       * 10번 index 배열요소를 console보이라는 명령을 내리면 
	       * ArrayIndexOutOf....exception이 발생한다 
	       */
	      System.out.println(str[10]);
	      
	      // 정수값을 저장할 메모리 10개를 준비하라
	      int[] intNum = new int[10];
	      intNum[0] = 10;
	      intNum[1] = 30;
	      intNum[2] = 40;
	      intNum[3] = 100;
	      
	      
	      
	      // 실수값을 저장할 메모리 10개를 준비하라
	      float[] fNmu = new float[10];
		
	}

}
