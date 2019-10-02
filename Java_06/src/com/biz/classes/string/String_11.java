package com.biz.classes.string;

/*
 * 코드를 시작할 때 다른 용도로 활용할 것을 염두에 두고 하드 코딩하는 것보다
 * 변수를 활용하라
 */
public class String_11 {

	public static void main(String[] args) {

	    int nCount = 0;
	    int intMax = 1000;
	    int intMul = 21; // 배수
	    int intSearch = 5;
	    
		for(int i = 1; i < intMax  ; i ++) {
			if(i % intMul == 0) nCount ++;
			if(nCount == intSearch) {
				System.out.println(i); 
		        break;
	
			}}
	
	}
	

}
