package com.biz.arrays.exec;

import com.biz.arrays.service.MethodService;

public class MethodEx_01 {

	public static void main(String[] args) {

		// MethodService 정의된 method()를 호출하기 위해 ms라고 객체를 선언 초기화 생성한다
		MethodService ms = new MethodService();
		
		//호출 only -> void형 method() 호출만 가능
		
		
		ms.consoleView();
		
		// int형 return method
		// 저장값을 자유롭게 활용가능
		int num = ms.numRet();
		System.out.println("numRet가 return 한 값 : " + num);
		
		// return한 값은 기억장소에 저장된 값을 읽는 것과 같다
	    int num1 = ms.numRet() + 200;
	    System.out.println(num1);
	    
	    String strRet = ms.strRet();
	    String strRet1 = ms.numRet()+ "";
	    String strRet2 = ms.numRet() + ms.strRet();
	}

}
