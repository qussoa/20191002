package com.biz.list.service;
/*
 * interface class
 * 1. method를 정의하는 문장만 있다
 * 2. 실제 작동되는 코드가 한 줄도 없다
 * 3. 코드를 작성하는 {}이 없다
 * 4. 혼자는 아무런 기능도 수행하지 않는다
 * 
 * 5. 다른 클래스를 작성하는데 설계도 역할을 한다
 * 6. interface를  implement한 클래스는 정의된 method를 반드시 구현해야한다
 */
public interface GradeService {

	  
	public void input(int size);
	public void total();	
	public void view();
}